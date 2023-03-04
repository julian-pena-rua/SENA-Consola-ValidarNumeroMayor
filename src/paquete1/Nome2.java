package paquete1;
import java.util.Scanner;

public class Nome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		// entrada de una cadena
		 System.out.print("Ingrese dos números");
		 int numero = sc.nextInt();
	    int numero2 = sc.nextInt();
	   
	    if (numero < numero2) {
	    	System.out.print("Numero dos es mayor");
	    }
	    else {
	    	System.out.print("Numero uno es mayor");
	    }
		

	}
	
	
	

}
