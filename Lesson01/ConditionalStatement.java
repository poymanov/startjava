public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 25;
        boolean isMale = true;
        boolean isFemale = false;
        int height = 2;
        char nameFirstChar = '�';

        if (age > 20) {
            System.out.println("��� ������ 20 ���");
        }

        if (isMale) {
            System.out.println("�� �������");
        }

        if (isFemale) {
            System.out.println("�� �������");
        }

        if (height < 1.80) {
            System.out.println("�� ���������");
        } else {
            System.out.println("�� �������");
        }

        if (nameFirstChar == '�') {
            System.out.println("��, ��������, ������");
        } else if (nameFirstChar == '�') {
            System.out.println("��, ��������, �����");
        } else {
            System.out.println("��� ������������� ������ ������ �����");
        } 
    }
}