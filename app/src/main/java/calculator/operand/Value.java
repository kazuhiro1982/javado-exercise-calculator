package calculator.operand;

public class Value implements Node {

    private Number value;

    public Value(Number value) {
        this.value = value;
    }

    @Override
    public Number get() {
        return value;
    }

}
