package com.project1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input Your Score: ");

        Float Grade = scan.nextFloat();

        System.out.printf("\n");

        if ( Grade < 41 && Grade >= 0)
        {
            System.out.println("Grade : E" );
        }

        else if ( Grade < 56 && Grade >= 41)
        {
            System.out.println("Grade : D" );
        }

        else if ( Grade < 61 && Grade >= 56)
        {
            System.out.println("Grade : C" );
        }

        else if ( Grade < 66 && Grade >= 61)
        {
            System.out.println("Grade : BC" );
        }

        else if ( Grade < 76 && Grade >= 76)
        {
            System.out.println("Grade : B" );
        }

        else if ( Grade < 86 && Grade >= 76)
        {
            System.out.println("Grade : AB" );
        }

        else if ( Grade <= 100 && Grade >= 86)
        {
            System.out.println("Grade : A" );
        }

        else
        {
            System.out.println("ERROR");
        }





    }
}
