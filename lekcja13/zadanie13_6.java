package lekcja13;

public class zadanie13_6 {
    public static void main(String[] args){
        Prostokat123 zmienna = new Prostokat123();
        zmienna.x1=1;
        zmienna.x2=3;
        zmienna.x3=3;
        zmienna.x4=1;
        zmienna.y1=2;
        zmienna.y2=2;
        zmienna.y3=3;
        zmienna.y4=3;
        if(zmienna.sprawdzenie()==1){
       
        System.out.println("wspolzedne pierwszego kata to :("+ zmienna.pobierzX1()+" . "+zmienna.pobierzY1()+")");
        System.out.println("wspolzedne drugiego kata to :("+ zmienna.pobierzX2()+" . "+zmienna.pobierzY2()+")");
        System.out.println("wspolzedne trzeciegokata to :("+ zmienna.pobierzX3()+" . "+zmienna.pobierzY3()+")");
        System.out.println("wspolzedne czwartego kata to :("+ zmienna.pobierzX4()+" . "+zmienna.pobierzY4()+")");
        }
        else {
            System.out.println("to nie jest prostokat");
        }
    }
}

class Prostokat123{
    int x1 , y1;
    int x2 , y2;
    int x3 , y3;
    int x4 , y4;
    int spr = 0; 
    int sprawdzenie(){
       if((x1==x4)&&(x2==x3)&&(y1==y2)&&(y3==y4)){
        System.out.println("To jest prostokat");
        spr=1;
           return spr;
        } else {
        System.out.println("to nie jest prostokat");
        return spr;
        }
    }
    int pobierzX1(){return x1;}
    int pobierzX2(){return x2;}
    int pobierzX3(){return x3;}
    int pobierzX4(){return x4;}
    int pobierzY1(){return y1;}
    int pobierzY2(){return y2;}
    int pobierzY3(){return y3;}
    int pobierzY4(){return y4;}
}
