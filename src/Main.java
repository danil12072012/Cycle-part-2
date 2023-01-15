public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 5");
       int deposiAmount = 15000;
       int percent = 7;
       for (int i =0; deposiAmount <= 12_000_000; i++){
           deposiAmount = deposiAmount + deposiAmount/100*percent;
           if (i %6 == 0){
           System.out.println("Месяц " + i + ", сумма накоплений " + deposiAmount);
        }
        }

    }}
