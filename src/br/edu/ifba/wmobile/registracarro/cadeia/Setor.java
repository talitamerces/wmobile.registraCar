package br.edu.ifba.wmobile.registracarro.cadeia;

public abstract class Setor {

	// instanciando objeto
	protected Setor proximo = null;

	// método
	public void setProximoSetor(Setor proximo) {
		if (this.proximo != null) {
			this.proximo.setProximoSetor(proximo);
		} else {
			this.proximo = proximo;
		}

	}

	public abstract Informe Exibir(TipoServico servico);

}
