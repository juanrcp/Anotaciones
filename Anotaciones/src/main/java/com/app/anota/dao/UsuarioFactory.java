package com.app.anota.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fabrica")
public class UsuarioFactory {

	//Con esto hacemos la sobreescritura cambiando el UsuarioImplMongo por UsuarioImplOracle hacemos la inversion.
	@Autowired
	UsuarioImplMongo usr;
	
	//Con esto accedemos al metodo que necesitamos
	public void getInserta() {
		usr.inserta();
	}
}
