package br.edu.ifba.wmobile.registracarro.cadeia;

public class SetorSeguro extends Setor{

	//inst�ncia das infroma��es para o atendimento do setor de seguro automotivo
		private static Informe informacao = new Informe("SEGURO AUTOMOTIVO","10:00 �s 17:00", "Lorena Assion", "Sala 3A");
		
		public Informe Exibir(TipoServico servico) {
			if (servico == TipoServico.SEGURO_AUTOMOTIVO) {
				return informacao;
			}
			return null;
		}
	
}
