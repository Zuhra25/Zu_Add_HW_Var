public class Main {

    public static void main(String[] args) {
        task1(); //task2(); task3();task4();task5();task6();task7();task8();
    }

    public static void task1() {
        System.out.println("Задача 1:");

//Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной *result*.
//
//Инвертируйте результат (значение в переменной *result*), преобразовав его в вариант
// с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
//
//Выведите (напечатайте) результат в консоль.
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);



    }
}