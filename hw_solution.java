package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // black vs gray
        // "" vs without
        // dynamic
        
        // int short byte float double String boolean
        String id = "1234567890";
        String full_name = "Donal Duck";
        String address = "Disneyland!";
        String details = id + " " + full_name + " " + address;
        System.out.println("details: " + details);

        Scanner s = new Scanner(System.in); // chinese
        System.out.print("-- Enter your first name: ");
        String fname = s.nextLine(); // dynamic
        System.out.print("-- Enter your last name: ");
        String lname = s.nextLine(); // dynamic
        System.out.println("Your full name is " + fname + " " + lname);

    }
}
