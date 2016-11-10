/**
 * Created by vig on 11/2/16.
 */
public class Numb1 {
    private int[] mArray = {3,10,52,31,25,45,52};
    private int mMax = 0;
    private int mCount = 0;

    public void Numb1(){
        for (int i : mArray){
            if (mMax < i){
                mMax = i;
                mCount = 0;
            }
            if (mMax == i) mCount++;
        }
        System.out.println(mCount);
    }
}
