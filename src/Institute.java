
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruvshah619
 * This class would consist of a set of branches and a set of teachers
 * accepts the institute name and the no of working days!
 * methods provided to add,get teachers and branches!
 */
public class Institute {
    private static String instituteName;
    private static int no0fWorkingDays;
    private static Set<Branch> branches=new HashSet<>();
    private static Set<Teacher> teachers=new HashSet<>();
    Institute(String instituteName,int no0fWorkingDays){
        this.instituteName=instituteName;
        this.no0fWorkingDays=no0fWorkingDays;
    }
    public static String getInstituteName(){
        return instituteName;
    }
    public static int getNumberOfWorkingDays(){
        return no0fWorkingDays;
    }
    public static void addBranch(Branch branch){
        branches.add(branch);
    }
    public static Branch getBranchByName(String selectedBranch){
        for(Branch branch:branches){
            if(selectedBranch.equals(branch.getBranchName())){
                return branch;
            }
        }
        return null;
    }
    public static Teacher getTeacherByName(String teacherName){
        for(Teacher teacher:teachers){
            if(teacherName.equals(teacher.getTeacherName())){
                return teacher;
            }
        }
        return null;
    }
    public static Set<Branch> getHashSetOfBranches(){
        return new HashSet<Branch>(branches);
    }
    public static void printAllBranches(){
        for(Branch branch:branches){
            System.out.println(branch.getBranchName());
        }
    }
    public static void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public static Set<Teacher> getHashSetOfTeachers(){
        return new HashSet<Teacher>(teachers);
    }
    public static void printAllTeachers(){
        for(Teacher teacher:teachers){
            System.out.println(teacher.getTeacherName());
        }
    }
    public static Teacher[] arrayOfTeachersSet(){
        return teachers.toArray(new Teacher[teachers.size()]);
    }
        
}
//would consist of a list of branches and teachers!
