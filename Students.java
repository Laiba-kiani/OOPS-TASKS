/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.students;

/**
 *
 * @author abc
 */
import java.util.Scanner;
public class Students {
    private String name;
    public String department;
    private int rollNo;
    Students()
    {
        System.out.println("Default constructor");
    }
    public void display(){
        System.out.println("Name"+name);
        System.out.println("Department"+department);
        System.out.println("Rollno"+rollNo);
    }
    public static void main(String[] args) {
        Students record1=new Students();
        Scanner scanstring=new Scanner(System.in);
        Scanner scanint=new Scanner(System.in);
        System.out.println("Enter name");
        record1.name=scanstring.nextLine();
        System.out.println("Enter Department");
        record1.department=scanstring.nextLine();
        System.out.println("Enter Rollno");
        record1.rollNo=scanint.nextInt();
        record1.display();
        Students record2=new Students();
        
        System.out.println("Enter name");
        record2.name=scanstring.nextLine();
        System.out.println("Enter Department");
        record2.department=scanstring.nextLine();
        System.out.println("Enter Rollno");
        record2.rollNo=scanint.nextInt();
        record2.display();
        
    }
}
