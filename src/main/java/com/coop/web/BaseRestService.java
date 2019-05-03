package com.coop.web;

import org.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.coop.model.Usuario;

public class BaseRestService {

	protected Usuario getUserLogged() {
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		return (Usuario)auth.getPrincipal();
	}
	
	protected JSONObject userToJsonObject(Usuario usuario) {
		JSONObject r=new JSONObject();
		r.put("username", usuario.getUsername());
		r.put("firstname", usuario.getFirstName());
		r.put("lastname", usuario.getLastName());
		r.put("email", usuario.getEmail());
		r.put("roles", usuario.getAuthorities());
		return r;
	}
	
}
