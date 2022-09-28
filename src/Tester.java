/**
 * @author Drumstyle92
 * Class that contains the main method.
 */
public class Tester {
    /**
     *
     * @param args Primary parameter that serves as a command line argument array whose data type is String.
     * The main method of the whole program.
     */
    public static void main(String[] args){
ArithmeticOperators arithmeticOperators1 = new ArithmeticOperators();
ArithmeticOperators arithmeticOperators2 = new ArithmeticOperators();
ArithmeticOperators arithmeticOperators3 = new ArithmeticOperators();
ArithmeticOperators arithmeticOperators4 = new ArithmeticOperators();

System.out.printf("Somma: %d %nDifferenza: %d %n",arithmeticOperators1.sum(4,8),arithmeticOperators2.sub(5,10));
System.out.printf("Prodotto: %d %nDivisione: %d %n",arithmeticOperators3.mul(6,8),arithmeticOperators4.div(16,8));
    }
}
