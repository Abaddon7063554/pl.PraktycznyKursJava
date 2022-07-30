package lekcja13;
class Prostokąt{
    int x1 =1, y1=2;
    int x2 =4, y2=6;
    int pobierzX1(){
        return x1;
    }
    
    int pobierzY1(){
        return y1;
    }
    
    int pobierzX2(){
        return x2;
    }
    
    int pobierzY2(){
        return y2;
    }
}
public class zadanie13_3 {
   
    public static void main(String[] args){
        Prostokąt zmienna = new Prostokąt();
        zmienna.x1=1;
        zmienna.y1=2;
        zmienna.x2=3;
        zmienna.y2=4;
        System.out.println("wpolzedne pierwszego kata to :("+ zmienna.pobierzX1()+" . "+zmienna.pobierzY1()+")");
        System.out.println("wpolzedne drgiego kata to :"+ zmienna.pobierzX2()+" . "+zmienna.pobierzY2());
    }
}
