
public class CaixaBaixa implements StrategyFormatacao {

	@Override
	public String formataString(String texto) {
		String caixaBaixa = texto.toLowerCase();
		return caixaBaixa;
	}

}
