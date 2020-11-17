package homeWork.lesson3;

import java.util.Arrays;

public class ArrayUtil {
    public int min(int[] someArr) {
        Arrays.sort(someArr);
//        for(int i = 0; i < someArr.length; i++){
//            System.out.println(someArr[0]);
//        }
        int minArr = someArr[0];

        return minArr;
    }
    
    public int max(int[] someArr){

        Arrays.sort(someArr);
        int maxArr = someArr.length-1;
//        for(int i=0; i < someArr.length; i++)
//            System.out.println(someArr[c]);
        return maxArr;
 }
}
