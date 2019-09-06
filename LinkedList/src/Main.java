
public class Main {

	public static void main(String[] args) {
		ListaLigada<Integer> listaLigada= new ListaLigada<>();
		listaLigada.insertarAlInicio(3);
		listaLigada.insertarAlInicio(10);
		listaLigada.imprimeLista();
		System.out.println("--------");
		listaLigada.insertarAlInicio(20);
		listaLigada.insertarAlInicio(15);
		listaLigada.insertarAlInicio(8);
		listaLigada.insertarAlUltimo(22);
		listaLigada.imprimeLista();
		System.out.println("----Recursivo----");
		listaLigada.imprimeRec();
		System.out.println("Contar elementos: "+listaLigada.contarElementos());
		listaLigada.quitarElPrimero();
		System.out.println("--------");
		listaLigada.imprimeLista();
		System.out.println("--------");
		listaLigada.quitarAlFinal();
		listaLigada.imprimeLista();
		System.out.println("Ele elemento en 2: "+listaLigada.encontrarNodoEnIndice(2).getElemento());
		listaLigada.insertarEnElIndice(2, 5);
		listaLigada.imprimeLista();
	}

}
