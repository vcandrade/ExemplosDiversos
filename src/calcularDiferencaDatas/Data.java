/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularDiferencaDatas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Vinícius
 */
public class Data {
    
    LocalDate d1 = LocalDate.of(2018, 06, 01);
    LocalDate d2 = LocalDate.now();

    public Data() {
        
        Period p = Period.between(d1, d2);
        System.out.println("Diferença em dias: " + p.getDays());
    }    
}
