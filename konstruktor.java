class punkt {
    int x ;
    int y ;
    int z;
    punkt (){
        this.x=1;
        this.y=3;
    }
    punkt(int wspx , int wspy){
        this.x=wspx;
        this.y=wspy;
        
    }
    punkt (punkt punkt){
        x=punkt.x;
        y=punkt.y;
    }
    void wyswietl(){
        System.out.println("oto \ni = "+x +"\ny = "+y);
    }
}

public class konstruktor {
    public static void main(String[] args) {
        punkt obiekt1 = new punkt();
        obiekt1.wyswietl();
        punkt obiekt2 = new punkt(100 , 200);
        obiekt2.wyswietl();
        punkt obiekt3 = new punkt(obiekt1);
        obiekt3.wyswietl();
    }
}
