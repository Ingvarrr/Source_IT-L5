/**
 * Created by vig on 10/17/16.
 */
public class Cell {
    private boolean hasMine;

    public String toString() {
        return hasMine ? "M" : " ";
    }
    /*
    <тип> <имя переменной>
    <видимость> <возвр. значение> <имя>([параметры]) {

    }
    protected void myMethod(){}
    public String myMethod2() {
        return " ";
    }
    public String MyMethod3 (int x, int y) {
        return " " + x + " " + y;
    }
     */

    public boolean getHasMine() {
        return hasMine;
    }

    public void setHasMine(boolean hasMine){
        this.hasMine = hasMine;
    }

   /* public int max(int x, int y) {
        return x > y && hasMine ? x : y*/
    }
}
