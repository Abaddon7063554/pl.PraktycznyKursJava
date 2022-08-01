package lekcja13;
class Prostokat{
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
public class zadanie13_2 {
   
    public static void main(String[] args){
     Prostokat prostokat = new Prostokat();
     prostokat.x1=5;
     System.out.println(prostokat.x1);
    }
}
