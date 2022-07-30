package lekcja12;

public class zadanie12_4 {
    public static void main(String[] args) {
        int [][][] tab = new int[5][2][3];
        var licznik=30;
        for(int i = 0 ;i<tab.length;i++){
            for(int j =0 ;j<tab[i].length;j++){
                for( int z =0;z<tab[i][j].length;z++){
                    tab[i][j][z]=licznik++;
                }
            }
        }
        for(int i = 0 ;i<tab.length;i++){
            for(int j =0 ;j<tab[i].length;j++){
                for( int z =0;z<tab[i][j].length;z++){
                    System.out.print(tab[i][j][z]+" ");
                }
            }
        }
    }
    
}
