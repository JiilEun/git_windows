import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        String str1 = scan.nextLine();

        System.out.println("사칙연산자를 입력하세요.");
        String op = scan.nextLine();

        System.out.println("두 번째 숫자를 입력하세요.");
        String str2 = scan.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result = 0;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("연산자를 정확히 입력하세요");
                break;
        }

        System.out.println(str1 + " " + op + " " + str2 + " = " + result);

        scan.close();
    }
}
