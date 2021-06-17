package africa.semicolon.deitelExercises.tddTest.chapter_5;

public class PythagoranTriple {
    public static void main(String[] args) {
        for(int sideA=1; sideA<=100; sideA++){
            for(int sideB=1; sideB<=100; sideB++){
                for(int sideC=1; sideC<=100; sideC++){
                    if(sideC *sideC == sideA*sideA +sideB*sideB)
                        System.out.println(sideA +" "+sideB+" "+sideC);
                }
            }
        }
    }
}
