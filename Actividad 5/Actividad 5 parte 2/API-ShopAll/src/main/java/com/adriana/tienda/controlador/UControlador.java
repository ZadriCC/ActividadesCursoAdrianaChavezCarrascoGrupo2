package com.adriana.tienda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriana.tienda.datos.dto.UsuariosDTO;
import com.adriana.tienda.servicio.UServicio;

@RestController
@RequestMapping("/shopall/usuarios")
public class UControlador {

	@Autowired
	private UServicio uSer;

	@PostMapping("/agregar-usuario")
	public ResponseEntity<UsuariosDTO> addUsuario(@RequestBody UsuariosDTO uDTO) {
		return new ResponseEntity<>(uSer.addUsuario(uDTO), HttpStatus.CREATED);
	}

	@GetMapping("/mostrar-todos")
	public List<UsuariosDTO> getAll() {
		return uSer.getAll();
	}
}
