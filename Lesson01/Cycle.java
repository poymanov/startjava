public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("----------");

        int k = 6;
        while (k >= -6) {
            System.out.println(k);

            k -= 2;
        }

        System.out.println("----------");

        int oddNumbersSum = 0;

        int j = 10;

        do {
          if (j % 2 == 1) {
              oddNumbersSum += j;
          }

          j++;
        } while (j <= 20);
        
        System.out.println("Сумма нечетных чисел " + oddNumbersSum);
    }
}
