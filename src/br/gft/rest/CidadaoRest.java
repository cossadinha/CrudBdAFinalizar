package br.gft.rest;

import java.util.ArrayList;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import br.gft.business.BusinessException;
import br.gft.business.BusinessFacade;
import br.gft.dao.CidadaoDao;
import br.gft.entidade.Cidadao;

@ApplicationPath("/cidadaorest")
public class CidadaoRest extends Application {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ArrayList<Cidadao> listar() {
		return new ArrayList<Cidadao>(new CidadaoDao().listar());
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Cidadao cidadao) {
		try {
			new BusinessFacade().inserirCidadao(cidadao);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

}
