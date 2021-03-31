
import java.util.Scanner;
import tugasjava1.task1;
public class App {
    public static void main(String[] args) {

        task1 check=new task1();
        Scanner in = new Scanner(System.in);
        String choice;
        do {
            System.out.println("input grade for");
            int nilai= in.nextInt();
            
        double nilaiDou = nilai;
        nilaiDou/=10;
        System.out.println("scale in 1 to 10 is = "+nilaiDou);
        char grading = check.huruf(nilai);
        switch (grading){ 
        case 'A': 
            System.out.println("congratulations!");
            break;
        case 'B':
            System.out.println("Good Job!");
            break;
        case 'C':
            System.out.println("Try Harder");
            break;
        case 'D':
            System.out.println("You Failed");
            break;
        default:
            System.out.println("Wrong Input");
            break;
        }
        System.out.println("Do u wish to continue?(yes/no)");
       choice = in.next();
      //  if (Objects.equals(choice, "no")==true)
        //    break;
       // else
         //   continue;
        } while ("yes".equals(choice));
    }
}