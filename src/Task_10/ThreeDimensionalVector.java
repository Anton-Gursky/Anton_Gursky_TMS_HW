package Task_10;

public class ThreeDimensionalVector {

    public int x1;
    public int y1;
    public int z1;
    public int x2;
    public int y2;
    public int z2;
    public int x;
    public int y;
    public int z;
    //Рассчитываемые величины
    public double vectorLength;
    public static double scalarProduct;
    public static ThreeDimensionalVector sumVector;
    public static ThreeDimensionalVector difVector;
    public static ThreeDimensionalVector[] vectors;
    final String vectorDescription = "Это вектор для трехмерной системы координат: ";

    public ThreeDimensionalVector(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
        this.x = x2 - x1;
        this.y = y2 - y1;
        this.z = z2 - z1;
    }

    public ThreeDimensionalVector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Вычисление длины вектора
    public void vectorLength(){
        //Если вектор задан через x1, y1, z1, x2, y2, z2
        if (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0 && z1 != 0 && z2 != 0){
            vectorLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        }
        //Если вектор задан только через x, y и z
        else {
            vectorLength = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        }
        System.out.println("Длина вектора: " + vectorLength);
    }

    //Скалярное произведение векторов (x1 * x2 + y1 * y2 + z1 * z2)
    public static void scalarProduct (ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
        scalarProduct = firstVector.x * secondVector.x + firstVector.y * secondVector.y + firstVector.z * secondVector.z;
        System.out.println("Скалярное произведение векторов:" + scalarProduct);
    }

    //Сложение векторов и получение нового вектора (x1 + x2), (y1 + y2), (z1 + z2)
    public static void vectorAddition (ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
        sumVector = new ThreeDimensionalVector(firstVector.x + secondVector.x, firstVector.y + secondVector.y, firstVector.z + secondVector.z);
        System.out.println("Результат сложения векторов равен новому вектору с координатами: " + sumVector.x + ", " + sumVector.y + ", " + sumVector.z);
    }

    // Разность векторов и получение нового вектора (x2 - x1), (y2 - y1), (z2 - z1)
    public static void vectorSubtraction (ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
        difVector = new ThreeDimensionalVector(secondVector.x - firstVector.x, secondVector.y - firstVector.y, secondVector.z - firstVector.z);
        System.out.println("Результат разности векторов равен новому вектору с координатами: " + difVector.x + ", " + difVector.y + ", " + difVector.z);
    }

    //Метод, принимающий целое число и возвращающий массив векторов
    public static ThreeDimensionalVector[] randomVectorsArray(int N){

        vectors = new ThreeDimensionalVector[N];

        for (int i = 0; i < N; i++){
            vectors[i] = new ThreeDimensionalVector((int) (Math.random() * ((10) + 1)), (int) (Math.random() * ((10) + 1)),
                    (int) (Math.random() * ((10) + 1)), (int) (Math.random() * ((10) + 1)),
                    (int) (Math.random() * ((10) + 1)), (int) (Math.random() * ((10) + 1)));
        }
        return vectors;
    }

    // Метод сравнения векторов
    public static void vectorComparison(ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
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
                "x1=" + x1 + "\n" +
                "y1=" + y1 + "\n" +
                "z1=" + z1 + "\n" +
                "x2=" + x2 + "\n" +
                "y2=" + y2 + "\n" +
                "z2=" + z2 + "\n" +
                "x=" + x + "\n" +
                "y=" + y + "\n" +
                "z=" + z + "\n";
    }
}
