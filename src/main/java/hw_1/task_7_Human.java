package hw_1;

public class task_7_Human {
    //task 7
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Макс");
        System.out.println(human.name);
    }
    public static class Human {
        private String name = "человек";

        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;
        }
    }
}
