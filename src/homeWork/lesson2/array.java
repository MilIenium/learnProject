package homeWork.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        *******************************************************
        //1. Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
//        int n = Integer.parseInt(reader.readLine());
//
//        if(n%2 == 0){
//            System.out.println("Четное число");
//        }else{
//            System.out.println("Нечетное число");
//        }
//        *******************************************************
        //2. Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
//        int numberOne = Integer.parseInt(reader.readLine());
//        int numberTwo = Integer.parseInt(reader.readLine());
//
//        if(numberOne-10 > numberTwo-10){
//            System.out.println(numberOne);
//        }else{
//            System.out.println(numberTwo);
//        }
//       *******************************************************
        //3. Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
//        int minSegment = Integer.parseInt(reader.readLine());
//        int maxSegment = Integer.parseInt(reader.readLine());
//
//        int minInterval = Integer.parseInt(reader.readLine());
//        int maxInterval = Integer.parseInt(reader.readLine());
//
//        int differenceSegment = maxSegment - minSegment;
//
//        Random random = new Random();
//        int i = random.nextInt(differenceSegment + 1);
//        i += minSegment;
//
//        if(i<minInterval || i>maxInterval){
//            System.out.println("Число " + i + " не содержится в интервале " + minInterval + " - " + maxInterval);
//        }else{
//            System.out.println("Число " + i + " содержится в интервале " + minInterval + " - " + maxInterval);
//        }
        //*******************************************************
        //4. Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
//        Random random = new Random();
//        int randomNumber = 100 + random.nextInt(1000 - 100);
//
//        Integer Number = new Integer(randomNumber);
//        String strSum = Number.toString();
//        String nums[] = strSum.split("");
//
//        Arrays.sort(nums);
//
//        System.out.println("Случайным числом является: " + randomNumber + ", а его максимальная цифра " + nums[2]);
//        *******************************************************
        //5. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа. Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.

//        int variables [] = new int[3];
//
//        for(int i = 0; i < variables.length; i++){
//            variables[i] = Integer.parseInt(reader.readLine());
//        }
//
//        Arrays.sort(variables);
//
//        for(int i = 0; i < variables.length; i++){
//            System.out.println(variables[i]);
//        }
        //6. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
// *******************************************************
//        for(int i = 1000; i<10000; i+=3){
//            System.out.println(i);
//        }
        //7. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

//        for(int i= 1; i<168; i+=3){
//            System.out.println(i);
//        }
//*******************************************************
        //8. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        //Не совсем понял задание. все что до 0 неотрицательные :-)

//        for(int i = 90; i > 0; i-=5){
//            System.out.println(i);
//        }
// *******************************************************
        //9. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
//        for(int i = 2; i <84; i+=2){
//            System.out.println(i);
//        }
// *******************************************************
        //10. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
//        int factorial = Integer.parseInt(reader.readLine());
//        int fact = 1;
//        for(int i = 2; i<=factorial; ++i){
//            fact=fact*i;
//        }
//        System.out.println(fact);
//*******************************************************
        //11. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
        int input = Integer.parseInt(reader.readLine());
        int count = 0;

        if(input <= 0){
            System.out.println("You're dumb");
        }else {
            for (int i = 1; i <= input; i++) {
                if (input % i == 0) {
                    count++;
                }
            }
            System.out.println("Количество делителей числа " + input + ": " + count);
        }


    }
}
