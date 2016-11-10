/**
 * Created by vig on 11/2/16.
 */

public class Numb2 {
    public void Numb2(){
    int [] reversedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < reversedArray.length/2; i++){
            reversedArray[i] = reversedArray[i] + reversedArray[reversedArray.length - (i + 1)];
            reversedArray[reversedArray.length - (i + 1)] =
                reversedArray[i] - reversedArray[reversedArray.length - (i + 1)];
            reversedArray[i] = reversedArray[i] - reversedArray[reversedArray.length - (i + 1)];
        }
        for (int y:reversedArray) {
            System.out.print(y + " ");

        }
    }
}
