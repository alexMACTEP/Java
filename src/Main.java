public class Main {
    public static void main(String[] args) {

        int realize = 6;
        int add = 5;
        int dolg = 15;
        float kpd;
        kpd = (realize - add) * 10;
        System.out.println(kpd > 0 ? "snail will win through " + (int) Math.ceil(dolg / kpd) + " sprint \n" : "Snail will lose \n");
    }
}