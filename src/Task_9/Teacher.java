package Task_9;

public class Teacher {

    public String teacherName;
    public String teacherSurname;
    public String teacherSecondName;
    public Subject[] subjects;
    public Faculty[] faculties;

    public Teacher(String teacherName, String teacherSurname, String teacherSecondName, Subject[] subjects, Faculty[] faculties) {
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherSecondName = teacherSecondName;
        this.subjects = subjects;
        this.faculties = faculties;
    }
}
