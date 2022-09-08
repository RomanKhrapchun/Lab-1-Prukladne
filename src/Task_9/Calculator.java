package Task_9;

import Task_8.CustomDouble;

public class Calculator {

    public CustomDouble sum(final CustomDouble a, final CustomDouble b){
        return a.sum(b);
    }

    public CustomDouble subtraction(final CustomDouble a, final CustomDouble b){
        return a.subtraction(b);
    }

    public static int multiply(final int a, final int b) {
        return a * b;
    }
    public static double multiply(final CustomDouble a, final CustomDouble b){
        return a.toDouble() * b.toDouble();
    }

    public static int divide(final int a, final int b) {
        return a / b;
    }
    public static double divide(final CustomDouble a, final CustomDouble b){
        return a.toDouble() / b.toDouble();
    }
}
