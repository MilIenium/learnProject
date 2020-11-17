package homeWork.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //объявление массива с 10 элементами
        int[] sortArr = new int[10];

        //запись элементов массива с клавиатуры
        for(int i = 0; i < sortArr.length; i++){
            sortArr[i] = Integer.parseInt(reader.readLine());
        }

        //сортировка методом пузырьков

        //создаем переменную для записи значений из массива
        int someVariable;

        for (int i = sortArr.length - 1; i>0; i--){
            for(int q = 0; q < i; q++) {
                if (sortArr[q] > sortArr[q + 1]) {
                    someVariable = sortArr[q];
                    sortArr[q] = sortArr[q + 1];
                    sortArr[q + 1] = someVariable;
                }
            }
        }
        //выводим отсортированный массив на экран
        for(int i = 0; i < sortArr.length; i++){
            System.out.println(sortArr[i]);
        }


//        //самая простая сортировка массива
//        Arrays.sort(sortArr);
//
//        //вывод отсортированного массива в порядке возрастания
//        for(int i = 0; i < sortArr.length; i++){
//            System.out.println(sortArr[i]);
//        }
//
//        //вывод отсортированного массива в порядке убывания
//        for(int i = sortArr.length-1; i >= 0; --i){
//            System.out.println(sortArr[i]);
//        }

    }
}
