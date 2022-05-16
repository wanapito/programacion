package dominio.clasesInterfaces;

public class ImplementacionMySql implements IAccesoDatos {

	@Override
	public void insertar() {
		System.out.println("insertar desde Mysql");
	}

	@Override
	public void listar() {
		System.out.println("listar desde Mysql");
	}

	@Override
	public void actualizar() {
		System.out.println("actualizar desde Mysql");
	}

	@Override
	public void eliminar() {
		System.out.println("eliminar desde Mysql");

	}

}
