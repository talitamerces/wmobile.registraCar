package br.edu.ifba.wmobile.registracarro.cadeia;

public class Informe {

	private String horarioAtendimento = "";
	private String atendente = "";
	private String setor = "";
	
	public Informe(String horarioAtendimento, String atendente, String setor) {
		this.horarioAtendimento = horarioAtendimento;
		this.atendente = atendente;
		this.setor = setor;
	}

	public String getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(String horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Informe [horarioAtendimento=" + horarioAtendimento + ", atendente=" + atendente + ", setor=" + setor
				+ "]";
	}
	
	
	
}
