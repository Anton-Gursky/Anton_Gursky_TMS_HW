package Task_6;

public class HDD {

    String name;
    int volume;
    boolean type;

    HDD(){
    }

    HDD(String name, int volume, boolean type){
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", volume=" + volume +
                ", type=" + type;
    }
}
