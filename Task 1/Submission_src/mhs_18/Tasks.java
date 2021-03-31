package Class;

import java.util.Scanner;

public class Tasks {
Scanner masukan = new Scanner(System.in);
    
    public void Percabangan() {
        int angka = masukan.nextInt();
        
        if(angka != 0)
            System.out.println("Angka != 0");
        
        else
            System.out.println("Angka = 0");
    }
    
    public void Con() {
        float angka = masukan.nextFloat();
        
        System.out.println((int)angka);
    }
    
    public void Looping() {
        int angka[] = new int[100], counter = 0, total = 0;
        
        do {
            angka[counter] = masukan.nextInt();
            total += angka[counter];
            counter++;
        } while(counter < 10);
        
        System.out.println(total);
    }
    
    public void Switcher() {
        int angka = masukan.nextInt();
        
        switch(angka) {
            case 1 :
                System.out.println("Angka = 1");
                break;
                
            case 2 :
                System.out.println("Angka = 2");
                break;
                
            case 3 :
                System.out.println("Angka = 3");
                break;
                
            default :
                System.out.println("Angka");
                break;
        }
    }
}

