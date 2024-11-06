package calculator.operand;

import calculator.util.OperatorUtils;

public class Add implements Operator {

    private Node left;
    private Node right;

    @Override
    public Number get() {
        var leftValue = left.get();
        var rightValue = right.get();

        if (OperatorUtils.isIntegerType(leftValue) && OperatorUtils.isIntegerType(rightValue)) {
            return leftValue.intValue() + rightValue.intValue();
        } else if (OperatorUtils.isRealType(leftValue) && OperatorUtils.isRealType(rightValue)) {
            return leftValue.doubleValue() + rightValue.doubleValue();
        } else {
            throw new UnsupportedOperationException("Unsupported type for add");
        }
    }

    @Override
    public void setLeft(Node node) {
        this.left = node;
    }

    @Override
    public void setRight(Node node) {
        this.right = node;
    }

}