import java.util.Scanner;

public class condicionales_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);// para almacenar datos en consola
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		if(edad<18) {
			System.out.println("Eres adolescente");
		}
		
		else if(edad<40) {
			System.out.println("Eres joven");	
		}
		
		else if(edad<65) {
			
			System.out.println("Eres maduro");
	
		}
		
		else {
			
			System.out.println("Cuidate");
		}
	}

}
