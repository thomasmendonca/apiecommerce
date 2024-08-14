package com.example.apiecommerce.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }
    public Produto create(Produto produto) {
        return produtoRepository.save(produto);
    }


}
