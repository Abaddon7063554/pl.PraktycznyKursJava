package lekcja11;
public class zadanie11_3 {
   public static void main(String[] args) {
    boolean[] tab = new boolean[20];
    boolean a;
    for(int i =0;i<tab.length;i++){
        a=i%2==0 ? true:false;
        tab[i]=a;
        System.out.print("index["+i+"]="+tab[i]+" :->");
            if(tab[i]==true) 
                System.out.print("1 \n");
            else
                System.out.print("0 \n");
    }
   } 
}
