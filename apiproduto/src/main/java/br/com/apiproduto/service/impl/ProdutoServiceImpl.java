package br.com.apiproduto.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.apiproduto.entity.Produto;
import br.com.apiproduto.repository.ProdutoRepository;
import br.com.apiproduto.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	private final ProdutoRepository produtoRepository;
		
	public ProdutoServiceImpl(ProdutoRepository produtoRepository){
		this.produtoRepository = produtoRepository;
	}
		
	
	@Override
	public List<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return produtoRepository.findAll();
	}

	@Override
	public Produto salvar(Produto produto) {
		// TODO Auto-generated method stub
		return produtoRepository.save(produto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		try {
			produtoRepository.deleteById(id);
		}catch(Exception e) {
			throw new RuntimeException("ocorreu um erro ao excluir o produto");
		}
	}

}
