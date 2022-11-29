package Task_8;

public class Register {

    public static Contact[] contacts = new Contact[3];
    int i = 0;

    public void addContact(Contact contact){
        if (i <= 2){
            contacts[i] = contact;
            i++;
            System.out.println("Контакт добавлен");
        }
        else {
            System.out.println("Массив контактов заполнен");
        }
    }


}