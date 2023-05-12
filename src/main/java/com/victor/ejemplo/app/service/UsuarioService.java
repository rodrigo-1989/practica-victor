package com.victor.ejemplo.app.service;

import java.util.List;

import com.victor.ejemplo.app.entity.Usuario;

public interface UsuarioService {

	List<Usuario> usuarios();

	Usuario usuario(Long id);

	Usuario crear(Usuario usuario);

	Usuario modificar(Usuario usuario);

	String eliminar(Long id);
}
