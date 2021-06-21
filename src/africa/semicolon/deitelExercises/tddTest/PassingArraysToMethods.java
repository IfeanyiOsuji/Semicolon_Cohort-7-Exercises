package africa.semicolon.deitelExercises.tddTest;

import java.util.Arrays;

public class PassingArraysToMethods {
    int [] numbers = {5, 7, 8, 10, 40, 55};
    int figure = 10;
    public int[] anotherNumber(int []numbers, int figure){
        figure = 15;
        numbers[3] = 15;
        return numbers;
    }

    public static void main(String[] args) {
        PassingArraysToMethods arrays = new PassingArraysToMethods();
        arrays.anotherNumber(arrays.numbers, arrays.figure);
        System.out.println(Arrays.toString(arrays.anotherNumber(arrays.numbers, arrays.figure)));
        System.out.println(arrays.figure);
    }
}
