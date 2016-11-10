import java.util.Random;

/**
 * Created by vig on 11/6/16.
 */
public class Numb3 {
    public void Numb3(){
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        System.out.println(n);
        int[][] randomArray = new int[3][n];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                randomArray[i][j] = rand.nextInt();
            }
        }
        for (int i = 0; i < 3; i++,System.out.println()) {
            for (int j = 0; j < n; j++) {
                System.out.println(randomArray[i][j]);
            }
        }
    }
}