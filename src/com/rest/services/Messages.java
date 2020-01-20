package com.rest.services;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("/Mensajes")
public class Messages {
	
	//Con esto se tiene que ingresar a /Mensajes/diHola para ingresar a este recurso en especifico
	@Path("/diHola")
	@GET
	public String sayHello()
	{
		return "Hi Knee Breaker";
	}
}
