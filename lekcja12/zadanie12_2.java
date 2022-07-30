package lekcja12;

public class zadanie12_2 {
    public static void main(String []args){
        int[][] tab=new int[4][];
        tab[0] = new int[4];
        tab[1] = new int[2];
        tab[2] = new int[1];
        tab[3] = new int[3];
        int licznik =1;
        int i=0,j=0;
        while(i<tab.length){
            while(j<tab[i].length){
                tab[i][j]=licznik++;
                j++;
            }
            i++;
            j=0;
        }
       i=0;
       j=0;
        while(i<tab.length){
            while(j<tab[i].length){
                System.out.print(tab[i][j]+" ");
                j++;
            }
            i++;
            j=0;
        }  

        
    }
}
