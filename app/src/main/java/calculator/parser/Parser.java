package calculator.parser;

import calculator.operand.Add;
import calculator.operand.Div;
import calculator.operand.Mul;
import calculator.operand.Node;
import calculator.operand.Sub;
import calculator.operand.Value;

public class Parser {

    public <T> Node parse(String token) {
        // 足し算
        var tuple = token.split("\\+", 2);
        if (tuple.length == 2) {
            var op = new Add();
            op.setLeft(parse(tuple[0].trim()));
            op.setRight(parse(tuple[1].trim()));
            return op;
        }

        // 引き算
        tuple = token.split("\\-", 2);
        if (tuple.length == 2) {
            var op = new Sub();
            op.setLeft(parse(tuple[0].trim()));
            op.setRight(parse(tuple[1].trim()));
            return op;
        }

        // 掛け算
        tuple = token.split("\\*", 2);
        if (tuple.length == 2) {
            var op = new Mul();
            op.setLeft(parse(tuple[0].trim()));
            op.setRight(parse(tuple[1].trim()));
            return op;
        }

        // 割り算
        tuple = token.split("\\/", 2);
        if (tuple.length == 2) {
            var op = new Div();
            op.setLeft(parse(tuple[0].trim()));
            op.setRight(parse(tuple[1].trim()));
            return op;
        }

        var v = token.trim();
        try {
            return new Value(Integer.parseInt(v));
        } catch (NumberFormatException e) {
            try {
                return new Value(Double.parseDouble(v));
            } catch (NumberFormatException e2) {
                throw new UnsupportedOperationException("Unsupported type for value");
            }
        }
    }
}
