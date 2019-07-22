package myexception;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */
public class Calculadora {

    public double dividir(double numerador, double denominador) {

        try {

            if (numerador / denominador < Double.MAX_VALUE) {

                return numerador / denominador;

            } else {

                throw new DivisaoZero("Não é possível dividir por zero.");
            }

        } catch (DivisaoZero ex) {

            System.out.println("Erro: " + ex.getMessage());
            return 0.0;
        }
    }
}
