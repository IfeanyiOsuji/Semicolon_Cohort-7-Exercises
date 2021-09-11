package africa.semicolon.deitelExercises.tddTest.chapter_14;

public class IntegerToCharacter {
    public static char convertIntegerTo(int number){
        return (char)number;
    }
    public static String displayIntToCharTable(){
        StringBuilder builder = new StringBuilder();
        String header = """
                INTEGER             CHARACTER
                """;
        System.out.println(header);
        for(int i=0; i<=255; i++){
            builder.append("""
                    %03d              %3c
                    """.formatted(i, convertIntegerTo(i)));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertIntegerTo(65));
        System.out.println(displayIntToCharTable());
    }
}
