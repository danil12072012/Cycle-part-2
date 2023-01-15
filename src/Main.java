public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 3");
       int size = 12_000_000;
       int birthRate = 17;
       int mortality = 8;
       for (int i=1; i<=10; i++){
           size = size + size/1000*(birthRate-mortality);
           System.out.println("Год " + i + ", численость населения составляет " + size);
        }
        }

    }
