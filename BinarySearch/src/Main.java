
public class Main {
	public static void main(String args[]) {
		ListaLigada<Integer> lista= new ListaLigada<>();
		lista.insertarAlUltimo(20);
		lista.insertarAlUltimo(25);
		lista.insertarAlUltimo(30);
		lista.insertarAlUltimo(35);
		lista.imprimeLista();
		System.out.println("El elemento 40 esta en la pos: "+lista.busquedaBinaria(40));
	}
}
