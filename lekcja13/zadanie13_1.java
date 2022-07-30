package lekcja13;
class LiczbyCalkowite{
    int x;
    void wyswietlLiczbe(){
        System.out.println(x);
    }
    int pobierzLicze(){
         return x;
    }
}
public class zadanie13_1 {
    public static void main(String[] args) {
        LiczbyCalkowite zmienna1 = new LiczbyCalkowite();
        zmienna1.x=23;
        zmienna1.wyswietlLiczbe();
        System.out.println(zmienna1.pobierzLicze());
   

    }
}
