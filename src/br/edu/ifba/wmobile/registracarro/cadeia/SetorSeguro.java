package br.edu.ifba.wmobile.registracarro.cadeia;

public class SetorSeguro extends Setor{

	//instância das infromações para o atendimento do setor de seguro automotivo
		private static Informe informacao = new Informe("SEGURO AUTOMOTIVO","10:00 às 17:00", "Lorena Assion", "Sala 3A");
		
		public Informe Exibir(TipoServico servico) {
			if (servico == TipoServico.SEGURO_AUTOMOTIVO) {
				return informacao;
			}
			return null;
		}
	
}
