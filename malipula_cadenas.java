
public class malipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Veronica";
		
		System.out.println("Mi nombre es " + nombre);
		
		System .out.println("Mi nombre tiene " + nombre.length() + " letras.");
		
		System.out.println("mi nombre " + nombre + " tiene como primera letra la "+ nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println(" Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
	}

}
