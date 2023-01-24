package clase.dto;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {

	public static void main(String[] args) 
	{
		CuentaCorriente.

	}
	public void MenuCuenta (String dni, ArrayList<String> CuentaBanc)
	{
		boolean comprobar;
		int menu;
		Scanner sc = new Scanner(System.in);
		 System.out.println("\n\n\t\t╔══════════════════════════════════════╗");
		 System.out.println("\t\t║ Buenas que interacion deseas realizar║");
		 System.out.println("\t\t╠══════════════════════════════════════╣");
		 System.out.println("\t\t║                                      ║");
		 System.out.println("\t\t║         1) Sacar Dinero              ║");
		 System.out.println("\t\t║                                      ║");
		 System.out.println("\t\t║         2) Ingresar Dinero           ║");
		 System.out.println("\t\t║                                      ║");
		 System.out.println("\t\t║         3) Mostrar informacion       ║");
		 System.out.println("\t\t║______________________________________║");
		 System.out.println("\t\t║                                      ║");
		 System.out.println("\t\t║            0) Salir                  ║");
		 System.out.println("\t\t╚══════════════════════════════════════╝");
		 
		 
		 
		 do
			{
				comprobar=true;
				menu=sc.nextInt();
				 switch (menu)
		         {
		             case 1:
		            	 CuentaCorriente.sacarDinero(dni,CuentaBanc);
		                 break;

		             case 2:
		            	 CuentaCorriente.ingresarDinero();
		                 break;

		             case 3:
		            	 CuentaCorriente.mostrarInformación(dni,CuentaBanc);
		                 break;

		             default:
		            	 System.out.println("Porfavor introduce un numero del menu");
		            	 comprobar=false;
		         }
			}while(!comprobar);
		 sc.close();
		 
		
	}

}
