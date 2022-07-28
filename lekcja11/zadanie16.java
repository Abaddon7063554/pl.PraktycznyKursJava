package lekcja11;

public class zadanie16 {
    public static void main(String[] args) {
        short tablica[] = new short[10];
        short i = 0;
        while(i<tablica.length){
            tablica[i]=i;
            i++;
        }
        i = 0;
        while(i<tablica.length){
            System.out.println(tablica[i]+" ");
            i++;
        }
    }
    
}
