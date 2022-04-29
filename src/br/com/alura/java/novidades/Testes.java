package br.com.alura.java.novidades;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class Testes {
    public static void main(String[] args) {
        System.out.println("(Java Moderno > Java 8) == true");
        //Factory method - 06/2014
        List<String> nomes = List.of("nome1", "nome2", "nome3");
        System.out.println(nomes);

        //Fluxo reativo (exemplo aplicação de NFs) - 08/2015
        //Antes - enviava as NFs descontroladamente para o webservice se virar gerando gargalos, com riso de perdas ou não envios
        // Agora - o webservice que solicita a qtd de NFs que pode processar

        /*NotaFiscalSubscriver nfs = new NotaFiscalSubscriber();
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<NotaFiscal>();
        publisher.subscribe(nfs);

        NotaFiscal notaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());
        publisher.submit(notaFiscal);*/

        //variavel local (escopo de método)
        // o tipo da referencia fica implícito, o Java vai inferir o tipo em tempo de execução - 03/2016
        var inferenciaDeVariavel = new ArrayList<String>();
        inferenciaDeVariavel.add("Joao");
        System.out.println(inferenciaDeVariavel);

        //Para rodar o Programa pelo terminal
        //Antes:
        //javac Program.java
        //java Program

        //Novidade em 12/2017
        //java Program.java

        //05/2014 - Atualizações da API HttpClient deixando mais verbosa, suporte ao Http2, requisições assincronas e paralelas
        /*var uri = "";
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());*/

        //Text Blocks - 04/2019
        escreverSql();

        //Helpful NullPointerExceptions - 03/2019

        //switch expressions - 12/2017

        var nome = "nome1";

        switch(nome){
            case "nome1", "nome2", "nome3" -> System.out.println("Achou o nome: "+ nome);
            default -> System.out.println("Não achou o nome");
        }

        //Records (Preview) 04/2019
        // Preview - podem estar ou não na próxima versão
        //Serve para facilitar a escrita de DTOs e entidades

        //vai gerar a classe pra nós com o construtor nome e cpf, com os atributos nome e cpf private,
        //tem os getters/setters de cada um, tem implementação de HashCode e Equals
        //record ClienteDTO(String nome, String cpf){}


    }

    public static void escreverSql(){
        String txt = """
                SELECT * FROM
                PRODUTO
                INNER JOIN CLIENTE...
                """;
        System.out.println(txt.length());
    }
}
