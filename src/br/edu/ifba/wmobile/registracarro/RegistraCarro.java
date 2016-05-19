package br.edu.ifba.wmobile.registracarro;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.wmobile.registracarro.cadeia.Informe;
import br.edu.ifba.wmobile.registracarro.cadeia.Setor;
import br.edu.ifba.wmobile.registracarro.cadeia.SetorEmplacamento;
import br.edu.ifba.wmobile.registracarro.cadeia.SetorSeguro;
import br.edu.ifba.wmobile.registracarro.cadeia.SetorVistoria;
import br.edu.ifba.wmobile.registracarro.cadeia.TipoServico;


@ManagedBean(name = "registra")
@SessionScoped
public class RegistraCarro {

	private String email = "";
	private Informe resultado = new Informe();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public List<String> getTiposServico() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Vistoria");
		tipos.add("Emplacamento");
		tipos.add("Seguro Automotivo");
		return tipos;
	}
	
	public void setServicoEscolhido(String tipoServico) {
		TipoServico tipo = TipoServico.SEM_SERVICO;
		if (tipoServico.equals("Vistoria")) {
			tipo = TipoServico.VISTORIA;
		} else if (tipoServico.equals("Emplacamento")) {
			tipo = TipoServico.EMPLACAMENTO;
		} else if (tipoServico.equals("Seguro Automotivo")) {
			tipo = TipoServico.SEGURO_AUTOMOTIVO;
		}

		Setor setor = new SetorVistoria();
		setor.setProximoSetor(new SetorEmplacamento());
		setor.setProximoSetor(new SetorSeguro());
		
		System.out.println("Agendado atendimento para " + email);
		
		resultado = setor.Exibir(tipo);
	}
	
	public Informe getResultadoEscolhido(){
		return resultado;
	}
	
	
}
