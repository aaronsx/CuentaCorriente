package clase.dto;
import java.util.ArrayList;
import java.util.Scanner;
public class CuentaCorriente 
{
	//CONSTRUCTORES
	
	//ATRIBUTOS
	String dni;
	String nombreTitular;
	String contraseña;
	boolean comprobar;
	double saldoCuenta;
	int menu;
	ArrayList<String> CuentaBanc = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	//METODOS
	public ArrayList<String> crearCuenta (ArrayList<String> CuentaBanc)
	{
		double saldo=0.0;
		
		return CuentaBanc;
	}
	public void CuentaInicio ()
	{
		do
		{
			comprobar=true;
			System.out.println("Introduce la contraseña");
			contraseña=sc.next();
			if(!ExisteCuenta(contraseña, CuentaBanc))
			{
				System.out.println("Contraseña incorrecta vuelve a intentarlo");
				comprobar=false;
			}
			else
			{
				
			}
		}while(!comprobar);
		System.out.println("Introduce una cuenta:");
		dni=sc.next();
		if(ExisteCuenta(dni, CuentaBanc))
		{
			
		}
		else
			crearCuenta(CuentaBanc);
	}
	
	public void ingresarDinero (String dni, ArrayList<String> CuentaBanc)
	{
		
	}
	public void MenuCuenta (String dni, ArrayList<String> CuentaBanc)
	{
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
		            	 sacarDinero(dni,CuentaBanc);
		                 break;

		             case 2:
		            	 ingresarDinero();
		                 break;

		             case 3:
		            	 mostrarInformación(dni,CuentaBanc);
		                 break;

		             default:
		            	 System.out.println("Porfavor introduce un numero del menu");
		            	 comprobar=false;
		         }
			}while(!comprobar);
		 
		 
		
	}
	public void mostrarInformación (String dni, ArrayList<String> CuentaBanc)
	{
		
	}
	public boolean sacarDinero (double sacarDineroCuenta, double saldoCuenta)
	{
		if(sacarDineroCuenta>=saldoCuenta)
			return true;
		else
			return false;
	}
	public boolean ExisteCuenta (String siTienesCuenta, ArrayList<String> CuentaBanc) 
	{
		if (CuentaBanc.contains(siTienesCuenta))
			return true;
		
		return false;
		
		
	}
}
