package br.com.alura.java.novidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class Testes {
    public static void main(String[] args) {
        System.out.println("(Java Moderno > Java 8) == true");
        //Factory method
        List<String> nomes = List.of("nome1", "nome2", "nome3");
        System.out.println(nomes);

        //Fluxo reativo (exemplo aplicação de NFs)
        //Antes - enviava as NFs descontroladamente para o webservice se virar gerando gargalos, com riso de perdas ou não envios
        // Agora - o webservice que solicita a qtd de NFs que pode processar

        /*NotaFiscalSubscriver nfs = new NotaFiscalSubscriber();
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<NotaFiscal>();
        publisher.subscribe(nfs);

        NotaFiscal notaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());
        publisher.submit(notaFiscal);*/

        //variavel local (escopo de método)
        // o tipo da referencia fica implícito, o Java vai inferir o tipo em tempo de execução
        var inferenciaDeVariavel = new ArrayList<String>();
        inferenciaDeVariavel.add("Joao");
        System.out.println(inferenciaDeVariavel);

    }
}
