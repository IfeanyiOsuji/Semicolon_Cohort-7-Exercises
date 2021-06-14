package africa.semicolon.deitelExercises.tddTest;

import java.util.Arrays;

public class RemovingDuplicatesInArray {
    public static void main(String[] args) {
        int count = 0;
        int[] number = {2, 5, 5, 7, 8, 9, 10, 12, 8, 10,12, 9, 13, 11, 3, 2, 100, 101,100,105};
        String uniqNumbers = "";
        for (int i = 0; i < number.length; i++) {
            if (uniqNumbers.contains(" "+Integer.toString(number[i])+" "))
                continue;
            if(uniqNumbers.contains(Integer.toString(number[0])+" ") && Integer.toString(number[i]).equals(Integer.toString(number[0])))
                continue;
            else
                uniqNumbers += (Integer.toString(number[i]))+" ";
            count++;
        }
        System.out.println(uniqNumbers);
        System.out.println(count);

        int[] uniqe = new int[count];
        // Arrays.sort(numbers);
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < i; j++) {

                if (number[i] == number[j])
                    break;
                    if (i == j)
                        //uniqe[i] = numbers[i];
                        System.out.print(number[i]+" ");

                // isUnique = true;

            }

            }
        System.out.println(Arrays.toString(uniqe));
        }
    }