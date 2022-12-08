package Task_10;

public class Main {

    public static void main(String[] args){

        Vector firstVector = new Vector(2, 20);
        Vector secondVector = new Vector(7, 9);
        Vector vectors = new Vector();

        //Рассчитываем длину векторов
        firstVector.vectorLength();
        secondVector.vectorLength();

        //Рассчитываем скалярное произведение векторов
        vectors.scalarProduct(firstVector,secondVector);

        //Рассчитываем сумму векторов
        vectors.vectorAddition(firstVector, secondVector);

        //Рассчитываем разность векторов
        vectors.vectorSubtraction(firstVector, secondVector);

        //Создаем массив случайных векторов
        vectors.randomVectorsArray(5);
        for (int i = 0; i < vectors.randomVectorsArray(5).length; i++){
            System.out.println(vectors.vectors[i]);
        }

        //Сравнение векторов
        vectors.vectorComparison(firstVector, secondVector);

        System.out.println("------------------------------------------");
        System.out.println("Трехмерные векторы");
        System.out.println("------------------------------------------");
        //Создаем трехмерные векторы
        ThreeDimensionalVector firstVector3D = new ThreeDimensionalVector(1, 1, 1);
        ThreeDimensionalVector secondVector3D = new ThreeDimensionalVector(5, 9, 1);
        ThreeDimensionalVector threeDimensionalVector = new ThreeDimensionalVector();

        //Рассчитываем длину векторов
        firstVector3D.vectorLength();
        secondVector3D.vectorLength();

        //Рассчитываем скалярное произведение векторов
        threeDimensionalVector.scalarProduct(firstVector3D, secondVector3D);

        //Рассчитываем сумму векторов
        threeDimensionalVector.vectorAddition(firstVector3D, secondVector3D);

        //Рассчитываем разность векторов
        threeDimensionalVector.vectorSubtraction(firstVector3D, secondVector3D);

        //Создаем массив случайных векторов
        threeDimensionalVector.randomVectorsArray(3);
        for (int i = 0; i < threeDimensionalVector.randomVectorsArray(3).length; i++){
            System.out.println(threeDimensionalVector.vectors[i]);
        }

        //Сравнение векторов
        threeDimensionalVector.vectorComparison(firstVector3D, secondVector3D);
    }
}