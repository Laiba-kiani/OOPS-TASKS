/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.department;

/**
 *
 * @author abc
 */
import java.util.Scanner;
public class Department {
    private String departmentName;
    private String departmenthead;
    
    // constructor with parameters
     Department(String name,String head){
        this.departmentName=name;
         this.departmenthead=head;
    }
    //copy constructor 
 Department(Department all)
{
    this.departmentName=all.departmentName;
         this.departmenthead=all.departmenthead;
}
 public void display(){
        System.out.println("Departmentname"+departmentName);
        System.out.println("Departmenthead"+departmenthead);
    }
    public static void main(String[] args) {
        Scanner scanstring=new Scanner(System.in);
        
        System.out.println("Enter name");
        String name=scanstring.nextLine();
        System.out.println("Enter Departmenthead");
        String head=scanstring.nextLine();
        
                Department dept1=new Department(name,head);

       
        dept1.display();
        // copy constructor
                Department dept2=new Department(dept1);

       
        dept2.display();
        
        
        
    }
}
