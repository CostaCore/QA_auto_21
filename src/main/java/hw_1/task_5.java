package hw_1;

public class task_5 {

        public static void main(String[] args) {
            System.out.println(multiplicationTable(1));
            System.out.println(multiplicationTable(2));
            System.out.println(multiplicationTable(3));
            System.out.println(multiplicationTable(4));
            System.out.println(multiplicationTable(5));
            System.out.println(multiplicationTable(6));
            System.out.println(multiplicationTable(7));
            System.out.println(multiplicationTable(8));
            System.out.println(multiplicationTable(9));
            System.out.println(multiplicationTable(10));

        }
        public static String multiplicationTable (int number){
            //напишите тут ваш код
            String result = "";

                for (int i = 1; i <= 10; i++){
                    Integer num = number * i;
                    result = result + " " + num;
                }

            return result;
        }
}
