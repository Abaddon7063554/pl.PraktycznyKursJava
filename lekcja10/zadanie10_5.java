package lekcja10;

public class zadanie10_5 {
    public static void main(String[] args) {
        
    
    for(int i = 1 ; i<=100 ;i++){
        if((i%4==0)&&(i%8!=0)&&(i%10!=0))
        {
            System.out.println("liczba podzielna przez 4 , nie podzielna przez 8 i 10 to ="+i);
        }
    }
}
}
