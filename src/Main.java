public class Main {

    public static void main(String[] args) {
        task1(); task2(); task3(); //task4();task5();task6();task7();task8();
    }

    public static void task1() {
        System.out.println("Задача 6:");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result*-1);
    }
    public static void task2() {
        System.out.println("Задача 7:");
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);

    }
    public static void task3() {
        System.out.println("Задача 8:");
        int a = 754;
        int b = a / 10;
        b = b % 10;

        System.out.println("a = " + a + ", b = " + b);

    }
}