package com.literalura.Literalura.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter implements IDataConverter{
	private ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public <T> T getData(String json, Class<T> clase) {
		try{
			return objectMapper.readValue(json, clase);
		}catch(JsonProcessingException e){
			System.out.println("Error al convertir los datos - " + e);
			throw new RuntimeException(e);
			
		}
	}
	
}
