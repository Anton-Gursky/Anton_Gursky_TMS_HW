package Task_9;

import java.util.Arrays;

public class Student {

    public String studentName;
    public String studentSurname;
    public String studentSecondName;

    public Subject[] subject;
    public Marks[] marks;

    public Student(String studentName, String studentSurname, String studentSecondName, Subject[] subject, Marks[] marks) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentSecondName = studentSecondName;
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Студент: \n" +
                "Имя студента: " + studentName + '\n' +
                "Фамилия студента: " + studentSurname + '\n' +
                "Второе имя (Отчество) студента: " + studentSecondName + '\n' +
                "Предметы: " + Arrays.toString(subject) + "\n" +
                "Оценки: " + Arrays.toString(marks);
    }
}
