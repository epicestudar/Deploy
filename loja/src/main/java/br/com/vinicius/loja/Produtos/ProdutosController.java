package br.com.vinicius.loja.Produtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProdutosController {
    @Autowired
    ProdutosRepository pr;

    @GetMapping("/loja")
    public List<Produto> list() {
        return (List<Produto>) this.pr.findAll();
    }

    @PostMapping("/loja")
    public Produto create(@RequestBody Produto produto) {
        return pr.save(produto);
    }
    
    
}
