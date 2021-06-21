package africa.semicolon.deitelExercises.tddTest;

import java.util.Scanner;


public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of points ");
        int numberOfPoints = input.nextInt();

        // Create an array to store points
        double [][]points = new double[numberOfPoints][2];
        System.out.println("Enter "+numberOfPoints +" points: ");
        for(int i=0; i<points.length; i++){
            System.out.println("Enter first index ");
            points[i][0] = input.nextDouble();
            System.out.println("Enter second index ");
            points[i][1] = input.nextDouble();
        }

        int firstIndex = 0; int secondIndex = 1;
        double shortestDistance = distance(points[firstIndex][0], points[firstIndex][1],
                points[secondIndex][0], points[secondIndex][1]);
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if(shortestDistance >= distance){
                    firstIndex= i;
                    secondIndex = j;
                    shortestDistance = distance;
                }
            }
        }
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                if(shortestDistance == distance(points[i][0], points[i][1], points[j][0], points[j][1])) {
                    System.out.println("The closest two points are " +
                            "(" + points[i][0] + ", " + points[i][1] + ") and (" +
                            points[j][0] + ", " + points[j][1] + ")");
                }

            }}

    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

}
