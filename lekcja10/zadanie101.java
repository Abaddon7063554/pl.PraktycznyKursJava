package lekcja10;

public class zadanie101 {
    public static void main(String[] arg){
        for(int i = 1; i>-21;i--){
            if(i%2==0){
                System.out.println(i);
                continue;// po wstawieniu tej komendy zakańcza sie jedna literacja w pętli
               //break; // po wstawieniu tej komendy wychodzimy z pętli i ją zakańczamy 
            }
        }
    }
}
