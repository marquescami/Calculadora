package calculadora;

public class Calculadora {

	private double cliques;
	private double compartilhamento;
	private double visualizacaoPosCompartilhamento;
	static final int VISUALIZACAO_POR_REAL_INVESTIDO = 30;

	public int calculaVisualizacao(double valorTotalnvestido) {

		// Calcula visualização sem compartilhamento
		double visualizacaoSemCompartilhamento = valorTotalnvestido * VISUALIZACAO_POR_REAL_INVESTIDO;

		// Calcula visualização primeiro compartilhamento
		double visualizacao1Compartilhamento = calculavisualizacaoPosCompartilhamento(visualizacaoSemCompartilhamento);

		// Calcula visualização segundo compartilhamento
		double visualizacao2Compartilhamento = calculavisualizacaoPosCompartilhamento(visualizacao1Compartilhamento);

		// Calcula visualização terceiro compartilhamento
		double visualizacao3Compartilhamento = calculavisualizacaoPosCompartilhamento(visualizacao2Compartilhamento);

		return (int) (visualizacaoSemCompartilhamento + visualizacao1Compartilhamento + visualizacao2Compartilhamento
				+ visualizacao3Compartilhamento);
	}

	/**
	 * Método utilizado para calcular a estimativa das visualizações dos anuncios considerando 3 compartilhamentos.
	 * @param visualizacoes
	 * @return Resultado da quantidade máxima de pessoas que visualizarão o anuncio de acordo com cada compartilhamento
	 */
	
	public double calculavisualizacaoPosCompartilhamento(double visualizacoes) {

		// calcula cliques
		cliques = (visualizacoes * 0.12);

		// calcula Compartilhamento
		compartilhamento = (cliques * 0.15);

		// calcula VisualizacaoCompartilhamento
		visualizacaoPosCompartilhamento = (compartilhamento * 40);

		return visualizacaoPosCompartilhamento;
	}

}