public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + total/100*12;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей.");
        }
        }

    }
