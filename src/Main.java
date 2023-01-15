public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 6");
       int deposiAmount = 15000;
       int percent = 7;
       int time = 9;
       for (int i =0; i <= time*12; i++){
           deposiAmount = deposiAmount + deposiAmount/100*percent;
           if (i %6 == 0){
           System.out.println("Месяц " + i + ", сумма накоплений " + deposiAmount);
        }
        }

    }}
