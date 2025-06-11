import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산할 첫 번째 숫자를 입력해주세요.");
        int num1 = scanner.nextInt();

        System.out.println("더하기와 빼기 중 어느 연산을 원하시나요?\n더하기는 +, 빼기는 -를 입력해주세요.");
        String operator = scanner.next();

        System.out.println("계산할 두번 째 숫자를 입력해주세요.");
        int num2 = scanner.nextInt();

        int result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else {
            System.out.println("잘못된 기호를 입력하셨습니다.");
            return;
        }

        System.out.println("요청하신 계산 결과는 " + result + "입니다.");
    }
}