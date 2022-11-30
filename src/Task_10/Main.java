package Task_10;

public class Main {

    public static void main(String[] args){

        Vector firstVector = new Vector(2, 20, 5, 10);
        Vector secondVector = new Vector(7, 9);

        //Рассчитываем длину векторов
        firstVector.vectorLength();
        secondVector.vectorLength();

        //Рассчитываем скалярное произведение векторов
        Vector.scalarProduct(firstVector,secondVector);

        //Рассчитываем сумму векторов
        Vector.vectorAddition(firstVector, secondVector);

        //Рассчитываем разность векторов
        Vector.vectorSubtraction(firstVector, secondVector);

        //Создаем массив случайных векторов
        Vector.randomVectorsArray(5);
        for (int i = 0; i < Vector.randomVectorsArray(5).length; i++){
            System.out.println(Vector.vectors[i]);
        }

        //Сравнение векторов
        Vector.vectorComparison(firstVector, secondVector);

        System.out.println("------------------------------------------");
        System.out.println("Трехмерные векторы");
        System.out.println("------------------------------------------");
        //Создаем трехмерные векторы
        ThreeDimensionalVector firstVector3D = new ThreeDimensionalVector(1, 1, 1, 5, 7,8);
        ThreeDimensionalVector secondVector3D = new ThreeDimensionalVector(5, 9, 1);

        //Рассчитываем длину векторов
        firstVector3D.vectorLength();
        secondVector3D.vectorLength();

        //Рассчитываем скалярное произведение векторов
        ThreeDimensionalVector.scalarProduct(firstVector3D, secondVector3D);

        //Рассчитываем сумму векторов
        ThreeDimensionalVector.vectorAddition(firstVector3D, secondVector3D);

        //Рассчитываем разность векторов
        ThreeDimensionalVector.vectorSubtraction(firstVector3D, secondVector3D);

        //Создаем массив случайных векторов
        ThreeDimensionalVector.randomVectorsArray(3);
        for (int i = 0; i < ThreeDimensionalVector.randomVectorsArray(3).length; i++){
            System.out.println(ThreeDimensionalVector.vectors[i]);
        }

        //Сравнение векторов
        ThreeDimensionalVector.vectorComparison(firstVector3D, secondVector3D);
    }
}