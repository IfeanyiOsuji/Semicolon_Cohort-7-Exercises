package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class TabularOutput {
    public static void main(String[] args) {
        String heading = """
    N       10^N        100^N       1000^N
                """;
        System.out.println(heading);
        for(int i=1; i<=5; i++)
            System.out.printf("%d\t\t%d\t\t\t%d\t\t\t%d\n",i, i*10, i*10*10, i*10*10*10);
        int row = 10;
        while (row >= 1)
        {
            int column = 1;
            while (column <= 10)
            {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            }
            --row;
            System.out.println();
        }
    }
}
