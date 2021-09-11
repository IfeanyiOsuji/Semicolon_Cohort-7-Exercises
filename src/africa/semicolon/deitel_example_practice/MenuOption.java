package africa.semicolon.deitel_example_practice;

public enum MenuOption {
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);


    private final int values;
    private MenuOption(int values){
        this.values = values;
    }
}
