package africa.semicolon.deitelExercises.tddTest.turtle_graphics;

public class Pen {
    PenPosition penPosition;
    public Pen(){
        penPosition = PenPosition.UP;
    }
    public PenPosition getPosition() {
        return penPosition;
    }

    public void setPosition(PenPosition penPosition) {
        this.penPosition = penPosition;

    }
}
