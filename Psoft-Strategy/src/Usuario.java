
public class Usuario {
	
private StrategyFormatacao strategyFormatacao;
	
	public Usuario(StrategyFormatacao strategyFormatacao) {
		this.strategyFormatacao = strategyFormatacao;
	}
	
	public String formataString(String texto) {
		return strategyFormatacao.formataString(texto);
	}
}
