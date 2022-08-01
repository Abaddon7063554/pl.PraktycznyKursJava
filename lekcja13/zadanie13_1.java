package lekcja13;

class LiczbyCalkowite1 {
    int x;

    void wyswietlLiczbe() {
        System.out.println(x);
    }

    int pobierzLicze() {
        return x;
    }
}

public class zadanie13_1 {
    public static void main(String[] args) {
        LiczbyCalkowite1 zmienna1 = new LiczbyCalkowite1();
        zmienna1.x = 23;
        zmienna1.wyswietlLiczbe();
        System.out.println(zmienna1.pobierzLicze());

    }
}
