public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1, -2, 32, 0, 6, 8, 1};

        for (int i : sort(numbers)) {
            System.out.println(i);
        }
    }

    public static Integer[] sort(Integer[] mas) {

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return mas;
    }
}