package lekcja1;
 class Dane{
    int liczba1;
    double liczba2;
    Dane (int liczba){
        liczba1= liczba;
    }
    Dane (double liczba){
        liczba2=liczba;
    }
    Dane(int liczba1,double liczba2){
        this(liczba1);
        this.liczba2=liczba2;

    }
    void wyswietlDane(){
        System.out.print("liczba1 ="+liczba1+ "\nliczba2 ="+liczba2);
 System.currentTimeMillis();
    }
 }
public class konstruktor1 {
  
}
