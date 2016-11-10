import java.util.Arrays;

/**
 * Created by vig on 10/17/16.
 */
public class Main {
    public static void main(String[] args) {

        int count = 0;
        while(count < 10) {
            System.out.println("Hello World");
            count++;
        }


    while(условие) [{]
        actions
    [}]


        do{
            System.out.println("Hello World" + count);
            count++;
        }while(count > 10);

        for(int i = 0; i < 10; i+=3){
            if (i % 3 !=0) {
                continue; // пропускает все тело цикла, которое находится после него
            }
            if(i >= 10){
                break; //прерывает цикл
            }
            System.out.println(i);
        }
        for (;;){
            System.out.println("Infinite loop");
        }

        for(int i = 0; i < 10; i++){

        }

        for (<initialization>; <condition>; <increment>){

        }


        //Arrays

        int [] array;
        //int array1[] = {10, 20}; //лучше не использовать
        int [] array1 = {10, 20}; //лучше не использовать
        array = new int[10];

        array = new int[]{10,20};

        int var1 = array1[0]; // =10
        array1[1] = 2

        String[] strArr= new String[]{"","s"}

        //Объявление массива
        int[] array;
        <type>[] <variableName>

        //Создание массива
        array = new int[25];

         <variableName> = new <type>[<arrayLength>

        //заполнение элементами:

        for (int i = 0; i < array.length; i++) { //запись в массив
            array[i] = i*i;
        // <variableName>[<position>] = <value>;
        }
        System.out.println(Arrays.toString(array)); //выдаст массив
        System.out.println(array); //выдаст ссылку
    }
        for (int i = 0; i < array.length; i++) { //запись в массив
            System.out.println(array[i] + ", ");
            int k = array[i];

        //<type> <varName> = <arrayVariableName> [<position>]
        for (int value : array){ //только чтение элементов массива
            System.out.println(array[i] + ", ");
        // Двумерные массивы
            int [][] doubleArray = new int[5][2];
            int [][][][][] fiveNArray = new array

            * 1, 2
            * 3, 4
            * 5, 6
            * 7, 8
            * 9, 10
            *        j
            *        0 1 2 3 4
            *  i   0  1 3 5 7 9
            *      1  2 4 6 8 10
            *
            for (int i = 0; i < doubleArray.length; i++){
                for (int j = 0; j < doubleArray [i].length; j++);
                doubleArray [i][j] = i*j;
            }

            for (int i = 0; i < doubleArray.length; i++){
                int[] inner = doubleArray[i];
                for (int j = 0; j < doubleArray [i].length; j++);
                inner[j] = i * j
                doubleArray [i][j] = i*j;

            doubleArray [0]
        }
        //САПЕР
        Cell[][] field = {
                {c(true), c(false), c(true), c(false)},
                {c(true), c(false), c(true), c(false)},
                {c(false), c(false), c(false), c(false)},
                {c(true), c(false), c(true), c(false)},
        }

            Cell[][] field2 = {
                    {c(1), c(0), c(1), c(0)},
                    {c(1), c(0), c(1), c(0)},
                    {c(0), c(0), c(0), c(0)},
                    {c(1), c(0), c(1), c(0)},
            }

            Cell[] [] field3 = new Cell[5][5];
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                if (i == j){
                    field3[i][j] = c(1);
                }else {
                    field3[i][j] = c(0);
                }
            }
        }
            System.out.println(Arrays.deepToString(field3));

            Cell [i][j] = i*j;

                System.out.println(Arrays.deepToString(field));



            public static Cell c(int value){
            Cell cell = new Cell();
            cell.setHasMine(value == 1);
            return cell;
        }
        }
    }


    }
