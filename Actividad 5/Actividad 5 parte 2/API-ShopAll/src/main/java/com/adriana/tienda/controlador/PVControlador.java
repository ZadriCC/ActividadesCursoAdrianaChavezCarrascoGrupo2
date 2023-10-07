package com.adriana.tienda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriana.tienda.datos.dto.PerfilVendedorDTO;
import com.adriana.tienda.servicio.PVServicio;

@RestController
@RequestMapping("/shopall/perfil-vendedor")

public class PVControlador {

	@Autowired
	private PVServicio pvSer;

	@PostMapping("/usuarios/{usuarios}")
	public ResponseEntity<PerfilVendedorDTO> addVendedor(@PathVariable(value = "usuarios") int usuarios,
			@RequestBody PerfilVendedorDTO pvDTO) {
		return new ResponseEntity<>(pvSer.addPerfilVendedor(usuarios, pvDTO), HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public List<PerfilVendedorDTO> getAll() {
		return pvSer.getAll();
	}

}
