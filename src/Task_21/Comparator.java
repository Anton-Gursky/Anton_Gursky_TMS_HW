package Task_21;

public class Comparator implements java.util.Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.name.equals(o2.name)){
            return (o1.surname.compareTo(o2.surname));
        }
        return (o1.name.compareTo(o2.name));
    }
}