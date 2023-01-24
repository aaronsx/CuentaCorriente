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
	ArrayList<String> CuentaBanc = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	//METODOS
	public ArrayList<String> crearCuenta (ArrayList<String> CuentaBanc)
	{
		double saldo=0.0;
		
		return CuentaBanc;
	}
	public bool CuentaInicio ()
	{
		char siquierecuenta;
		do
		{
			comprobar=true;
			System.out.println("Introduce una cuenta:");
			dni=sc.next();
			if(ExisteCuenta(dni, CuentaBanc))
			{
				System.out.println("");
				
				
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
	
	
	public void ingresarDinero (String dni, ArrayList<String> CuentaBanc)
	{
		
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
