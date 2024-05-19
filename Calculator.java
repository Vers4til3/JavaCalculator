public class Calculator {
    public static void main(String[] args) {
        mathStart();
    } 

    public static void mathStart() {
        System.out.println("");       //introduction and brief instruction
        System.out.println("Welcome, I am MyCalc, feel free to calculate here ;D");
        System.out.println("max. numbers used is 2");
        System.out.println("only (+,-,x,/,^) operators accepted"); 

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print(" Enter First Value: ");
        double num1 = scanner.nextDouble();

        System.out.print(" Enter operator: ");
        String oper = scanner.next();

        System.out.print(" Enter Second Value: ");
        double num2 = scanner.nextDouble();

class CalculatorHelper {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }
}
        CalculatorHelper calc = new CalculatorHelper();

        if (oper.equals("+")) {
            System.out.println("answer:" + calc.add(num1, num2));
        } else if (oper.equals("-")) {
            System.out.println("answer:" + calc.sub(num1, num2));
        } else if (oper.equals("x") || oper.equals("X")) {
            System.out.println("answer:" + calc.mul(num1, num2));
        } else if (oper.equals("/")) {
            System.out.println("answer:" + calc.div(num1, num2));
        } else if (oper.equals("^")) {
            System.out.println("answer:" + calc.pow(num1, num2));
        } else {
            System.out.println("Please Enter Valid Values or Operator");
        }

        System.out.println("");
        System.out.print("Press R to restart, press any key to end session ");
        String input = scanner.next();
        if (!input.equalsIgnoreCase("R")) {
            System.out.println("Thank you for using MyCalc :D. Have a nice day!");
            return;
        }
        mathStart();
    }
}

