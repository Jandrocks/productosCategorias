package com.alemeza.productosCategoria.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alemeza.productosCategoria.models.Categoria;
import com.alemeza.productosCategoria.models.Producto;

public interface CategoryRepo extends CrudRepository<Categoria, Long>{
	List<Categoria> findAll();
	List<Categoria> findByProductsNotContains(Producto producto);
}