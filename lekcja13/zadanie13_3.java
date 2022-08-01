package lekcja13;
 class Prostokat1{
    int x1 , y1;
    int x2 , y2;
    int x3 , y3;
    int x4 , y4; 
    int pobierzX1(){return x1;}
    int pobierzX2(){return x2;}
    int pobierzX3(){return x3;}
    int pobierzX4(){return x4;}
    int pobierzY1(){return y1;}
    int pobierzY2(){return y2;}
    int pobierzY3(){return y3;}
    int pobierzY4(){return y4;}
}
public class zadanie13_3 {
   
    public static void main(String[] args){
        Prostokat1 zmienna = new Prostokat1();
        zmienna.x1=1;
        zmienna.x2=3;
        zmienna.x3=3;
        zmienna.x4=3;
        zmienna.y1=2;
        zmienna.y2=4;
        zmienna.y3=2;
        zmienna.y4=4;
        System.out.println("wspolzedne pierwszego kata to :("+ zmienna.pobierzX1()+" . "+zmienna.pobierzY1()+")");
        System.out.println("wspolzedne drugiego kata to :("+ zmienna.pobierzX2()+" . "+zmienna.pobierzY2()+")");
        System.out.println("wspolzedne trzeciegokata to :("+ zmienna.pobierzX3()+" . "+zmienna.pobierzY3()+")");
        System.out.println("wspolzedne czwartego kata to :("+ zmienna.pobierzX4()+" . "+zmienna.pobierzY4()+")");
    }
}
