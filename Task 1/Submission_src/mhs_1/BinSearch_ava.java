package main;
import java.util.*;

import calc.calculation;
public class BinSearch_ava extends calculation
{
    public static void main(String[] args)
    {
        calculation calcu = new calculation();
        //scanner
        Scanner input = new Scanner(System.in);
        System.out.println("input total data");
        int data = input.nextInt();
        
        int[] num = new int[data];
        System.out.println("input "+data+" element");

        for (int i = 0; i< num.length; i++)
            num[i] = input.nextInt();

        System.out.print("search number: ");
        int search = input.nextInt();
        input.close();
        Arrays.sort(num);
        int index = calcu.bin_search(num, search);
        double Ave = calcu.average(num, data);
        //if else
        if (index != -1){
            //switch
            switch (index) {
                case 0:
                    System.out.println("Found in index "+index);
                    break;
                case 1:
                    System.out.println("Found in index " + index+" st");
                    break;
                case 2:
                    System.out.println("Found in index " + index+" nd");
                    break;
                case 3:
                    System.out.println("Found in index " + index+" rd");
                    break;  
                default:
                    System.out.println("Found in index " + index+" th");
                    break;
            }    
        }
        else
            System.out.println("Data not found base on binary search");

        //varible convert
        System.out.println("with average = "+(int)Ave+" or "+Ave+" for more precise");
    }
    //do while were in calc package
}