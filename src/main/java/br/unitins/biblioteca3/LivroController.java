package br.unitins.biblioteca3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroController {
    @Autowired
    LivroService livroService;

    @GetMapping("/livros")
    List<Livro> pegarLivros(){

        return livroService.getLivros();
    }
    @PostMapping
    Livro salvarLivro(Livro livro){
        return livroService.criarLivro(livro);
    }
}
