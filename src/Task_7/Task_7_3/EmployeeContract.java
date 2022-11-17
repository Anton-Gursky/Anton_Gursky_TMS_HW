package Task_7.Task_7_3;

import java.util.Date;

public class EmployeeContract extends Documents{

    Date contractEndDate;
    String employeeName;

    public EmployeeContract(int documentNumber, Date date, Date contractEndDate, String employeeName) {
        super(documentNumber, date);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }
}
