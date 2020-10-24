
public class CaixaAlta implements StrategyFormatacao {
	
	@Override
	public String formataString(String texto) {
		String caixaAlta = texto.toUpperCase();
		return caixaAlta;
	}

}
