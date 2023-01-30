package clase.dto;
import java.util.ArrayList;
import java.util.Scanner;
public class CuentaCorriente 
{
	//CONSTRUCTORES
	
	//Atributos
	private String dni;
	private String nombreTitular;
	private boolean comprobar;
	private double saldoCuenta;
	//Getters y Setters
	/*
	 * Se utiliza para que software externo a la clase pueda tener acceso a los atributos.
	 * */
	
	ArrayList<String> CuentaBanc = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	//Metodos
	private ArrayList<String> crearCuenta (ArrayList<String> CuentaBanc)
	{
		string opcionEntradaDni;
		string p`copmEmytasaNombre;
		System.out.println("Introduce el dni del titular: ");
		opcionEntradaDni=sc.next();
		return CuentaBanc;
	}
	private void CuentaInicio ()
	{
		char siquierecuenta;
		do
		{
			comprobar=true;
			System.out.println("Introduce una cuenta:");
			dni=sc.next();
			if(ExisteCuenta(dni, CuentaBanc))
			{
				System.out.println("Introduce su contraseña: ");
				
				
			}
			else
			{
				comprobar=true;
				System.out.println("Usted no tiene una cuenta quieres abrirla? pulse y para si y n para no");
				siquierecuenta=sc.next().charAt(0);
				
				switch(siquierecuenta)
				{
				case 'y' : case 'Y':
					crearCuenta(CuentaBanc);
					break;
				case 'n' : case 'N':
					System.out.println("Vale, no quieres cuenta? pues te quedas sin movil");
					break;
					default:
						System.out.println("introduce y=YES n=NO");
						comprobar=false;
				}
				
				
			}

		}while(!comprobar);
			
	}
	private double ingresarDinero ()
	{
		return 0.0;
	}
	private ArrayList<CuentaCorriente> mostrarInformación (String dni, ArrayList<String> CuentaBanc)
	{
		return null;
	}
	private boolean sacarDinero (double sacarDineroCuenta, double saldoCuenta, ArrayList<String> CuentaBanc)
	{
		if(sacarDineroCuenta>=saldoCuenta)
			return true;
		else
			return false;
	}
	private boolean ExisteCuenta (String siTienesCuenta, ArrayList<String> CuentaBanc) 
	{
		if (CuentaBanc.contains(siTienesCuenta))
			return true;
		
		return false;
		
		
	}
}
