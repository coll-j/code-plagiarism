package calc;
public class calculation {
    public int bin_search(int[] search, int find){
        int start = 0, midle;
        int len = search.length;
        //do while
        do{
            midle = (start + len) / 2;
            if (search[midle] == find)
                return midle;
            else if (search[midle] < find)
                start = midle + 1;
            else
                len = midle - 1;
        }while (start <= len);
        return -1;
    }
    public double average(int[] arrDat,int len){
        double ave,sum=0;
        for(int elem : arrDat)  
            sum+=elem;
        ave = sum / len;
        return ave;  
    }
}
