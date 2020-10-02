import java.util.Random;

public class TestLoop2 {
    public static void main(String[] args){
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
        PointCP2 test = new PointCP2(ty,x,y);
        PointCP2 test2 = new PointCP2(ty,y,x);
        for (int i=0; i<100000;i++){
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
    }
}
