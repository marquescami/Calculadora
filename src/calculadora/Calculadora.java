package calculadora;

public class Calculadora {

	private double cliques;
	private double compartilhamento;
	private double visualizacaoPosCompartilhamento;
	static final int VISUALIZACAO_POR_REAL_INVESTIDO = 30;

	public int calculaVisualizacao(double valorTotalnvestido) {

		// Calcula visualiza��o sem compartilhamento
		double visualizacaoSemCompartilhamento = valorTotalnvestido * VISUALIZACAO_POR_REAL_INVESTIDO;

		// Calcula visualiza��o primeiro compartilhamento
		double visualizacao1Compartilhamento = calculavisualizacaoPosCompartilhamento(visualizacaoSemCompartilhamento);

		// Calcula visualiza��o segundo compartilhamento
		double visualizacao2Compartilhamento = calculavisualizacaoPosCompartilhamento(visualizacao1Compartilhamento);

		// Calcula visualiza��o terceiro compartilhamento
		double visualizacao3Compartilhamento = calculavisualizacaoPosCompartilhamento(visualizacao2Compartilhamento);

		return (int) (visualizacaoSemCompartilhamento + visualizacao1Compartilhamento + visualizacao2Compartilhamento
				+ visualizacao3Compartilhamento);
	}

	/**
	 * M�todo utilizado para calcular a estimativa das visualiza��es dos anuncios considerando 3 compartilhamentos.
	 * @param visualizacoes
	 * @return Resultado da quantidade m�xima de pessoas que visualizar�o o anuncio de acordo com cada compartilhamento
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