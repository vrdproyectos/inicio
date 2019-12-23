import javax.swing.*;

public class comprobar_factorial_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long resultado=1L;//variable
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		//variable para guardar en una pantalla num q ingrese usuario en la q se convierte el num a entero
		
		for(int i=numero;i>0;i--) {
			//
		
		
		resultado=resultado*i;
	}

		System.out.println("El factorial de " + " numero " + resultado);
		
	}
}

	