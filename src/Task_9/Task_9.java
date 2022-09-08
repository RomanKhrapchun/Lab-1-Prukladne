package Task_9;

import Task_8.CustomDouble;

public class Task_9 {
    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(0.5);
        final CustomDouble b = new CustomDouble(0.3);
        final int inputSign = 3;
        switch (inputSign) {
            case 1:
                System.out.println(a.sum(b));
                break;
            case 2:
                System.out.println(a.subtraction(b));
                break;
            case 3:
                System.out.println(Calculator.multiply(a, b));
                break;
            case 4:
                System.out.println(Calculator.divide(a, b));
        }
    }
}
