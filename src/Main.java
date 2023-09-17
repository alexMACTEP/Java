import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловть в калькулятор");
        vvodSystemIn();
    }

    public static void vvodSystemIn() {
        int i = 0;
        double num1 = 0;
        double num2;
        String operator = "+";
        try {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                String k = scanner.nextLine();
                if (k.equals("=")) {
                    break;
                } else if (i == 0) {
                    if (k.matches("(\\-?\\d+\\.?\\d*)")) {
                        num1 = Double.parseDouble(k);
                        i++;
                    } else {
                        System.out.println("Ошибка ввода, повторите попытку");
                    }
                } else {
                    if (i % 2 != 0) {
                        if (k.equals("+") || k.equals("-") || k.equals("*") || k.equals("/")) {
                            operator = k;
                            i++;
                        } else {
                            System.out.println("Ошибка ввода повторите попытку");
                        }
                    } else {
                        if (k.matches("(\\-?\\d+\\.?\\d*)")) {
                            num2 = Double.parseDouble(k);
                            i++;
                            num1 = calculator(num1, operator, num2);
                            System.out.println("Ответ=" + num1);
                        } else {
                            System.out.println("Ошибка ввода повторите попытку num2");
                        }
                    }
                }
            }
        } catch (
                InputMismatchException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        System.out.println("финальный результат=" + num1);
    }

    public static double calculator(double num1, String operator, double num2) {
        switch (operator) {
            case "+" -> num1 = num1 + num2;
            case "-" -> num1 = num1 - num2;
            case "*" -> num1 = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.err.println("Делить на ноль нельзя!");
                    break;
                }
                num1 = num1 / num2;
            }
            default -> System.out.println("Ошибка ввода оператора!");
        }
        System.out.println("Результат: " + num1);
        return num1;
    }
}


