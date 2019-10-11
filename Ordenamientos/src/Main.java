
public class Main {

	public static void main(String[] args) {
		ListaLigada<Integer> listaLigada= new ListaLigada<>();
		listaLigada.insertarAlInicio(3);
		listaLigada.insertarAlInicio(10);
		listaLigada.insertarAlInicio(20);
		listaLigada.insertarAlInicio(15);
		listaLigada.insertarAlInicio(8);
		listaLigada.insertarAlUltimo(22);
		listaLigada.insertarAlUltimo(24);
		listaLigada.insertarAlUltimo(26);
		listaLigada.insertarAlUltimo(25);
		listaLigada.insertarAlUltimo(28);
		listaLigada.insertarAlUltimo(27);
		listaLigada.insertarAlUltimo(31);
		listaLigada.insertarAlUltimo(30);
		listaLigada.insertarAlUltimo(33);
		listaLigada.insertarAlUltimo(32);
		listaLigada.insertarAlUltimo(35);
		listaLigada.imprimeLista();
		listaLigada.mergeSort();
		listaLigada.imprimeLista();

	}
}
