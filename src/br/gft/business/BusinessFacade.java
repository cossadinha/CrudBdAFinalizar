package br.gft.business;

import java.util.List;

import br.gft.entidade.Cidadao;

public class BusinessFacade {

	public void inserirCidadao(Cidadao cidadao) throws BusinessException {
		new CidadaoBusiness().inserir(cidadao);
	}
	
	public List<Cidadao> listar() {
		return null; 
	}
}
