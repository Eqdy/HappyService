package com.happyPaw.ws.rest.service;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.happyPaw.ws.rest.vo.VOUsuario;

@Path("/PruebaRs")
public class ServiceLogin {
	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public String validarUsuario(){
		VOUsuario vo=new VOUsuario();
		vo.setUserValido(false);
		if(vo.getUsuario().equals("ER") && vo.getPassword().equals("12345")){
			vo.setUserValido(true);
		}
		return "listo";
	}
}
