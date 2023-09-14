
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите  число: ");
            double num1 = scanner.nextDouble();
            boolean f = true;
            while (f) {
                System.out.print("Введите оператор (В случае выходы введите - 'e'): ");
                char operator = scanner.next().charAt(0);
                if (operator == 'e') {
                    System.out.println("вы завершили работу");
                    break;
                }
                if (!((operator == ('+')) || (operator == ('-')) || (operator == ('*'))||(operator == ('/')))){
                    System.out.println("Ошибка ввода");
                    break;
                }
                System.out.print("Введите число: ");
                double num2 = scanner.nextDouble();

                switch (operator) {
                    case '+':
                        num1 = num1 + num2;
                        break;
                    case '-':
                        num1 = num1 - num2;
                        break;
                    case '*':
                        num1 = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.err.println("Делить на ноль нельзя!");
                            return;
                        }
                        num1 = num1 / num2;
                        break;
                    default:
                        System.out.println("Ошибка ввода оператора!");
                        return;
                }
                System.out.println("Результат: " + num1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: "+e.getMessage());
        }
    }
}

