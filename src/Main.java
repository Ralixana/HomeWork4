public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Task 1");

        byte age = 15;
        if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Task 2");

        byte temperature = 7;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Task 3");

        byte speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Task 4");

        byte age = 61;
        if (age <= 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age > 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else if (age >= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора отдохнуть");
        }
    }
    public static void task5 () {
        System.out.println("Task 5");

        byte age = 4;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age >= 14) {
            System.out.println("Если возраст человека равен " + age + " , то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6 () {
        System.out.println("Task 6");
        int trainCapacity = 102;
        int seatingPlaces = 60;
        int people = 60;
        if (people < seatingPlaces) {
            System.out.println("Если человек в поезде равно " + people + ", то ещё есть сидячие места в вагоне");
        } else if (people >= seatingPlaces && people < trainCapacity) {
            System.out.println("Если человек в поезде равно " + people + ", то в вагоне остались только стоячие места");
        } else if (people >= trainCapacity) {
            System.out.println("Если человек в поезде равно " + people + ", то вагон заполнен");
        }
    }
    public static void task7 () {
        System.out.println("Task 7");

        int one = 111;
        int two = 44;
        int three = 333;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);
        }
    }
}