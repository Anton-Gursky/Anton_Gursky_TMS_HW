package Task_10;

public class Vector {

    //Координаты начала и конца вектора
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    //Координаты вектора
    public int x;
    public int y;
    //Рассчитываемые величины
    public double vectorLength;
    public static double scalarProduct;
    public static Vector sumVector;
    public static Vector difVector;
    public static Vector[] vectors;
    final String vectorDescription = "Это вектор для двумерной системы координат: ";


    public Vector(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.x = x2 - x1;
        this.y = y2 - y1;
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Вычисление длины вектора
    public void vectorLength(){
        //Если вектор задан через x1, y1, x2, y2
        if (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0){
            vectorLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
        //Если вектор задан только через x и y
        else {
            vectorLength = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
        System.out.println("Длина вектора: " + vectorLength);
    }

    //Скалярное произведение векторов (x1 * x2 + y1 * y2)
    public static void scalarProduct (Vector firstVector, Vector secondVector){
        scalarProduct = firstVector.x * secondVector.x + firstVector.y * secondVector.y;
        System.out.println("Скалярное произведение векторов:" + scalarProduct);
    }

    //Сложение векторов и получение нового вектора (x1 + x2), (y1 + y2)
    public static void vectorAddition (Vector firstVector, Vector secondVector){
        sumVector = new Vector(firstVector.x + secondVector.x, firstVector.y + secondVector.y);
        System.out.println("Результат сложения векторов равен новому вектору с координатами: " + sumVector.x + ", " + sumVector.y);
    }

    // Разность векторов и получение нового вектора (x2 - x1), (y2 - y1)
    public static void vectorSubtraction (Vector firstVector, Vector secondVector){
        difVector = new Vector(secondVector.x - firstVector.x, secondVector.y - firstVector.y);
        System.out.println("Результат разности векторов равен новому вектору с координатами: " + difVector.x + ", " + difVector.y);
    }

    //Метод, принимающий целое число и возвращающий массив векторов
    public static Vector[] randomVectorsArray(int N){

        vectors = new Vector[N];

        for (int i = 0; i < N; i++){
            vectors[i] = new Vector((int) (Math.random() * ((10) + 1)), (int) (Math.random() * ((10) + 1)),
                    (int) (Math.random() * ((10) + 1)), (int) (Math.random() * ((10) + 1)));
        }
        return vectors;
    }

    // Метод сравнения векторов
    public static void vectorComparison(Vector firstVector, Vector secondVector){
        if (firstVector.vectorLength > secondVector.vectorLength){
            System.out.println("Первый вектор " + " > " + "Второго вектора " );
        }
        else {
            System.out.println("Второй вектор " + " > " + "Первого вектора ");
        }
    }

    @Override
    public String toString() {
        return vectorDescription + "\n" +
                "x1= " + x1 + "\n" +
                "y1= " + y1 + "\n" +
                "x2= " + x2 + "\n" +
                "y2= " + y2 + "\n" +
                "x= " + x + "\n" +
                "y= " + y + "\n";
    }
}