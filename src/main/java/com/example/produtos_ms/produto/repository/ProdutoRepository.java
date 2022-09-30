package com.example.produtos_ms.produto.repository;

import com.example.produtos_ms.produto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
