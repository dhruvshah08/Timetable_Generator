
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruvshah619
 */
public class Branch {
    private Set<Subject> subjects=new HashSet<>();
    private Map<String,Subject> timetable=new TreeMap<>();
    String branchName,HOD;
    Branch(String branchName,String HOD){
        this.branchName=branchName;
        this.HOD=HOD;
    }
    public String getBranchName(){
        return this.branchName;
    }
    public String getHOD(){
        return this.HOD;
    }
    public void addAllotment(String key,Subject subject){
        //KEY->DAY+LECNO
        //VALUE->subject
        this.timetable.put(key,subject);
    }
    public boolean isSlotFull(String key){
        return this.timetable.containsKey(key);
    } 
    public Subject getSubjectByKey(String key){
        return this.timetable.get(key);
    }
    public Map<String,Subject> getTimeTable(){
        return new TreeMap<>(this.timetable);
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public Set getSetOfSubjects(){
        return new HashSet<>(this.subjects);
    }
    public Subject findSubjectByName(String name){
        for(Subject subject:subjects){
            if(name.equals(subject.getSubjectName())){
                return subject;
            }
        }
        return null;
    }
    public void printAllSubjects(){
        for(Subject subject:subjects){
            System.out.println(subject.getSubjectName());
        }
    }
    public void printTimeTable(){
        int count=0;
        for(Map.Entry<String,Subject> entry:timetable.entrySet()){
            count+=1;
            System.out.println(entry.getKey()+" -> "+entry.getValue().getSubjectName()+" by "+ entry.getValue().getTeacherName());
        }
        System.out.println("Total number of entries : "+count);
    }
    //Sort the map by key!
    
}
//here each branch would consist of subjects and thus,would consist of a set holding list of all the subjects!