package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean is_veg = true;
        System.out.println(is_veg);
        int x = -5;
        boolean is_x_positive = x > 0;
        char letter = 'A';

        // y = 7
        // *7
        // + 12
        // - 20
        int y = 9;
        int z = y * 7;
        // 1. calculate a value using variable
        // 2. put the results into the same variable
        y = y * 7; // 9 * 7 = 63 ==> y
        int x1 = 1;
        // put into x1 <== x1 plus 1
        x1 = x1 + 1;

        // define y1 as -8
        int y1 = -8;
        // put in y1 <== y1 * 2
        y1 = y1 * 2;
        // put in y1 <== y1 / 4
        y1 = y1 / 4;
        // put in y1 <== y1 * -1  *etgar
        y1 = y1 * -1;
        // define z1 as 4.0
        double z1 = 4.0;
        // put in z1 <== y1 * y1
        z1 = y1 * y1;
        // put in z1 <== z1 + y1
        z1 = z1 + y1;
        // put in z1 <== z1 + 12
        z1 = z1 + 12;
        // print y1
        System.out.println("y1: " + y1);
        // print z1
        System.out.println("z1: " + z1);

        x1 = x1 + 1;
        x1++; // x1 = x1 + 1;
        x1--; // x1 = x1 - 1;
        x1 = x1 * 2;
        x1 *= 2; // x1 = x1 * 2;
        x1 += 1; // x1 = x1 + 1; // x1++;

        int number_of_people_in_restaurant = 0;
        number_of_people_in_restaurant += 5;
        number_of_people_in_restaurant = number_of_people_in_restaurant + 25;
        number_of_people_in_restaurant = number_of_people_in_restaurant + 12;
        number_of_people_in_restaurant++;
        number_of_people_in_restaurant--;
        number_of_people_in_restaurant--;


        int s1 = 1;
        // use short syntax
        // increase s1 by 1
        // s1 = s1 + 1; // same
        s1++;
        //++s1;  //same
        // multiply s1 by 10 (put result in s1)
        s1 *= 10;
        // div s1 by 3 (put result in s1)
        s1 /= 3;
        // minus s1 by 2 (put result in s1)
        s1 -= 2; // s1 = s1 - 2

    }
}
