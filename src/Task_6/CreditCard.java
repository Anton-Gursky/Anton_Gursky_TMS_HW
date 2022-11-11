package Task_6;

import java.util.Scanner;

public class CreditCard {

    int accountNumber;
    int currentSum;
    static Scanner scanner = new Scanner(System.in);

    public void MoneyAccural(int addingSum){
        this.currentSum += addingSum;
    }

    public void MoneyDebiting(int decreaseSum){
        if (this.currentSum >= decreaseSum){
            this.currentSum -= decreaseSum;
        }
        else{
            System.out.println("Введенная сумма превышает сумму денег на счете");
        }
    }

    @Override
    public String toString() {
        return  "accountNumber=" + accountNumber +
                ", currentSum=" + currentSum;
    }

    public CreditCard (int accountNumber, int currentSum){
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public static void main(String[] args){

        CreditCard firstCreditCard = new CreditCard(156248795, 1700);
        CreditCard secondCreditCard = new CreditCard(75648831, 3000);
        CreditCard thirdCreditCard = new CreditCard(652618752, 10000);

        System.out.println("Введите сумму, чтобы добавить ее к первому счету:");
        firstCreditCard.MoneyAccural(scanner.nextInt());

        System.out.println("Введите сумму, чтобы добавить ее ко второму счету:");
        secondCreditCard.MoneyAccural(scanner.nextInt());

        System.out.println("Введите сумму, чтобы снять ее с третьего счета:");
        thirdCreditCard.MoneyDebiting(scanner.nextInt());

        System.out.println("Первая банковская карточка: " + firstCreditCard);
        System.out.println("Вторая банковская карточка: " + secondCreditCard);
        System.out.println("Третья банковская карточка: " + thirdCreditCard);
    }
}
