package com.example.LombokDemo.Demo1;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
/**
 *@NoArgsConstructor -> empty constructor
 * @llArgsConstructor -> params constructor
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class StudentLombok {
    private @Getter @Setter Integer studentID;
    private @Getter @Setter String studentName;
    private @Getter @Setter String studentClass;
    private @Getter @Setter String studentEmailID;
    private @Getter @Setter boolean studentPassed;
    private @Getter @Setter float studentMark;

    public static void main(String [] args){
        StudentLombok studentLombok = new StudentLombok();

        studentLombok.setStudentPassed(true);
        studentLombok.isStudentPassed();



    }



}
