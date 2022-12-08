package Task_9;

public class Main {

    public static void main(String[] args){

        University university = new University();
        Subject algebra = new Subject("Алгебра");
        Subject geometry = new Subject("Геометрия");
        Subject astronomy = new Subject("Астрономия");
        Subject physics = new Subject("Физика");

        Marks mikeAlgebraMarks = new Marks (new int[]{1, 2, 36, 12});
        Marks mikeGeometryMarks = new Marks (new int[]{5, 4, 6, 9});
        Marks lizGeometryMarks = new Marks(new int[]{7, 8, 9, 8, 10, 5});
        Marks lizAstronomyMarks = new Marks(new int[]{10, 11, 25, 64, 100});
        Marks lizPhysicsMarks = new Marks(new int[]{15, 18, 23, 30, 75});

        //Создаем объект класса студент
        Student MikeAnderson = new Student("Mike", "Anderson", "Adam",
                new Subject[]{algebra, geometry}, new Marks[]{mikeAlgebraMarks, mikeGeometryMarks});

        //Добавляем студента в массив студентов класса University
        university.addStudent(MikeAnderson);
        System.out.println(MikeAnderson);

        Student LizCudrow = new Student("Liz", "Cudrow", "Brenda",
                new Subject[]{geometry, astronomy, physics},new Marks[]{lizGeometryMarks, lizAstronomyMarks, lizPhysicsMarks});

        university.addStudent(LizCudrow);
        System.out.println(LizCudrow);

        //Удаляем студента из базы
        university.deleteStudent(MikeAnderson);

        //Ищем студента в базе данных
        university.searchForStudent("Nill", "Ander", "Bryan");
    }
}
