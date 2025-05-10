package br.unitins.biblioteca3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Livro {
    @Id
    Long idLivro;
    String titulo;
    String autor;
    String editora;
    int qtdePaginas;

}
