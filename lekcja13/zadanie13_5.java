package lekcja13;

class prostokat22{
    int x1 ,y1, x2,y2;
    void gornylewybok(){
        System.out.print("("+x1+" , "+y1+")");
    }
    void gornyprawybok(){
        System.out.print("("+x2+" , "+y1+")");
    }
    void dolnylewybok(){
        System.out.print("("+x1+" , "+y2+")");
    }
    void dolnyprawybok(){
        System.out.print("("+x2+" , "+y2+")");
    }
}
public class zadanie13_5 {
    public static  void main(String [] args){
        System.out.println("czesc");
        prostokat22 prostokat= new prostokat22();
        prostokat.x1=23;
        prostokat.gornylewybok();
        System.out.print("----------------");
        prostokat.gornyprawybok();
        System.out.println();
        System.out.println("       |              |");
        System.out.println("       |              |");
        prostokat.dolnylewybok();
        System.out.print("----------------");
        prostokat.dolnyprawybok();
    }
}
