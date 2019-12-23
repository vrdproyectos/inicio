
public class Declaraciones_Operadores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double apulgadas=2.54; //constante 2,54 cm es 1 pulgada
		
		//apulgadas=8; no se puede variar el valor de apulgadas ya que es una constante
		
		double cm=6;//quiero saber cuantas pulgadas hay en 6cm
		
		double resultado=cm/apulgadas;
		
		System.out.println( "En "+ cm + " cm hay " + resultado + " pulgadas");

	}

}
