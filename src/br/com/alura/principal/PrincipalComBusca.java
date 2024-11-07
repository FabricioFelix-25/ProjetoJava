package br.com.alura.principal;


import br.com.alura.screematch.excecao.ErroDeConversaoDeAnoExceptio;
import br.com.alura.screematch.modelos.Titulo;
import br.com.alura.screematch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";

        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")){


        System.out.println("Digite um filme para busca: ");
        busca = leitura.nextLine();

        if (busca.equalsIgnoreCase("sair")){
            break;
        }

        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=67f7dd6b";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(response.body());

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            //try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("titulo ja convertido " );
            System.out.println(meuTitulo);


            titulos.add(meuTitulo);


        }catch (NumberFormatException e) {
            System.out.println("aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (ErroDeConversaoDeAnoExceptio e) {
            System.out.println(e.getMessage());
        }

        }
        System.out.println(titulos);
        System.out.println("correto");



    }
}
