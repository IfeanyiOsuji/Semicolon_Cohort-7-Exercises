package africa.semicolon.deitelExercises.tddTest.myers_briggs;

public class Response {

    private char responseType;

    public Response(char responseType) {
        this.responseType = responseType;
    }

    public Response() {

    }

    public void setType(char responseType) {
        this.responseType = responseType;
    }

    public char getType() {
        return responseType;
    }

    @Override
    public String toString() {
        return Character.toString(responseType);
    }
}
