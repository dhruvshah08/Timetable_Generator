/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruvshah619
 * This class would consist of the information related to a particular subject!
 */
public class Subject {
    String subject_name;
    String teacherName;
    int lecturesPerWeek;
    boolean practical,lecture;
    Subject(String subject_name,String teacherName,int lecturesPerWeek,boolean lecture,boolean pratical){
        this.teacherName=teacherName;
        this.subject_name=subject_name;
        this.lecturesPerWeek=lecturesPerWeek;
        this.lecture=lecture;
        this.practical=pratical;
    }
    public String getSubjectName(){
        return this.subject_name;
    }
    public String getTeacherName(){
        return this.teacherName;
    }
    public int getLecturesPerWeek(){
        return this.lecturesPerWeek;
    }
    public boolean hasLecture(){
        return this.lecture;
    }
    public boolean hasPractical(){
        return this.practical;
    }
}
