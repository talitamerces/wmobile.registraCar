package br.edu.ifba.wmobile.registracarro.cadeia;

public class SetorVistoria extends Setor {

	//instância das infromações para o atendimento do setor de vistoria
	private Informe informacao = new Informe("08:00 às 17:00", "Adalberto Tinoco", "Sala 5A");
	
	@Override
	public Informe Exibir(TipoServico servico) {
		if (servico == TipoServico.VISTORIA) {
			return informacao;
		}
		return proximo.Exibir(servico);
	}
}
