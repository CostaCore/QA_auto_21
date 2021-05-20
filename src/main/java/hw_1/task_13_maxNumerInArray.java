package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class task_13_maxNumerInArray {
    public static void main(String[] args) throws Exception {
        int[] array = getArray();
        int max = max(array);
        System.out.println("max number is - "+max);
    }

    public static int[] getArray() throws IOException {
        // создай и заполни массив
        int arraySize;

        System.out.println("Задайте размер массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        arraySize = Integer.parseInt(reader.readLine());
        int [] resultArray = new int[arraySize];
            for (int i = 0; i < arraySize; i++){

                resultArray[i] = new Random().nextInt(20);
                System.out.println(i +" - "+resultArray[i]);
                }
        return resultArray;

    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = 0;
        for (int j = 0; j< array.length; j++){
            if (array[j] > max){
                max = array[j];
            }
        }
        return max;
    }
}
