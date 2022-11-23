package Task_9;

public class University {

    public Student[] students = new Student[10];
    public Student[] student2 = new Student[students.length - 1];
    public int i = 0;
    public int j = 0;

    public University() {
    }

    public void addStudent(Student student1){
        students[i] = student1;
        i++;
        System.out.println("Студент добавлен");
    }

    public void deleteStudent(Student student1){
        for (int i = 0; i < students.length; i++){
            if (students[i] == student1){
                System.out.println("Удаляемый студент есть в базе");
                break;
            }
            else {
                System.out.println("Введенного студента нет в базе");
            }
        }

        for (int i = 0; i < student2.length; i++){
            if (students[i] != student1){
                student2[j] = students[i];
                j++;
            }
        }

        System.out.println("Отставшиеся студенты в базе данных: \n");
        for (int i = 0; i < student2.length; i++){
            if (student2[i] != null){
                System.out.println(student2[i] + "\n");
            }
        }
    }

    public void searchForStudent(String name, String surname, String secondName){
        for (int i = 0; i < student2.length; i++){
            if (student2[i] != null && (student2[i].studentName.equals(name) || student2[i].studentSurname.equals(surname)
            || student2[i].studentSecondName.equals(secondName))){
                System.out.println(student2[i]);
                break;
            }
            else if (i == student2.length - 1){
                System.out.println("Студент не найден в базе данных");
            }
        }
    }
}
