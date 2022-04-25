package Examen.QuienNoCorreVuela;

import java.io.Serializable;

public abstract class Usuario implements Serializable {

	protected String user;
	protected String pass;

	public Usuario(String u, String p) {
		user = u;
		pass = p;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

}
