package Task_6;

import java.util.Scanner;

/*
Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
количеством купюр номиналом 20, 50 и 100.
Сделать метод для добавления денег в банкомат.
 */

public class ATM {

    int banknotesDenomimation20;
    int banknotesDenomimation50;
    int banknotesDenomimation100;
    int remains;
    static Scanner scanner = new Scanner(System.in);

    public void moneyAdding(int addingSum){

        this.banknotesDenomimation100 = addingSum / 100;
        this.banknotesDenomimation50 = (addingSum - this.banknotesDenomimation100 * 100) / 50;
        this.banknotesDenomimation20 = (addingSum - this.banknotesDenomimation100 * 100 - this.banknotesDenomimation50 * 50) / 20;
        this.remains = addingSum - this.banknotesDenomimation100 * 100 - this.banknotesDenomimation50 * 50 - this.banknotesDenomimation20 * 20;
        if (remains != 0){
            System.out.println("Можно внести только сумму: " + (addingSum - this.remains));
        }
    }

    public static void main(String[] args){

        ATM atm = new ATM();
        System.out.println("Введите сумму, которую хотите добавить в банкомат:");
        atm.moneyAdding(scanner.nextInt());
        System.out.println("Вставьте купюры следующего номинала и в следующем количестве: \n" +
                "Купюры номиналом 100: " + atm.banknotesDenomimation100 + "\n" +
                "Купюры номиналом 50: " + atm.banknotesDenomimation50 + "\n" +
                "Купюры номиналом 20: " + atm.banknotesDenomimation20 + "\n");
    }

}
