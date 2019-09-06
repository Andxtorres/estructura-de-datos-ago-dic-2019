
public class ListaLigada<T> {
	
	private Nodo<T> inicial;

	public Nodo<T> getInicial() {
		return inicial;
	}

	public void setInicial(Nodo<T> inicial) {
		this.inicial = inicial;
	}
	
	public boolean estaVacia() {
		return inicial==null;
	}
	
	public void insertarAlInicio(T elemento) {
		Nodo<T> aInsertar= new Nodo<>(elemento);
		aInsertar.setSiguiente(inicial);
		inicial=aInsertar;
	}
	
	public void insertarAlUltimo(T elemento) {
		if(estaVacia()) {
			insertarAlInicio(elemento);
		}else {
			Nodo<T> temp=inicial;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(new Nodo<T>(elemento));
		}
	}
	
	public int contarElementos() {
		if(estaVacia())
			return 0;
		else {
			Nodo<T> temp = inicial;
			int contador=0;
			while(temp!=null) {
				contador++;
				temp=temp.getSiguiente();
			}
			return contador;
		}
	}
	
	public void quitarElPrimero() {
		if(estaVacia())
			System.out.println("No puedes quitar elementos");
		else {
			inicial=inicial.getSiguiente();
		}
	}
	
	public void quitarAlFinal() {
		if(estaVacia())
			System.out.println("No puedes quitar elementos");
		else {
			if(contarElementos()==1) {
				inicial=null;
			}else {
				Nodo<T> temp = inicial;
				while (temp.getSiguiente().getSiguiente()!=null) {
					temp=temp.getSiguiente();
				}			
				temp.setSiguiente(null);				
			}

		}
	}
	
	public void quitarAlFinalIndice() {
		if(contarElementos()==0) {
			System.out.println("No puedes borrar");
		}else if(contarElementos()==1) {
			quitarElPrimero();
		}else {
			Nodo<T> penultimo= encontrarNodoEnIndice(contarElementos()-2);
			penultimo.setSiguiente(null);
		}
	}
	
	public Nodo<T> encontrarNodoEnIndice(int indice){
		if(indice<contarElementos()) {
			Nodo<T> temp = inicial;
			for(int i=0;i<indice;i++) {
				temp=temp.getSiguiente();
			}
			return temp;
		}else {
			System.out.println("Index out of bounds");
			return null;
		}
	}
	
	public void insertarEnElIndice(int index, T elemento) {
		if(estaVacia())
			insertarAlInicio(elemento);
		else {
			if(index>=contarElementos()) {
				System.out.println("No puedes insertar en ese indice");
				return;
			}
			if(index==contarElementos()-1) {
				insertarAlUltimo(elemento);
				return;
			}
			if(index==0) {
				insertarAlInicio(elemento);
				return;
			}
			Nodo<T> anterior=encontrarNodoEnIndice(index-1);
			Nodo<T> aInsertar= new Nodo<>(elemento);
			aInsertar.setSiguiente(anterior.getSiguiente());
			anterior.setSiguiente(aInsertar);
			
		}
	}
	
	public void imprimeLista() {
		if(estaVacia()) {
			System.out.println("Lista vacía");
		}else {
			Nodo<T> temp = inicial;
			while (temp!=null) {
				System.out.println("Nodo: "+ temp.getElemento().toString());
				temp=temp.getSiguiente();
			}
		}
	}
	
	public void imprimeRec() {
		imprimeRecursivo(inicial);
	}
	private void imprimeRecursivo(Nodo<T> nodo) {
		if(nodo!=null) {
			System.out.println("Nodo: "+nodo.getElemento().toString());
			imprimeRecursivo(nodo.getSiguiente());
		}
		
	}

}
