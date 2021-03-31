package secondary;
import java.util.Scanner;

public class fungsiutama {
Scanner input = new Scanner(System.in);
    
    public void Scanner() {
        int angka = input.nextInt();
        
        if(angka != 0)
            System.out.println("Angka != 0");
        
        else
            System.out.println("Angka = 0");
    }
    
    public void Convert() {
        float angka = input.nextFloat();
        
        System.out.println((int)angka);
    }
    
    public void Looping() {
        int angka[] = new int[100], counter = 0, total = 0;
        
        do {
            angka[counter] = input.nextInt();
            total += angka[counter];
            counter++;
        } while(counter < 10);
        
        System.out.println(total);
    }
    
    public void Switching() {
        int angka = input.nextInt();
        
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
