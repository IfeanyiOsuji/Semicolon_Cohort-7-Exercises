package africa.semicolon.deitelExercises.tddTest.chapter_7;

import java.util.Arrays;

public class SelectionSort {
public static void selectionSort(double [] list){
    for(int i=0; i<list.length-1; i++){
        double currentMinimum = list[i];
        int minimumIndex = i;
        for(int j=i+1; j<list.length; j++){
            if(currentMinimum > list[j]){
                currentMinimum = list[j];
                minimumIndex = j;
            }

        }
        if(minimumIndex != i){
            list[minimumIndex] = list[i];
            list[i] = currentMinimum;
        }
    }
    System.out.println(Arrays.toString(list));
}
public static int sumArrayElements(){
    int [] scores = {10, 5, 78, 21, 90,12, 15};
    int sum = 0;
    for (int score:scores)
            sum+=score;
    return sum;
}

    public static void main(String[] args) {
       /* double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        selectionSort(new double[]{ 3.4 , 5 , 3 , 3.5 , 2.2 , 1.9 , 2 });

        */
        System.out.println(sumArrayElements());
    }
}
