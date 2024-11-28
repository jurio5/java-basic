package poly.ex.pay0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PayMain1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요 : ");
            String cmd = scanner.nextLine();

            if (cmd.startsWith("exit")) {
                scanner.close();
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요 : ");
            try {
                int amount = scanner.nextInt();
                scanner.nextLine();

                payService.processPay(cmd, amount);
            } catch (InputMismatchException e) {
                System.out.println("결제 금액은 숫자로 입력해 주세요.");
                scanner.nextLine();
            }
        }
    }
}
