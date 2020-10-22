

public class Conversao {

	public static void main(String[] args) {
		
		double temperaturaCelsius = 100;
		double temperaturaFahrenheit = 212;
		
		System.out.println(conversaoCelsiusEmFahrenheit(temperaturaCelsius));
		System.out.println(conversaoFahrenheitEmCelsius(temperaturaFahrenheit));
		
	}
		
		
	public static double conversaoCelsiusEmFahrenheit(double temperaturaCelsius){
		double conversaoCelsius = (temperaturaCelsius * 9/5) + 32;
		return conversaoCelsius;
	}
	
	
	public static double conversaoFahrenheitEmCelsius(double temperaturaFahrenheit){
		double conversaoFahrenheit = (temperaturaFahrenheit - 32) * 5/9;
		return conversaoFahrenheit;
	}
	
	
}
