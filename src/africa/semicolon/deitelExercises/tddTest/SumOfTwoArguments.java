package africa.semicolon.deitelExercises.tddTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoArguments {
    public static void main(String[] args) {
//        int [] sum = {0,2,4,1,5};
//        int [] sum = {1,3,4,2,5};
//        int c = 3;

        int [] sum = {1,4,3,2};
        int c = 6;
            System.out.println(Arrays.toString(sumTwoArguments(sum, c)));

    }
    public static int[] sumTwoArguments(int [] a, int b){
        Map<Integer, Integer> container = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int target = b - a[i];
            if (container.containsKey(target)) return new int[]{container.get(target), i};
            container.put(a[i], i);
        }
        return new int[]{};
    }

}
