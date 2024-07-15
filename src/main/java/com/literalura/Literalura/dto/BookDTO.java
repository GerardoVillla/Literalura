package com.literalura.Literalura.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.literalura.Literalura.models.Author;
import com.literalura.Literalura.models.Language;

public record BookDTO(
		@JsonAlias("title") String title,
		@JsonAlias("authors") List<Author> authors,
		@JsonAlias("languages") List<Language> languages,
		@JsonAlias("download_count") double downloads

) {
	
}
