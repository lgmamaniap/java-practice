package variablespractice;

public class VariablesPractice {

    public static void main(String[] args) {
        byte byteVariable;
        short shortVariable;
        int integerVariable;
        float floatVariable;
        long longVariable;
        double doubleVariable;
        char charVariable;
        boolean booleanVariable;
        
        byteVariable = 1;
        shortVariable = 3;
        integerVariable = 4;
        floatVariable = 5.4f;
        longVariable = 23445;
        doubleVariable = 2.3;
        charVariable = 'a';
        booleanVariable = true;
        
        System.out.printf("Valor byte: %d, valor short: %d%n", byteVariable, shortVariable);
        System.out.printf("Valor de int: %d, valor de float: %f%n", integerVariable, floatVariable);
        System.out.printf("Valor de long: %d, valor de double: %f%n", longVariable, doubleVariable);
        System.out.printf("Valor de char: %c, valor de boolean: %b%n", charVariable, booleanVariable);
    }
    
}
