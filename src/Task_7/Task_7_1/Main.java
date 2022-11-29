package Task_7.Task_7_1;

public class Main {

    public static void main(String[] args){

        Figures[] array = new Figures[5];
        int perimeterSum = 0;
        int areaSum = 0;

        array[0] = new Triangle("Треугольник", 5, 3, 4);
        array[1] = new Circle("Круг", 4);
        array[2] = new Rectangle("Прямоугольник", 10, 20);
        array[3] = new Circle("Круг", 12);
        array[4] = new Rectangle("Прямоугольник", 11, 7);

        for (int i = 0; i < 5; i++){
            perimeterSum += array[i].perimeter();
            areaSum += array[i].area();
            System.out.println("Периметр фигуры " + i + " : " + array[i].perimeter());
            System.out.println("Площадь фигуры " + i + " : " + array[i].area());
        }

        System.out.println("Сумма периметров: " + perimeterSum + "\n" +
                            "Сумма площадей: " + areaSum + "\n");
    }
}