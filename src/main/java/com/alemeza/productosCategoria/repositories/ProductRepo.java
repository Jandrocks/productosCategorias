package com.alemeza.productosCategoria.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alemeza.productosCategoria.models.Producto;

public interface ProductRepo extends CrudRepository<Producto, Long> {
	
	List<Producto> findAll();

}