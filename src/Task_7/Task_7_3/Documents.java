package Task_7.Task_7_3;

import java.util.Date;

public abstract class Documents {

    public int documentNumber;
    public Date date;

    public Documents(int documentNumber, Date date) {
        this.documentNumber = documentNumber;
        this.date = date;
    }
}
