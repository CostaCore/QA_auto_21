package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_12_pairNumbers {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        String stringNum = Integer.toString(number);

        System.out.println("Number lenth: "+stringNum.length()+" digits");

        int resultNum;
        for (int i = 0; i < stringNum.length(); i++){

             resultNum = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
             if (resultNum % 2 ==0){
                 even++;
             } else {
                 odd++;
             }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
