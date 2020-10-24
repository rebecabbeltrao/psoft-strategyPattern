
public class Negrito implements StrategyFormatacao{

	@Override
	public String formataString(String texto) {
		String negrito = "Texto em negrito:" + texto;
		return negrito;
	}

}
