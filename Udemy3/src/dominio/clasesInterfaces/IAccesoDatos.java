package dominio.clasesInterfaces;

public interface IAccesoDatos {
	// creamos variable la cual se auto nombre final y static
	int MAX_registros = 10;
	// creamos metodo abstracto en la clase interface se hace automatico
	void insertar();
	void listar();
	void actualizar();
	void eliminar();

}
