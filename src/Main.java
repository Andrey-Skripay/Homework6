public class Main {
    public static void main(String[] args) {

        // Задача 1

        for ( int i = 1; i <=10; i++) {
            System.out.println(i);
        }

        // Задача 2
        for (int i = 10; i >=1; i--) {
            System.out.println(i);
        }
        // Задача 3
        for ( int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);

        }
        // Задача 4
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        // Задача 5
         for (int i = 1904; i <= 2096; i = i + 4) {
             System.out.println(i + " год является високосным.");
         }
         // Задача 6
        for (int i = 7; i <= 98; i = i +7) {
            System.out.println(i);
        }
        // Задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // Задача 8
        int savings = 29000; // Переменная сумма вклада
        int total = 0; // Переменная сумма накопления
        for (int  i = 1; i <= 12; i ++){
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println(total);

        // Задача 9

        int savings1 = 29000; // Переменная сумма вклада
        int total1 = 0; // Переменная сумма накопления
        for (int  i = 1; i <= 12; i ++){
            total1 = total1 + total1/100;
            total1 = total1 + savings1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1);
        }
        System.out.println(total1);

        // Задача 10
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            int result = number *i;
            System.out.println(number + " * " + i + " = " + result);
        }

    }
}