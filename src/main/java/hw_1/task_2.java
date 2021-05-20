package hw_1;

import java.util.Map;

public class task_2 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman;
        woman.husband = man;
    }
    public static class Man{
        public Woman wife;
    }
    public static class Woman{
        public Man husband;
    }



}

