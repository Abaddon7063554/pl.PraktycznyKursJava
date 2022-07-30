package lekcja12;
public class zadanie12_1{
    public static void main (String [] napis){
        int[][] tab = new int [4][];
        tab[0] = new int[4];
        tab[1] = new int[2];
        tab[2] = new int[1];
        tab[3] = new int[3];
        int licznik =10;
        for(int i=0;i<tab.length;i++){
            for(int j = 0; j<tab[i].length;j++){tab[i][j]=licznik--;}
        }
        for(int i=0;i<tab.length;i++){
            for(int j = 0; j<tab[i].length;j++){System.out.print(tab[i][j]+" ");}
        }
    }
}