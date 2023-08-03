
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruvshah619
 * information of teacher
 * would hold a map of timetable of the week so accordingly the timetable would be decided!
 */
public class Teacher {
    String teacherName,gender,age,contact_number,qualifications;
    Map<String,String> mapOfTeacherTT=new TreeMap<>();
    Teacher(String teacherName,String gender,String age,String contact_number,String qualifications){
        this.teacherName=teacherName;
        this.gender=gender;
        this.age=age;
        this.contact_number=contact_number;
        this.qualifications=qualifications;
    }
    public Map<String,String> getMapOfTeacherTT(){
        return new TreeMap<>(this.mapOfTeacherTT);
    }
    public void addIntoTT(String key,String value){
        //KEY->DAY+LECNOs
        //VALUE->BRANCH+SUBJ
        this.mapOfTeacherTT.put(key,value);
//        System.out.println(value+" allocated at :" +key+" in teacher!");
        //code to add the value into the TT
    }
    public boolean isSlotFull(String key){
        return this.mapOfTeacherTT.containsKey(key);
    }
    public String getAllotment(String key){
        return this.mapOfTeacherTT.get(key);
    }
    public String getTeacherName(){
        return this.teacherName;
    }
    public String getGender(){
        return this.gender;
    }
    public String getAge(){
        return this.age;
    }
    public String getContactNumber(){
        return this.contact_number;
    }
    public String getQualifications(){
        return this.qualifications;
    }
}
//now the functionality must be added here where a function would be created which would check in the hashmap if the given date/time (key) is there 
//or not..return time boolean...if true,then add into the dd array else already booked!
