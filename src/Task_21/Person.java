package Task_21;

public class Person {

    private String name;
    private String surname;
    private String sex;
    private String age;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + surname + "," + sex + "," + age;
    }
}