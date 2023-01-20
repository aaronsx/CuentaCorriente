package clase.dto;
import java.util.ArrayList;
import java.util.Scanner;
public class CuentaCorriente 
{
	//CONSTRUCTORES
	
	//ATRIBUTOS
	String dni;
	String nombreTitular;
	double saldoCuenta;
	ArrayList<String> CuentaBanc = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	//METODOS
	public ArrayList<String> crearCuenta (ArrayList<String> CuentaBanc)
	{
		double saldo=0.0;
		
		return CuentaBanc;
	}
	public void CuentaNueva ()
	{
		System.out.println("Introduce una cuenta:");
		dni=sc.next();
		if( ExisteCuenta(dni, CuentaBanc))
		{
			
		}
		else
			crearCuenta(CuentaBanc);
	}
	
	public void ingresarDinero (double saldoCuenta,String dni, ArrayList<String> CuentaBanc)
	{
		
	}
	public void mostrarInformación (String dni)
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
