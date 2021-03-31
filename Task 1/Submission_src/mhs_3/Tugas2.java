package com.project2.OOP;


import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        System.out.println("What program you want to acces?\n1.Variable Conversion (Integer to Byte)\n2.Switch Function\n3.Do-While Funtion\n0.Exit Program");

        Scanner isi = new Scanner(System.in);
        int pp,segitiga;
            int Input = isi.nextInt();


            if (Input == 1) {
                System.out.print("Input integer Value : ");
                int input2 = isi.nextInt();
                byte convers = (byte) input2;
                System.out.println("Value for the number in byte is : " + convers);


            }

        else if( Input == 2) {
            System.out.print("This switch program works to calculate Area either triangle or rectangle\n1.Triangle\n2.Rectangle\n");
            int input3 = isi.nextInt();
            switch (input3) {
                case '1':
                    System.out.println("Input Length and Width");
                    int lebar = isi.nextInt();
                    int panjang = isi.nextInt();
                    pp = lebar * panjang;
                    System.out.printf("Area of rectangle is : %d", pp);
                    break;
                default:
                    System.out.println("Input Length and Height");
                    int tinggi = isi.nextInt();
                    int lebar2 = isi.nextInt();
                    segitiga = (tinggi * lebar2) / 2;
                    System.out.printf("Area of triangle is : %d\n", segitiga);
            }
        }

            else if(Input == 3) {

                System.out.print("This do-while program will count starting from 0 until the boundaries that set by user\nInput Boundaries : ");
                int Input2 = isi.nextInt();
                int x = 0;
                do {

                    System.out.printf("%d\n", x);
                    x++;


                }
                while (x <= Input2);
            }

            else if (Input == 0)
            {

            }


    }
}


