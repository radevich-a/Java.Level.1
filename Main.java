public class Main {
    public static void main(String[] args) {
        int value_1 = 1;
        double value_2 = 10.5;
        float value_3 = 5f;
        boolean is = false;
        byte bb = 127;
        char ch = 'C';

        value_1 = function(2, 10, 6, 2);
        System.out.println("result = " + value_1);

        is = isTrue(5, 5);
        System.out.println("isTrue = " + is);

        isNegativeNumber(-9);

        helloName("Pit");

        isLeapYear(400);


    }

    static int function(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean isTrue(int a, int b) {
        int sum = a + b;
        boolean is = false;
        if ((sum >= 10) & (sum <= 20)) {
            is = true;
        }
        return is;
    }

    static void isNegativeNumber(int a) {
        if (a < 0) System.out.println("True");
    }

    static void helloName(String a ){
        System.out.println("Hello, " + a);
    }

    static void isLeapYear(int a){
        if (((a % 4)==0) & ((a % 100 != 0)) | (a % 400 == 0)){
            System.out.println("LeapYear");
        }
    }
}
