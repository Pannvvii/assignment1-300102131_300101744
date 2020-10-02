import java.util.Random;

public class TestLoop {
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        int type = rand.nextInt(1);
        if (type == 1){
            char ty = 'C';
        } else {
            char ty = 'P';
        }
        PointCP4 test = new PointCP4(ty,x,y);
        PointCP4 test2 = new PointCP4(ty,y,x);
        for (i=0; i<6000;i++){
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
        }
    }
}
