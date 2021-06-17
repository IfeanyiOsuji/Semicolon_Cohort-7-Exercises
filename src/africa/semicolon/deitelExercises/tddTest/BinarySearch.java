package africa.semicolon.deitelExercises.tddTest;

import java.util.Arrays;

public class BinarySearch {
    public static int searchKey(int[] arrayList, int key) {
        int low = 0;
        int high = arrayList.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(key < arrayList[mid])
                high = mid - 1;
            else if(key > arrayList[mid])
                low = mid+1;
            else
                return mid;

        }
        return -low -1;
    }

    public static String insertKeyIfNotFound(int[] arrayList, int key) {
        int low = 0;
        int high = arrayList.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(key < arrayList[mid])
                high = mid - 1;
            else if(key > arrayList[mid])
                low = mid+1;
            else
                return Integer.toString(mid);

        }
        arrayList[-low-1] = key;
        return Arrays.toString(arrayList);
    }
}
