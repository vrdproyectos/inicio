import java.util.*;

import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo ");
		
		int figura= entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Intoduce el lado"));//convertimos en entero  un string
			
			System.out.println("El area del cuadrado es " + Math.pow(lado,  2));
			
			break;
			
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del rect�gulo es " + base*altura);
			
			break;
			
		case 3:
			 
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del tri�ngulo es " + base*altura/2);
			
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
			default:
				
				System.out.println("La opci�n no es correcta");
			
		}
		

	}

}
