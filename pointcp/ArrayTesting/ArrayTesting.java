import java.util.Random;
import java.util.*;
public class ArrayTesting {
    
    public static void main(String[] args){
        long timl = System.nanoTime();
        Random rand = new Random();
        int n = 80000000;

        String[] alph = {"a","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        LinkedList<String> link = new LinkedList<String>();
        for (int i = 0; i<n;i++){
            int randy = rand.nextInt(25);
            link.add(alph[randy]);
        }
        long timel = System.nanoTime();
        long milisecl = (timel-timl)/1000000;
        long secl = milisecl/1000;
        System.out.println("LinkedList miliseconds: "+milisecl);
        System.out.println("LinkedList seconds: "+secl);
        

        long timv = System.nanoTime();
        Vector<String> vect = new Vector<String>(n);
        for (int i = 0; i<n;i++){
            int randv = rand.nextInt(25);
            vect.add(alph[randv]);
        }
        long timev = System.nanoTime();
        long milisecv = (timev-timv)/1000000;
        long secv = milisecv/1000;
        System.out.println("Vector miliseconds: "+milisecv);
        System.out.println("Vector seconds: "+secv);

        long tima = System.nanoTime();
        String arry[] = new String[n];
        for (int i = 0; i<n;i++){
            int randa = rand.nextInt(25);
            arry[i] = alph[randa];
        }
        long timea = System.nanoTime();
        long miliseca = (timea-tima)/1000000;
        long seca = miliseca/1000;
        System.out.println("Array miliseconds: "+miliseca);
        System.out.println("Array seconds: "+seca);
    }
    
}
