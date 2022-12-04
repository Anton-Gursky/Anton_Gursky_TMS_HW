package Task_10;

public class Vector {

    //Координаты вектора
    public int x;
    public int y;
    //Рассчитываемые величины
    public double vectorLength;
    public double scalarProduct;
    public Vector sumVector;
    public Vector difVector;
    public Vector[] vectors;
    final String vectorDescription = "Это вектор для двумерной системы координат: ";

    public Vector() {
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Вычисление длины вектора
    public void vectorLength(){
        //Если вектор задан только через x и y
            vectorLength = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Длина вектора: " + vectorLength);
    }

    //Скалярное произведение векторов (x1 * x2 + y1 * y2)
    public void scalarProduct (Vector firstVector, Vector secondVector){
        scalarProduct = firstVector.x * secondVector.x + firstVector.y * secondVector.y;
        System.out.println("Скалярное произведение векторов:" + scalarProduct);
    }

    //Сложение векторов и получение нового вектора (x1 + x2), (y1 + y2)
    public void vectorAddition (Vector firstVector, Vector secondVector){
        sumVector = new Vector(firstVector.x + secondVector.x, firstVector.y + secondVector.y);
        System.out.println("Результат сложения векторов равен новому вектору с координатами: " + sumVector.x + ", " + sumVector.y);
    }

    // Разность векторов и получение нового вектора (x2 - x1), (y2 - y1)
    public void vectorSubtraction (Vector firstVector, Vector secondVector){
        difVector = new Vector(secondVector.x - firstVector.x, secondVector.y - firstVector.y);
        System.out.println("Результат разности векторов равен новому вектору с координатами: " + difVector.x + ", " + difVector.y);
    }

    //Метод, принимающий целое число и возвращающий массив векторов
    public Vector[] randomVectorsArray(int N){

        vectors = new Vector[N];

        for (int i = 0; i < N; i++){
            vectors[i] = new Vector((int) (Math.random() * ((10) + 1)), (int) (Math.random() * ((10) + 1)));
        }
        return vectors;
    }

    // Метод сравнения векторов
    public void vectorComparison(Vector firstVector, Vector secondVector){
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
                "x= " + x + "\n" +
                "y= " + y + "\n";
    }
}