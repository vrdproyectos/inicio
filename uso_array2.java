
public class uso_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]paises={"Espa�a", "M�xico", "Colombia", "Per�", "Chile","Argentina", "Ecuador", "Venezuela"};
		
		/*for(int i=0; i<paises.length;i++) {
			
			System.out.println("Pa�s" +(i+ 1) +" "+ paises[i]);		
			
			}*/

		
		for(String elemento:paises) {
			
			System.out.println("Pais: "+ elemento);
			
			
		}

}
}