package lekcja10;

public class zadanie10_3 {
    public static void main(String[] args) {
     int[] tab= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //wyswietlenie liczb od 1 do 20
       //a
       System.out.print("a ->  ");
        for (int i =0 ; i<20;i++){ System.out.print(tab[i]+" ");}
        //b
        System.out.print("\nb ->  ");
        etykieta1:
        for(int i=0;i<20;i++){ 
            if(tab[i]%3==0){ 
                System.out.print(tab[i]+" ");
                continue etykieta1;
            }
        }
        //c
        System.out.print("\nc -> ");
        
        for(int j =0;j<20;j++){
            etykieta2:
            for(int i=3;i<4;i++){ 
                if(tab[j]%i==0){ 
                    System.out.print(tab[j]+" ");
                    break etykieta2;
                }
            }
        }
    }
}
