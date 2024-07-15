package com.literalura.Literalura.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientAPI {
	private final String base = "https://gutendex.com/books";
	
	public String getResponse(String url){
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(base + url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
			System.out.println("Entrada no valida, reintente - " + e);
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
			System.out.println("Algo salio mal, reintente - " + e);
            throw new RuntimeException(e);
        }
        String json = response.body();
        return json;
	}
	
	
}
