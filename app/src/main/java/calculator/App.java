/*
 * This source file was generated by the Gradle 'init' task
 */
package calculator;

import calculator.parser.Parser;

public class App {
    public static void main(String[] args) {
        var parser = new Parser();
        var node = parser.parse(args[0]);

        System.out.println("result: " + node.get());
    }
}
