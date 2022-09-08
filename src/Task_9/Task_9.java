package Task_9;

import Task_8.CustomDouble;

public class Task_9 {
    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(0.5);
        final CustomDouble b = new CustomDouble(0.3);
        final char operator = '*';
        if(operator == '+') {
            System.out.println(a.sum(b));
        }
        if(operator == '-') {
            System.out.println(a.subtraction(b));
        }
        if(operator == '*') {
            System.out.println(Calculator.multiply(a, b));
        }
        if(operator == '/') {
            System.out.println(Calculator.divide(a, b));
        }
    }
}
