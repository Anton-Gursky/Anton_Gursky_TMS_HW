package Task_19;

import java.util.*;

public class Editor {

    public List<Integer> list;

    public Editor(List<Integer> list) {
        this.list = list;
    }

    //Удаление одинаковых значений листа (обычный метод)
    public void deleteDuplicates(){
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("Удаление одинаковых элементов (обычный способ):\n" + Arrays.toString(list.toArray()));
    }

    //Удаление одинаковых значений (Stream API)
    public void deleteDuplicatesStream(){
        System.out.println("Удаление одинаковых элементов (StreamAPI):");
        list.stream().distinct().forEach(System.out::println);
    }

    //Вывод всех четных элементов в диаппазоне 7...17 (обычным методом)
    public void elementsInRange(){
        System.out.println("Вывод всех четных элементов в диапазоне 7...17 (Обычный вариант):");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 7 && list.get(i) <= 17 && list.get(i) % 2 == 0){
                System.out.println(list.get(i));
            }
        }
    }

    //Вывод всех четных элементов в диаппазоне 7...17 (Stream API)
    public void elementsInRangeStream(){
        System.out.println("Вывод всех четных элементов в диапазоне 7...17 (Stream API):");
        list.stream().filter(x -> x >= 7 && x <= 17 && x % 2 == 0).forEach(System.out::println);
    }

    //Умножение каждого элемента на 2 (Обычным методом)
    public void multiplyBy2(){

        System.out.println("Уможение каждого элемента на 2 (обычный способ):");

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
            System.out.print(list.get(i) + ", ");
        }
    }

    //Умножение каждого элемента на 2 (Stream API)
    public void multiplyBy2Stream(){
        System.out.println("Уможение каждого элемента на 2 (Stream API):");
        list.stream().map(x -> x * 2).forEach(System.out::println);
    }

    //Сортировка списка (обычный метод)
    public void sortArray(){
        System.out.println("Отсортированный список (обычный метод):");
        Collections.sort(list);

        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }
    }

    //Сортировка списка (Stream API)
    public void sortArrayStream(){
        System.out.println("Отсортированный список (Stream API):");
        list.stream().sorted().limit(4).forEach(System.out::println);
    }

    //Количество элемеентов списка (Stream API)
    public void elementsQuantity(){
        System.out.println("Количество элементов: " + list.stream().count());
    }

    //Среднее арифметическое всех чисел в Stream API
    public void arithmeticalMean(){
        IntSummaryStatistics stats = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Среднее арифметическое значение: " + stats.getAverage());
    }
}