package Task_7.Task_7_3;

import java.util.Date;

public class FinancialInvoice extends Documents{

    public int monthResultSum;
    public int departmentCode;

    public FinancialInvoice(int documentNumber, Date date, int monthResultSum, int departmentCode) {
        super(documentNumber, date);
        this.monthResultSum = monthResultSum;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Финансовая накладная" + "\n" +
                "Итоговая сумма за месяц: " + monthResultSum + "\n" +
                "Код департамента: " + departmentCode + "\n" +
                "Номер документа: " + documentNumber + "\n" +
                "Дата: " + date + "\n";
    }
}
