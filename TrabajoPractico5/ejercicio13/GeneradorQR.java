package ejercicio13;

public class GeneradorQR {

	
	public void generar(String valor, Usuario usuario) {
		CodigoQR qr = new CodigoQR(valor);
		qr.setUsuario(usuario);
	}
	
}
