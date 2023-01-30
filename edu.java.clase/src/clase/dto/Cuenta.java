package clase.dto;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {
	
	public static void main(String[] args) 
	{
			//Inicializar el tipo cuenta
			CuentaCorriente ccc = new CuentaCorriente();
			// Lista de cuentas (BD)
			ArrayList<CuentaCorriente> listaCcc = new ArrayList<>();
			//Imprimir el menu por consola
			
			
			//crear cuenta listaCcc.add(ccc.crearCuenta());

	}
	public void menuInicio ()
	{
		Scanner sc = new Scanner(System.in);
		
		 boolean comprobar;
		 int menu;
		 System.out.println("\n\n\t\t╔══════════════════════════════════════╗");
		 System.out.println("\t\t║ Buenas que interacion deseas realizar║");
		 System.out.println("\t\t╠══════════════════════════════════════╣");
		 System.out.println("\t\t║                                      ║");
		 System.out.println("\t\t║         1) Inicio de sesion          ║");
		 System.out.println("\t\t║                                      ║");
		 System.out.println("\t\t║         2) Crear cuenta              ║");
		 System.out.println("\t\t║______________________________________║");
		 System.out.println("\t\t║                                      ║");
		 System.out.println("\t\t║            0) Salir                  ║");
		 System.out.println("\t\t╚══════════════════════════════════════╝");
	}
	public void menuCuenta (String dni, ArrayList<String> CuentaBanc)
	{
		CuentaCorriente ccc = new CuentaCorriente();
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
		            	 ccc.sacarDinero(dni,CuentaBanc);
		            	 comprobar=false;
		                 break;

		             case 2:
		            	  double ho=ccc.ingresarDinero();
		            	  comprobar=false;
		                 break;

		             case 3:
		            	 ccc.mostrarInformación(dni,CuentaBanc);
		            	 comprobar=false;
		                 break;
		             case 0:
		                 break;
		             default:
		            	 System.out.println("Porfavor introduce un numero del menu");
		            	 comprobar=false;
		         }
			}while(!comprobar);
		 sc.close();
		 
		
	}

}
