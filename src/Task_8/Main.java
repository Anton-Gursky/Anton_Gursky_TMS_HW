package Task_8;

public class Main {

    public static void main(String[] args){

        Contact firstContact = new Contact("Alex",375298467961L);
        Contact secondContact = new Contact("Mike", 375294578962L);
        Contact thirdContact = new Contact("Liz", 375291245678L);
        Register register = new Register();

        //Добавляем контакты в телефон
        register.addContact(firstContact);
        register.addContact(secondContact);
        register.addContact(thirdContact);

        System.out.println();

        //Создаем свой телефон
        Phone firstPhone = new Phone("+3756249874","Samsung", 1);
        Phone secondPhone = new Phone("+326978462135", "Xiaomi");

        // Реализация принятия вызова
        firstPhone.receiveCall(firstContact);
        System.out.println(secondPhone.receiveCall("Mike", 375291547645L));

        //Получение номера своего телефона
        firstPhone.getNumber();
        secondPhone.getNumber();

        // Отправка сообщения определенным абонентам
        firstPhone.sendMessage("Приветствую Вас!", firstContact, secondContact);

    }
}
