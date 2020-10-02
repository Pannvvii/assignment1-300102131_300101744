import java.util.Random;
import java.util.*;
import java.util.Vector;
public class ArrayTesting {
    
    public static void main(String[] args){
        for (int m= 0; m<5;m++){
            Random rand = new Random();
            String listconc = "";
            String veconc = "";
            String arronc = "";
            int n = 450000;

            long start1 = System.nanoTime();
            String[] alph = {"a","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            LinkedList<String> link = new LinkedList<String>();
            for (int i = 0; i<n;i++){
                int randy = rand.nextInt(25);
                link.add(alph[randy]);
            }
            long middle1 = System.nanoTime();
            long middle12 = System.nanoTime();
            Iterator check1 = link.iterator();
            while(check1.hasNext()){
                listconc = listconc+check1.next();
            }
            long end1 = System.nanoTime();
            long createTime1 = (middle1-start1)/1000000;
            long iterateTime1 = (end1 - middle12)/1000000;
            System.out.println("LinkedList Creation miliseconds: "+createTime1);
            System.out.println("LinkedList Iteration miliseconds: "+iterateTime1);
            System.out.println("LinkedList C/I seconds: "+createTime1/1000+"/"+iterateTime1/1000);
            

            long start2 = System.nanoTime();
            Vector<String> vect = new Vector<String>(n);
            for (int i = 0; i<n;i++){
                int randv = rand.nextInt(25);
                vect.add(alph[randv]);
            }
            long middle2 = System.nanoTime();
            long middle22 = System.nanoTime();
            Iterator check = vect.iterator();
            while (check.hasNext()){
                veconc = veconc+check.next();
            }
            long end2 = System.nanoTime();
            long createTime2 = (middle2-start2)/1000000;
            long iterateTime2 = (end2 - middle22)/1000000;
            System.out.println("Vector Creation miliseconds: "+createTime2);
            System.out.println("Vector Iteration miliseconds: "+iterateTime2);
            System.out.println("Vector C/I seconds: "+createTime2/1000+"/"+iterateTime2/1000);


            long start3 = System.nanoTime();
            String arry[] = new String[n];
            for (int i = 0; i<n;i++){
                int randa = rand.nextInt(25);
                arry[i] = alph[randa];
            }
            long middle3 = System.nanoTime();
            long middle32 = System.nanoTime();
            for (int i = 0; i<n;i++){
                arronc = arronc+arry[i];
            }
            long end3 = System.nanoTime();
            long createTime3 = (middle3-start3)/1000000;
            long iterateTime3 = (end3 - middle32)/1000000;
            System.out.println("Array Creation miliseconds: "+createTime3);
            System.out.println("Array Iteration miliseconds: "+iterateTime3);
            System.out.println("Array C/I seconds: "+createTime3/1000+"/"+iterateTime3/1000);
        }
    }
    
}
