package hommework2;

public class ThreeDigitNumber {
    public static void main(String[] args) {

        int n = 365;
        int e = n % 10;
        System.out.println(e);

        int d = n / 10 % 10;
        System.out.println(d);

        int s = n / 100;
        System.out.println(s);

    }
}
