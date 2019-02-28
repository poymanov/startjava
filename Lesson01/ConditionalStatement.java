public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 25;
        boolean isMale = true;
        boolean isFemale = false;
        int height = 2;
        char nameFirstChar = 'П';

        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        }

        if (isMale) {
            System.out.println("Вы мужчина");
        }

        if (isFemale) {
            System.out.println("Вы женщина");
        }

        if (height < 1.80) {
            System.out.println("Вы невысокий");
        } else {
            System.out.println("Вы высокий");
        }

        if (nameFirstChar == 'М') {
            System.out.println("Вы, возможно, Михаил");
        } else if (nameFirstChar == 'И') {
            System.out.println("Вы, возможно, Игорь");
        } else {
            System.out.println("Нет предположений насчет вашего имени");
        } 
    }
}