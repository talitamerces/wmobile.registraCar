package br.edu.ifba.wmobile.registracarro.cadeia;

public class SetorEmplacamento extends Setor{
	//instância das infromações para o atendimento do setor de emplacamento
		private static Informe informacao = new Informe("EMPLACAMENTO", "10:00 às 18:00", "Simone Suan", "Sala 1A");
		
		public Informe Exibir(TipoServico servico) {
			if (servico == TipoServico.EMPLACAMENTO) {
				return informacao;
			}
			return proximo.Exibir(servico);
		}
}
