public class przyklad {
    public static void main(String[] args){
        Punkt punkt = new Punkt();
        Punkt drugiPunkt ;
        punkt.ustawX(100);
        punkt.ustawY(100);
        System.out.println("Obiekt punkt ma wspolrzedne:");
        punkt.wyswietlwspolrzedne();
        System.out.print("\n");
        drugiPunkt = punkt.pobierzWspolrzedne();
        System.out.println("Obiekt drugi punkt ma wspolrzedne:");
        drugiPunkt.wyswietlwspolrzedne();
        System.out.print("\n");
        Punkt trzeciPunkt = new Punkt();
        trzeciPunkt.ustawXY(drugiPunkt);
        System.out.print("Obiekt trzeciPunkt ma wspolrzedne");
        trzeciPunkt.wyswietlwspolrzedne();

    }
}
class  Punkt{
int x;
int y;
int pobierzX(){
    return x;
}
int pobierzY(){
    return y;
}
void ustawX(int wspX){
    x=wspX;
}
void ustawY(int wspY){
    y=wspY;
}
void ustawXY (Punkt punkt){
    x=punkt.x;
    y=punkt.y;
}
Punkt pobierzWspolrzedne(){
    Punkt punkt = new Punkt();
    punkt.x=x;
    punkt.y=y;
    return punkt;
}
void wyswietlwspolrzedne(){
    System.out.println("wspolrzedna x = "+ x);
    System.out.println("wspolrzedna y = "+ y);
}
}