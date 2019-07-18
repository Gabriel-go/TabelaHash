/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahash;

import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Teste {

    public static void TesteAdd() {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();
        
        int tam = conjunto.size();
        
        System.out.println("Tamanho: "+ tam);
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }

    public static void TesteRemove() {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();

        System.out.println("antes de remover");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        conjunto.remove("Rafael");
        
        int tam = conjunto.size();
        
        palavras = conjunto.pegaTodas();

        System.out.println("depois de remover");
        System.out.println("Tamanho: "+ tam);
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }

    
}
