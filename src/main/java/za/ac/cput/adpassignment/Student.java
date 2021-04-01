/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment;

/**
 *
 * @author Ammaar
 */
public class Student {
    private static String StudentName;
    private static int StudentGender;
    private static String StudentRace;

    public static String getStudentName() {
        return StudentName;
    }

    public static void setStudentName(String StudentName) {
        Student.StudentName = StudentName;
    }

    public static int getStudentGender() {
        return StudentGender;
    }

    public static void setStudentGender(int StudentGender) {
        Student.StudentGender = StudentGender;
    }

    public static String getStudentRace() {
        return StudentRace;
    }

    public static void setStudentRace(String StudentRace) {
        Student.StudentRace = StudentRace;
    }

    @Override
    public String toString() {
        return "Student{}";
    }
    
}
