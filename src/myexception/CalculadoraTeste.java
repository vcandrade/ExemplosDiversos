package myexception;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */

public class CalculadoraTeste {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        System.out.println(calc.dividir(10, 0));
    }
}
