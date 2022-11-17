package Task_7.Task_7_3;

import java.util.Date;

public class FinancialInvoice extends Documents{

    int monthResultSum;
    int departmentCode;

    public FinancialInvoice(int documentNumber, Date date, int monthResultSum, int departmentCode) {
        super(documentNumber, date);
        this.monthResultSum = monthResultSum;
        this.departmentCode = departmentCode;
    }
}
