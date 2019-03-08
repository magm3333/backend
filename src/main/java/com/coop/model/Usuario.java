package com.coop.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = -2799874789646240324L;

	private long idUser; //identity
	private String firstName; //maximo tamaño de 150
	private String lastName; //maximo tamaño de 150
	private String email; //maximo tamaño de 255, unique
	private String username; //maximo tamaño de 70, unique
	private String password; //maximo tamaño de 255
	private boolean enabled; //tipo de mysql -> tinyint
	
	
}
