package hw_1;

public class task_8_season {
    //task 8
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeason(-10);
        checkSeason(0);
        checkSeason(11);
        checkSeason(9);
        checkSeason(88);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        //if
        if (month == 3 || month == 4 || month ==  5){
            System.out.println("весна");
        }else if (month == 6 || month == 7 || month ==  8){
            System.out.println("лето");
        }else if (month == 9 || month == 10 || month == 11){
            System.out.println("осень");
        }else if (month == 1 || month == 2 || month == 12) {
            System.out.println("зима");
        }else {
            System.out.println("это не номер месяца");
        }

        //switch
        switch (month){
            case 3: case 4: case 5:
                System.out.println("весна");
                break;

            case 6: case 7: case 8:
                System.out.println("лето");
                break;

            case 9: case 10: case 11:
                System.out.println("осень");
                break;

            case 1: case 2: case 12:
                System.out.println("зима");
                break;

            default:
                System.out.println("это не номер месяца");
                break;
        }

    }
}
