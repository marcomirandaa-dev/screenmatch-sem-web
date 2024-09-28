package br.com.alura.screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
//JsonAlias é camelCase, caso não obedeça a regra o retorno será null.
public record DadosEpisodio(@JsonAlias("Title")String titulo,
                            @JsonAlias("Episode")Integer numeroEpisodio,
                            @JsonAlias("imdbRating")String avaliacao,
                            @JsonAlias("Released")String dataLancamento) {
}
