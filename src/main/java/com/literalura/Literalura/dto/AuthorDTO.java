package com.literalura.Literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AuthorDTO(
		@JsonAlias("name") String name,
		@JsonAlias("birth_year") int birthDay,
		@JsonAlias("death_year") int deathDay
) {
	
}
