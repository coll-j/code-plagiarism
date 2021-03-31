package tugasjava1;

public class task1 {
    public char huruf(int nilai){
        char grade=' ';
        if(nilai>90 && nilai<=100)
                grade='A';
            else if (nilai>70 && nilai<=90)
                grade='B';
            else if (nilai>50 && nilai<=70)
                grade='C';
            else if (nilai>1 && nilai <=50)
                grade='D';
   return grade;
            }
}
