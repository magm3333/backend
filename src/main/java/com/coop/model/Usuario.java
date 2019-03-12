package com.coop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = -2799874789646240324L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idUser; //identity
	@Column(length=150, nullable=false)
	private String firstName; //maximo tamaño de 150
	@Column(length=150, nullable=false)
	private String lastName; //maximo tamaño de 150
	@Column(length=255,unique=true, nullable=false)
	private String email; //maximo tamaño de 255, unique
	@Column(length=70,unique=true, nullable=false)
	private String username; //maximo tamaño de 70, unique
	@Column(length=255, nullable=false)
	private String password; //maximo tamaño de 255
	@Column(columnDefinition="tinyint(4) default '1'")
	private boolean enabled; //tipo de mysql -> tinyint
	
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
	
}
