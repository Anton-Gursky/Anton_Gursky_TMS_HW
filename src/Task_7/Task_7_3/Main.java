package Task_7.Task_7_3;

import java.util.Date;

public class Main {

    public static void main(String[] args){

        Date date = new Date(15245645L);
        Date contractEndDate = new Date(3265165464L);
        Register register = new Register();

        EmployeeContract employeeContract = new EmployeeContract(215746, date, contractEndDate, "Mike");
        GoodsSupplyContract goodsSupplyContract = new GoodsSupplyContract(21456, date, "Компьютеры", 200);
        FinancialInvoice financialInvoice = new FinancialInvoice(35648, date, 6000, 1015);

        //Добавление документов в Регистр
        register.addDocument(employeeContract);
        register.addDocument(goodsSupplyContract);
        register.addDocument(financialInvoice);

        //Вывод информации об элементах
        register.showDocumentInfo(employeeContract);
        register.showDocumentInfo(goodsSupplyContract);
        register.showDocumentInfo(financialInvoice);
    }
}
