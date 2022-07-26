package lekcja9;

public class zadanie95 {
    public static void main(String[] args) {
        for(int i =0; i<=20;i=i+2){
            System.out.println(i+"for");
        }
        int a =2;
        while(a<=20){

            System.out.println(a+" while");
            a=a+2;
        }
        a=2;
        do{

            System.out.println(a+" do while");
            a=a+2;
        }while(a<=20);
    }
}
