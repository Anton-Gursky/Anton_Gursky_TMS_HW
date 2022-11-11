package Task_6;

public class RAM {

    String name;
    int volume;

    RAM(){
    }

    RAM(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", volume=" + volume;
    }
}
