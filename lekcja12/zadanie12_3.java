package lekcja12;

public class zadanie12_3 {
    public static void main(String []p){
        int[][] tab= new int[4][];
        //tab[0]=new int[1];
        //tab[1]=new int[2];
        //tab[2]=new int[3];
        //tab[3]=new int[4];
        for(int i=0;i<=3;i++){
            //System.out.println(i+1);
           tab[i]=new int[i+1];
        }
        int licznik = 10;
        for(int i=0;i<tab.length;i++){
            for(int j = 0 ; j<tab[i].length;j++){
               tab[i][j]=licznik--;
            }
            System.out.println("\n");
        }
        for(int i=0;i<tab.length;i++){
            for(int j = 0 ; j<tab[i].length;j++){
                System.out.print(tab[i][j]+"<->");
            }
            System.out.println("\n");
        }
    }
}
