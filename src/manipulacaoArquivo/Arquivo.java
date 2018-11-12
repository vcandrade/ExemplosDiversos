package manipulacaoArquivo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vinícius
 */
public class Arquivo {

    public Arquivo() {
    
    }

    private int obterNumeroLinhas() throws FileNotFoundException, IOException {

        File arquivoLeitura = new File("d:\\teste.xls");
        
        LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));
        linhaLeitura.skip(arquivoLeitura.length());
        
        return linhaLeitura.getLineNumber();
    }
    
    public void criar() {

        try {

            BufferedWriter documento = new BufferedWriter(new FileWriter("d:\\teste.xls"));

            for (int cont = 1; cont <= 10; cont++) {

                documento.write("Linha \t\t" + cont);
                documento.newLine();
            }
            documento.close();

            System.out.println("Arquivo criado.");

        } catch (IOException ioe) {

            System.out.println("Erro ao criar o arquivo.");
        }
    }

    public void editar() {

        try {
            
            int ultimaLinha = obterNumeroLinhas() + 1;
            
            BufferedWriter documento = new BufferedWriter(new FileWriter("d:\\teste.xls", true));//o argumento "true" indica que o arquivo será editado a partir da última linha. 

            for (int cont = ultimaLinha; cont <= ultimaLinha + 9; cont++) {

                documento.write("Linha \t\t" + cont);
                documento.newLine();
            }
            documento.close();

            System.out.println("Arquivo editado.");

        } catch (IOException ioe) {

            System.out.println("Erro ao editar o arquivo.");
        }
    }

    public void ler() {

        try {
            BufferedReader documento = new BufferedReader(new FileReader("d:\\teste.xls"));
            String linha = documento.readLine();

            while (linha != null) {

                System.out.println(linha);
                linha = documento.readLine();
            }

            documento.close();

        } catch (IOException ioe) {

            System.out.println("Erro ao ler arquivo.");
        }
    }
}
