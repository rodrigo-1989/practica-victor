package com.victor.ejemplo.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.victor.ejemplo.app.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
