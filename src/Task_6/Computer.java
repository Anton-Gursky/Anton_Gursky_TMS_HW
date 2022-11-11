package Task_6;

public class Computer {

    int price;
    String model;
    RAM ram;
    HDD hdd;


    Computer (int price, String model){
        this.price = price;
        this.model = model;
    }

    Computer(int price, String model, RAM ram, HDD hdd){
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer " +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram: " + ram +
                ", hdd: " + hdd;
    }

    public static void main(String[] args){


        Computer firstComputer = new Computer(100, "Windows XP");

        RAM secondComputerRAM = new RAM("Оперативная память",8);
        HDD secondComputerHDD = new HDD("Жесткий диск", 200, true); // Тип: true - внешний; false - внутренний.
        Computer secondComputer = new Computer(500, "Dell",  secondComputerRAM, secondComputerHDD);

        System.out.println(firstComputer);
        System.out.println(secondComputer);
    }
}
