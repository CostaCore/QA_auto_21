package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_11_maxNumber {

//    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        String text = "The max is ";

        ////напишите тут ваш код

        System.out.println(text + maxNum(a,b));
    }

    private static String maxNum(int a, int b) {
        int result = 0;

        if (a > b){
            result = a;
        } else if (b > a ) {
            result = b;
        }

        return Integer.toString(result);
        }
    }

