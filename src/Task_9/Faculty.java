package Task_9;

public class Faculty {

    public String facultyName;
    public Teacher[] teachers;
    public Subject[] subjects;

    public Faculty(String facultyName, Teacher[] teachers, Subject[] subjects) {
        this.facultyName = facultyName;
        this.teachers = teachers;
        this.subjects = subjects;
    }
}
