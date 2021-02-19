package methods;

public class MaxValue {

    public static void main(String[] args) {
        int a = 4, b = 10;
        int result = maxValue(a, b);
        int sum = SumOfTwoNumber(a, b);
        System.out.println("The max value is : " + result);
        System.out.println("The Sum is : " + sum);
    }

    public static int maxValue(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    public static int SumOfTwoNumber(int a, int b) {
        int s;
        s = a + b;
        return s;
    }

}
