
public class Italico implements StrategyFormatacao {

	@Override
	public String formataString(String texto) {
		String italico = "Texto em itálico:" + texto;
		return italico;
	}

}
