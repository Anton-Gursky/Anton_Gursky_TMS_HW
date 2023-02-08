package Task_21;

public class Person implements Comparable<Person>{

    public String name;
    public String surname;
    public String sex;
    public String age;

    public Person(String name, String surname, String sex, String age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.equals( o )){
            return 0;
        }
        return this.name.compareTo( o.name );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}