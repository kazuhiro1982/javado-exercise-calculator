package calculator.util;

public class OperatorUtils {

    public static boolean isIntegerType(Object number) {
        return number instanceof Integer || number instanceof Long || number instanceof Short || number instanceof Byte;
    }

    public static boolean isRealType(Object number) {
        return number instanceof Float || number instanceof Double;
    }

}
