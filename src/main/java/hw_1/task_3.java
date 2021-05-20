package hw_1;

public class task_3 {

         public static int min(int a, int b) {
            //напишите тут ваш код
             int result;
             if (a > b){
                 result = b;
             } else if (b > a){
                 result = a;
             } else {
                 System.out.println("числа одинаковые . Минимальное число определить нельзя.");
                result =a;
        }return result;
         }

        public static void main(String[] args) {
            System.out.println(min(12, 33));
            System.out.println(min(-20, 0));
            System.out.println(min(-10, -20));
            System.out.println(min(-50, -20));
            System.out.println(min(10, 0));
            System.out.println(min(70, 20));
            System.out.println(min(-10, -10));
            System.out.println(min(0, -0));
        }

}


