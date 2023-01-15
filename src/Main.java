public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 8");
       int yearIsNow = 2023;
       int twoHundredYearsAgo = yearIsNow -200;
       int oneHundredYearsAhead = yearIsNow + 100;
       int i = 0;
       while (i< oneHundredYearsAhead){
           i= i + 79;
           if (i>= twoHundredYearsAgo && i<= oneHundredYearsAhead)
               System.out.println(i);

        }
        }

    }
