package br.gft.dao;

import br.gft.entidade.Cidadao;

public class FabricaDao {
	
	public static Dao<Cidadao> criarCidadaoDao() {
		return new CidadaoDao();
	}

}
