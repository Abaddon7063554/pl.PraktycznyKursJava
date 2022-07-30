package lekcja11;
public class zadanie11_4 {
   public static void main(String[] args){
    int tab[]= new int[100];
    //int a,c,d;
    //String b,e;
    for (int j = 0;j<10;j++){
        for(int i=0; i<tab.length;i++){
          /* 
           b = Integer.toString(i); //zamiana zmiennej "i" na STRING o nazwie zmiennej b
            a = b.length(); //sprawdzenie dlugosci Stringa b
            e = String.valueOf(b.charAt(a-1)); //zamiana Chara/znaku  ostatniego ze stingu b na 
            String o nazwie e 
            c = Integer.parseInt(e); zamiana stringa e na Integer o nazwie c 
            */
        
            if(Integer.parseInt(String.valueOf(Integer.toString(i).charAt(Integer.toString(i).length()-1)))==j){
                tab[i]=j;
            }       
        }
    }
    
   
   for(int i=0; i<tab.length;i++){  
        System.out.print("tab["+i+"]="+tab[i]+" ");
        if((i+1)%10==0)System.out.print("\n");
        

    }
}
}
