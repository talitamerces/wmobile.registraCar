package br.edu.ifba.wmobile.registracarro.cadeia;

public class Informe {

	private String nome = "";
	private String horarioAtendimento = "";
	private String atendente = "";
	private String setor = "";

	public Informe(String nome, String horarioAtendimento, String atendente, String local) {
		this.nome = nome;
		this.horarioAtendimento = horarioAtendimento;
		this.atendente = atendente;
		this.setor = local;
	}

	public Informe() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return "Informe [nome=" + nome + ", horarioAtendimento=" + horarioAtendimento + ", atendente=" + atendente
				+ ", setor=" + setor + "]";
	}

}
