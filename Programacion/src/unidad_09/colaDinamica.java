package unidad_09;

public class colaDinamica implements pilasColasDinamicas{
	private nodo primero;
	private nodo ultimo;
	public colaDinamica()
	{
		primero = null;
		ultimo = null;
	}
	
	public boolean vacia()
	{
		return (primero == null);
	}
	
	public void insertar(Object obj)
	{
		nodo nuevo = new nodo(obj,null);
		
		if(vacia())
			primero = nuevo;
		else
			ultimo.enlace = nuevo;
			
		ultimo = nuevo;
	}
	
	public Object eliminar()
	{
		try
		{
			if(vacia())
				throw new colaVacia();
			else
			{
				Object aux = primero.inf;
				primero = primero.enlace;
				
				if(vacia())
					ultimo = null;
					
				return aux;
			}
		}
		
		catch(colaVacia error)
		{
			System.out.println("error cola vacia");
			return null;
		}
	}
}

class colaVacia extends Exception
{
	public colaVacia()
	{
		super();
	}
}