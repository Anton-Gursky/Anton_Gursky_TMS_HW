package Task_8;

public class Contact {

    private String contactName;
    private long contactNumber;

    //getter Имени контакта
    public String getContactName() {
        return contactName;
    }

    //getter Номера телефона контакта
    public long getContactNumber() {
        return contactNumber;
    }

    //Конструктор
    public Contact(String contactName, long contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Контакт: \n" +
                "Имя контакта: " + contactName + "\n" +
                "Номер контакта: " + contactNumber + "\n";
    }
}
