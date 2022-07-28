package lekcja9;

public class zadanie9_3 {
    public static void main(String[] args){
        int i = 1 ,a;
        while(i++<21){
            a=(i%3==0)? 0:1;
            if(a==0){
                System.out.println(i);
            }
        }
    }
    
}
