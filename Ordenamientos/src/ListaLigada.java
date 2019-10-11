
public class ListaLigada<T extends Comparable<T>> {
	
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
	public int contarElementos(Nodo<T> nodo) {
		if(nodo==null)
			return 0;
		else {
			Nodo<T> temp = nodo;
			int contador=0;
			while(temp!=null) {
				contador++;
				temp=temp.getSiguiente();
			}
			return contador;
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
	public T encontrarElUltimo() {
		return encontrarElementoEnElIndice(contarElementos()-1);
	}
	public T encontrarElementoEnElIndice(int indice) {
		return encontrarNodoEnIndice(indice).getElemento();
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
	
	private void intercambiar(int index1, int index2) {
		System.out.println("Se intercambia "+encontrarElementoEnElIndice(index1)+" con: "+encontrarElementoEnElIndice(index2));
		Nodo<T> temp= encontrarNodoEnIndice(index1);
		T tempT= temp.getElemento();
		Nodo<T> temp2= encontrarNodoEnIndice(index2);
		temp.setElemento(temp2.getElemento());
		temp2.setElemento(tempT);
	}
	
	public void bubbleSort() {
		for(int i=0;i<contarElementos()-1;i++) {
			boolean intercambiado=false;
			for(int j=0;j<contarElementos()-1; j++) {
				if(encontrarElementoEnElIndice(j).compareTo(encontrarElementoEnElIndice(j+1))>0) {
					intercambiar(j,j+1);
					intercambiado=true;
				}
			}
			if(!intercambiado) {
				break;
			}
		}
	}
	
	public void selectionSort() {
		for(int i=0;i<contarElementos()-1;i++) {
			int masPequenio=i;
			for(int j=i+1;j<contarElementos()-1;j++) {
				if(encontrarElementoEnElIndice(j).compareTo(encontrarElementoEnElIndice(masPequenio))<0) {
					masPequenio=j;
				}
			}
			intercambiar(masPequenio,i);
		}
	}
	
	public void insertionSort() {
		int i=1;
		while(i<contarElementos()) {
			int j=i;
			while(j>0 && encontrarElementoEnElIndice(j-1).compareTo(encontrarElementoEnElIndice(j))>0) {
				intercambiar(j,j-1);
				j=j-1;
			}
			i++;
		}
	}
	
	public void mergeSort(){
		inicial=mergeSortInterno(inicial);
	}
	
	private Nodo<T> mergeSortInterno(Nodo<T> inicial) {
		Nodo<T> inicioAnterior= inicial;
		int mid= contarElementos(inicial)/2; 
		System.out.println("Contar elementos: "+mid+" "+inicial.getElemento());
		if(inicial.getSiguiente()==null) {
			return inicial;
		}
		
		while(mid-1>0) {
			inicioAnterior=inicioAnterior.getSiguiente();
			mid--;
		}
		Nodo<T> nuevoInicio=inicioAnterior.getSiguiente();
		inicioAnterior.setSiguiente(null);
		inicioAnterior=inicial;
		Nodo<T> temp1= mergeSortInterno(inicioAnterior);
		Nodo<T> temp2= mergeSortInterno(nuevoInicio);
		return merge(temp1,temp2);
	}
	
	public Nodo<T> merge(Nodo<T> a, Nodo<T> b){
		Nodo<T> resultado;
		if (a==null)
			return b;
		if(b==null)
			return a;
		if(a.getElemento().compareTo(b.getElemento())>0) {
			resultado=b;
			resultado.setSiguiente(merge(a,b.getSiguiente()));
		}else {
			resultado=a;
			resultado.setSiguiente(merge(a.getSiguiente(),b));
		}
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
