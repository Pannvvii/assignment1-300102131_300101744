import java.util.Random;

public class TestLoop2 {
    public static void main(String[] args){
        long tim = System.nanoTime();
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        int type = rand.nextInt(1);
        char ty = 'P';
        if (type == 1){
            ty = 'C';
        } else {
            ty = 'P';
        }
        PointCP4 test = new PointCP4(ty,x,y);
        PointCP4 test2 = new PointCP4(ty,y,x);
        for (int i=0; i<35000000;i++){
            test.getX();
            test.getY();
            test.getTheta();
            test.getRho();
            if (i % 2 == 0){
                test.convertStorageToCartesian();
                test.convertStorageToPolar();
            } else {
                test.convertStorageToPolar();
                test.convertStorageToCartesian();
            }
            
            test.getDistance(test2);
            test.rotatePoint(44.78);
            test.toString();
            //System.out.println(test.toString());
        }
        long time = System.nanoTime();
        long milisec = (time-tim)/1000000;
        long sec = milisec/1000;
        System.out.println("Time in miliseconds: "+milisec);
        System.out.println("Time in seconds: "+sec);
    }
}
