/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.emailapp;

/**
 *
 * @author atirek
 */
import java.util.*;
public class Email {
    private String first_name;
    private String last_name;
    private String password;
    private String department;
    private int default_mail_box_capacity=500;
    private String alternate_email;
    private int password_length=10;
    private String email;
    private String company_suffix="xyz.com";
    //constructor
    public Email(String first_name, String last_name){
        this.first_name=first_name;
        this.last_name=last_name;
        System.out.println("Email created: "+this.first_name+" "+this.last_name);
        //call a method:asking for department
        this.department=setDepartment();
        System.out.println("Department: "+this.department);
        //call a method for random passwords
        this.password=randomPassword(password_length);
        System.out.println("Your password is: "+this.password);
        //combine elements to generate email
        email=first_name.toLowerCase()+"."+last_name.toUpperCase() + "@"+ department +"."+company_suffix;
        System.out.println("Your mail is: "+email);
    }
    // ask for department
    private String setDepartment(){
        System.out.print("Department code: t\n1 for sales\n2 for accounting\n3 for development\n4 for none\nEnter Department codes: ");
        Scanner in= new Scanner(System.in);
        int depchoice=in.nextInt();
        if(depchoice==1)    return "sales";
        else if(depchoice==2)   return "accounting";
        else if(depchoice==3)   return "development";
        else    return "";
    }
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()";
        char[] password= new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set the mailbox capacity
    public void setmailcapacity(int capacity){
        this.default_mail_box_capacity=capacity;
    }
    //set alternate email
     public void setternateemail(String altemail){
        this.alternate_email= altemail;
    }
     
    //change password
     public void changepoassword(String password){
         this.password=password;
    }
    
     public int getmailboxcapacity(){
    return default_mail_box_capacity;
    }
     
}
