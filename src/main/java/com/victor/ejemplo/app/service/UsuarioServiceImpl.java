package com.victor.ejemplo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.ejemplo.app.entity.Usuario;
import com.victor.ejemplo.app.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository miRepositorio;
	
	@Override
	public List<Usuario> usuarios() {
		List<Usuario> usuarios = (List<Usuario>) miRepositorio.findAll();
		return usuarios;
	}

	@Override
	public Usuario usuario(Long id) {
		return miRepositorio.findById(id).get();
	}

	@Override
	public Usuario crear(Usuario usuario) {
		return miRepositorio.save(usuario);
	}

	@Override
	public Usuario modificar(Usuario usuario) {
		return miRepositorio.save(usuario);
	}

	@Override
	public String eliminar(Long id) {
		miRepositorio.deleteById(id);
		return "Usuario eliminado";
	}

}
