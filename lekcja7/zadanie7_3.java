package lekcja7;

public class zadanie7_3 {
    public static void main(String[] args) {
        int a =1;
        int b= 2;
        if((a==0)&&(b==0))
        {
            System.out.println("bok a oraz bok b maja wartośąć 0");
        }
        else if((a==0)||(b==0)||(a<0)||(b<0)){
            System.out.println("złe wartości");
        }
        else 
        {
            
            System.out.println("pole wynosi= "+(a*b));
        }
    }
}
