package negocios;
import datos.contacto;
import java.util.LinkedList;
import usuariointerfaz.interfaz;
public class Agenda {
	
	public static void main (String[] args) {
		interfaz.lectura();
	}
	
	LinkedList<contacto> lista = new LinkedList<contacto>();
	public boolean add(contacto contact) {
		char[] letras= contact.getNombre().toCharArray();
		if(letras.length>=0 && letras.length<=10) {
		String enteroString=Long.toString(contact.getCelular());
		letras=enteroString.toCharArray();
		if(letras.length==8) {
		lista.add(contact);
		return true;
		}
		}
		return false;
	}
	
	public LinkedList<contacto> getLista() {
		return lista;
	}
	public void setLista(LinkedList<contacto> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
}
