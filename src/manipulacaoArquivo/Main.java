package manipulacaoArquivo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vinícius
 */
public class Main {

    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo();
//        arquivo.criar();
        arquivo.ler();
        arquivo.editar();
        arquivo.ler();

    }
}
