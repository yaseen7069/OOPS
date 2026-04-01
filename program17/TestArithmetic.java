import Arithmetic.*;
import java.util.Scanner;

public class TestArithmetic {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        Add add = new Add();
        Substract sub = new Substract();
        Multiply mul = new Multiply();
        Divide div = new Divide();

        System.out.println("Addition: " + add.operation(a, b));
        System.out.println("Substraction: " + sub.operation(a, b));
        System.out.println("Multiplication: " + mul.operation(a, b));
        System.out.println("Division: " + div.operation(a, b));
    }
}
