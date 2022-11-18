package Task_8;

public class Phone {

    public String number;
    public String model;
    public int weight;

    //Конструктор класса, принимающий 2 переменные
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //Конструктор класса, принимающий 3 переменные
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    //Метод "принять вызов", принимающий экземпляр класса Contact
    public void receiveCall(Contact contact){
        System.out.println("Звонит " + contact.getContactName() + " " + contact.getContactNumber());
    }

    //Метод "принять вызов", принимающий 2 переменные (имя звонившего и его номер)
    //Осуществляет поиск контакта по номеру телефона и имени
    public Contact receiveCall(String name, long number){
        for (int i = 0; i < Register.contacts.length - 1; i++){
            if (Register.contacts[i].getContactName().equals(name)){
                return Register.contacts[i];
            }
            else if (Register.contacts[i].getContactNumber() == number){
                return Register.contacts[i];
            }
        }
        return null;
    }

    //Метод, возвращающий свой номер телефона
    public void getNumber(){
        System.out.println("Номер телефона: " + number);
    }

    //Метод, отправляющий введенное сообщение выбранным контактам
    public void sendMessage(String message, Contact... contact){
        System.out.println("Соощение: " + message + "отправлено абонентам: \n");
        for (int i = 0; i < contact.length; i++) {
            System.out.println(contact[i]);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
