public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 6; i >= -6; i = i - 2) {
            System.out.println(i);
        }

        System.out.println("----------");

        int oddNumbersSum = 0;

        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 1) {
                oddNumbersSum += i;   
            }
        }

        System.out.println("Сумма нечетных чисел " + oddNumbersSum);
    }
}