package com.victor.ejemplo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.victor.ejemplo.app.entity.Usuario;
import com.victor.ejemplo.app.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> usuarios(){
		return new ResponseEntity<>(service.usuarios(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> usuario(@PathVariable Long id){
		return new ResponseEntity<>(service.usuario(id),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Usuario> crear(@RequestBody Usuario usuario){
		return new ResponseEntity<>(service.crear(usuario),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Usuario> editar(@RequestBody Usuario usuario){
		return new ResponseEntity<>(service.modificar(usuario),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminar(@PathVariable Long id){
		return new ResponseEntity<>(service.eliminar(id),HttpStatus.OK);
	}
}
