package com.adriana.tienda.servicio;

import java.util.List;

import com.adriana.tienda.datos.dto.DetalleUsuarioDTO;

public interface DUServicio {

	public DetalleUsuarioDTO addDTUsuario(int idUser, DetalleUsuarioDTO dtuDTO);

	public List<DetalleUsuarioDTO> getAll();
}
