package Task_7.Task_7_3;

import java.util.Date;

public class EmployeeContract extends Documents{

    public Date contractEndDate;
    public String employeeName;

    public EmployeeContract(int documentNumber, Date date, Date contractEndDate, String employeeName) {
        super(documentNumber, date);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Контракт с сотрудником" + "\n" +
                "Дата окончания контракта: " + contractEndDate + "\n" +
                "Имя работника: " + employeeName + '\n' +
                "Номер документа: " + documentNumber + "\n" +
                "Дата: " + date + "\n";
    }
}
