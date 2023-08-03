
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruv
 */
public class TimeTableGeneratingThread implements Runnable{
    String branchName;
//    String[][] arrTimeTable=new String[6][Institute.getNumberOfWorkingDays()];
    Branch branch;
    Set<Subject> setOfSubjects;
    Subject subjectObj;
    Teacher teacher;
    final List<String> listOfConstants;
    public TimeTableGeneratingThread(String branchName) {
        this.branchName=branchName;//obtained the name of the branch here!
        branch=Institute.getBranchByName(branchName);//now,we've obtained the object of branch
        setOfSubjects=new HashSet<>(branch.getSetOfSubjects());//now,we've obtained the set of subjects here!
        listOfConstants=new ArrayList<>(initialisingSetOfConstants());
    }
    @Override
    public void run(){
        System.out.println(branchName+" Branch TimeTable: ");
        generation();
    }
    private List<String> initialisingSetOfConstants(){
        List<String> days=new ArrayList<>();
        List<String> listOfConst=new ArrayList<>();
        days.add(Days.MON);days.add(Days.TUES);days.add(Days.WED);days.add(Days.THURS);days.add(Days.FRI);
        if(Institute.getNumberOfWorkingDays()==6)
            days.add(Days.SAT); 
        for(String day:days){
            for(int dayNo=1;dayNo<=6;dayNo++){
                listOfConst.add(day+" - "+dayNo);
            }
        }
        return listOfConst;
    }
    private void generation(){
        //now we've to iterate over the set of subjects 
        for(Subject subject:setOfSubjects){
            String chosenAllotment;
//            System.out.println(subject.getSubjectName());//obtaining names properly as well!
            initialising(subject.getSubjectName());
            int lecturesPerWeek=subject.getLecturesPerWeek();//got the amount of lecs per week
            if(lecturesPerWeek==Institute.getNumberOfWorkingDays()){
                //assigning one each day!
                for(int i=0;i<Institute.getNumberOfWorkingDays();i++){   
                    do{
                        int lectNoOnADay=ThreadLocalRandom.current().nextInt((i*6),(i+1)*6);
                        chosenAllotment=this.listOfConstants.get(lectNoOnADay);
                    }
                    while(teacher.isSlotFull(chosenAllotment) || branch.isSlotFull(chosenAllotment)) ;
                    teacher.addIntoTT(chosenAllotment, branchName+" - "+subject.getSubjectName());
                    branch.addAllotment(chosenAllotment, subject);
                }
            }
            else if(lecturesPerWeek<Institute.getNumberOfWorkingDays()){
                //assigning it randomly
                do{
                    do{
                        //this randomDay must not be same!
                        int randomDay=ThreadLocalRandom.current().nextInt(0,Institute.getNumberOfWorkingDays());
                        int lectNo=ThreadLocalRandom.current().nextInt((randomDay*6),(randomDay+1)*6);
                        chosenAllotment=this.listOfConstants.get(lectNo);
                    }while(teacher.isSlotFull(chosenAllotment) || branch.isSlotFull(chosenAllotment)) ;
                    teacher.addIntoTT(chosenAllotment, branchName+" - "+subject.getSubjectName());
                    branch.addAllotment(chosenAllotment, subject);
                    lecturesPerWeek--;
                }while(lecturesPerWeek>0);
            //we need to randomise the days in which lecture would take place however the same logic is to be followed for the lectOnDaya
            }
            else{
                //if more then first add it one on each day and then add it randomly
                for(int i=0;i<Institute.getNumberOfWorkingDays();i++){
                    do{
                        int lectNoOnADay=ThreadLocalRandom.current().nextInt((i*6),(i+1)*6);
                        chosenAllotment=this.listOfConstants.get(lectNoOnADay);
                    }
                    while(teacher.isSlotFull(chosenAllotment) || branch.isSlotFull(chosenAllotment)) ;
                    teacher.addIntoTT(chosenAllotment, branchName+" - "+subject.getSubjectName());
                    branch.addAllotment(chosenAllotment, subject);
                }
                lecturesPerWeek=lecturesPerWeek-Institute.getNumberOfWorkingDays();
                do{
                    do{
                        int randomDay=ThreadLocalRandom.current().nextInt(0,Institute.getNumberOfWorkingDays());
                        int lectNo=ThreadLocalRandom.current().nextInt((randomDay*6),(randomDay+1)*6);
                        chosenAllotment=this.listOfConstants.get(lectNo);
                    }while(teacher.isSlotFull(chosenAllotment) || branch.isSlotFull(chosenAllotment)) ;
                    teacher.addIntoTT(chosenAllotment, branchName+" - "+subject.getSubjectName());
                    branch.addAllotment(chosenAllotment, subject);
                    lecturesPerWeek--;
                }while(lecturesPerWeek>0);
                //if its greater then,first you need to allot one every day and then randomly then add the remaining items left
            }
            //also check in the branch TT if its free!
            //now do the function of setting up the TT
            //first make sure that the teacher is free at that time so,
            //take the subjects one by one and then obtain its teachers name, with name obtain teacher object
            //teachers object will give you their hashmap and there check if there is no entry at that time and day on which
            //subject would be added into!
            //if not there,then add it into the double dimensional array!
            
        }
    }
    private void initialising(String subjectName){
        subjectObj=branch.findSubjectByName(subjectName);
        teacher=Institute.getTeacherByName(subjectObj.getTeacherName());
    }
}
/*

*/