package com.literalura.Literalura.services;

public interface IDataConverter {
	<T> T getData(String json, Class<T> clase);
}
