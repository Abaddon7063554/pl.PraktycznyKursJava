package lekcja7;

public class zadanie7_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 1,b=2, c=3 ;
        int  delta=(b*b)-(4*a*c);
        if(delta == 0) 
            System.out.println("ma jedno rozwiazanie");
        else if (delta>0)
            System.out.println("ma  dwa rozwiazania i znajduje sie w zbiorze liczb rzeczywistych");
        else 
            System.out.println("nie ma rozwiazania i nie znajduje sie w zboorze liczb rzeczywistych ");
        
    }
}
