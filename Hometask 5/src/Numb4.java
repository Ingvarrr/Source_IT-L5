/**
 * Created by vig on 11/6/16.
 */
public class Numb4 {
    public void Numb4(){
        int[] fiboArray = new int[11];
        for (int i = 0; i <fiboArray.length; i++) {
            if (i<2){
                fiboArray[i] = 1;
            }else{
                fiboArray[i]=fiboArray[i-2] + fiboArray[i -1];
            }
            System.out.print(fiboArray[i] + " | ");
        }
    }
}
