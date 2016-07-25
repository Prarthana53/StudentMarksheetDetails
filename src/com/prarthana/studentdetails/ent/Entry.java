/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.studentdetails.ent;

import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class Entry {
    
    Scanner sc = new Scanner(System.in);
    
    String result = "";
    double[] sum = new double[5];
    double[] avg = new double[5];
    String [] students= new String[5];
    String [] subjects= new String[5];
    double[][] marks = new double[5][5];
    int scount=1;

    public Entry() {
    }

    public Entry(String[] students, String[] subjects, double[][] marks) {
        this.students = students;
        this.subjects = subjects;
        this.marks = marks;

    }

    public void enterStudents() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of Student: ");
            students[i] = sc.next();
            scount++;
            if(scount>5)
                
            {
                System.out.println("Total Students= "+scount);
            }
        }
    }

    public void enterSubjects() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of Subject: ");
            subjects[i] = sc.next();
        }
    }

    public void enterMarks() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter marks: ");
            
                marks[i][j] = sc.nextDouble();
                if (marks[i][j] < 32) {
                    result = "fail";
                }
                sum[i] = sum[i] + marks[i][j];
            }
            if (result.equals("fail")) {
                System.out.println("You have failed!!");
            } else {
                avg[i] = sum[i] / 5;
                System.out.println("Percentage: " + avg[i]);
                if (avg[i] >= 80) {
                    System.out.println("Distinction ^_^");
                } else if (avg[i] >= 60 && avg[i] < 80) {
                    System.out.println("First Division !!!");
                }else if (avg[i]>= 45 && avg[i] < 60  ) {
                    System.out.println("Second Division !! ");
                } else if (avg[i]>= 32  && avg[i]< 45  ) {
                    System.out.println("Third Division ! ");
                }
            }
        }
    }
}
    

