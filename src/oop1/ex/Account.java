package oop1.ex;

public class Account {
    int balance;

    int deposit(int amount) {
//        System.out.println("입금이 완료되었습니다.\n잔고 : " + (balance + amount));
        return balance = balance + amount;
    }

    int withdraw(int amount) {
        if (!(balance < amount)) {
            balance = balance - amount;
//            System.out.println("출금이 완료되었습니다.\n잔고 : " + balance);
        } else {
            System.out.println("잔액 부족\n잔고 :" + balance);
        }
        return balance;
    }

}
