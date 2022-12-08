package Task_10;

public class ThreeDimensionalVector {

    //Координаты вектора
    public int x;
    public int y;
    public int z;
    //Рассчитываемые величины
    public double vectorLength;
    public double scalarProduct;
    public ThreeDimensionalVector sumVector;
    public ThreeDimensionalVector difVector;
    public ThreeDimensionalVector[] vectors;
    public static final String vectorDescription = "Это вектор для трехмерной системы координат: ";

    public ThreeDimensionalVector() {
    }

    public ThreeDimensionalVector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Вычисление длины вектора
    public void vectorLength(){
        //Если вектор задан только через x, y и z
            vectorLength = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        System.out.println("Длина вектора: " + vectorLength);
    }

    //Скалярное произведение векторов (x1 * x2 + y1 * y2 + z1 * z2)
    public void scalarProduct (ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
        scalarProduct = firstVector.x * secondVector.x + firstVector.y * secondVector.y + firstVector.z * secondVector.z;
        System.out.println("Скалярное произведение векторов:" + scalarProduct);
    }

    //Сложение векторов и получение нового вектора (x1 + x2), (y1 + y2), (z1 + z2)
    public void vectorAddition (ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
        sumVector = new ThreeDimensionalVector(firstVector.x + secondVector.x, firstVector.y + secondVector.y, firstVector.z + secondVector.z);
        System.out.println("Результат сложения векторов равен новому вектору с координатами: " + sumVector.x + ", " + sumVector.y + ", " + sumVector.z);
    }

    // Разность векторов и получение нового вектора (x2 - x1), (y2 - y1), (z2 - z1)
    public void vectorSubtraction (ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
        difVector = new ThreeDimensionalVector(secondVector.x - firstVector.x, secondVector.y - firstVector.y, secondVector.z - firstVector.z);
        System.out.println("Результат разности векторов равен новому вектору с координатами: " + difVector.x + ", " + difVector.y + ", " + difVector.z);
    }

    //Метод, принимающий целое число и возвращающий массив векторов
    public ThreeDimensionalVector[] randomVectorsArray(int N){

        vectors = new ThreeDimensionalVector[N];

        for (int i = 0; i < N; i++){
            vectors[i] = new ThreeDimensionalVector((int) (Math.random() * ((10) + 1)), (int) (Math.random() * ((10) + 1)),
                    (int) (Math.random() * ((10) + 1)));
        }
        return vectors;
    }

    // Метод сравнения векторов
    public void vectorComparison(ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector){
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
                "x=" + x + "\n" +
                "y=" + y + "\n" +
                "z=" + z + "\n";
    }
}