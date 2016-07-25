/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.studentdetails;

import com.prarthana.studentdetails.ent.Entry;
import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
         
       while(true){
         
         
         System.out.println(" Students Marksheet Details"+"\n");
         System.out.println(" 1. Enter Students ");
         System.out.println(" 2. Enter Subjects ");
         System.out.println(" 3. Enter Marks ");
         System.out.println(" 4. Exit");
         System.out.println("Enter your choice[1-4]: ");
         int  select=sc.nextInt();
         Entry entry= new Entry();
    
         switch(select){
             
             case 1:{ 
                 
                 entry.enterStudents();
             break;
                 
         
         
         }
         case 2:{ 
                 
                 entry.enterSubjects();
             break;
                 
         
         
         }
         case 3:{ 
                 
                 entry.enterMarks();
             break;
                 
         
         
         }
         case 4:{ 
                 
                System.exit(0);
                break;
         
         
         }
         }
         System.out.println("Do you want to continue[Y/N]?");
            String str=sc.next();
            if(str.equalsIgnoreCase("n")){
                System.exit(0);
            }
       } 
        
    
    }
    public static void marksheet(){
       Entry entry = new Entry();
    
        
    entry.enterMarks();
    entry.enterStudents();
    entry.enterSubjects();
    
    }
    


            
    
}
