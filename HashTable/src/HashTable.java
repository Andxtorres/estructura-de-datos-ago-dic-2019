
public class HashTable <K,V>{
	
	private ListaLigada<Entrada<K,V>>[] tabla;
	
	@SuppressWarnings("unchecked")
	public HashTable() {
		tabla= new ListaLigada[100];
	}
	
	public void insertar(K key,V value) {
		if(tabla[posHas(key)]==null) {
			tabla[posHas(key)]= new ListaLigada<>();
		}
		tabla[posHas(key)].insertarAlInicio(new Entrada(key,value));

		/*
		if(tabla[posHas(key)]==null)
			tabla[posHas(key)]=new Entrada(key,value);
		else {
			int i=posHas(key);
			while(tabla[i]!=null) {
				i++;
			}
			tabla[i]=new Entrada(key,value);
			
		}*/
			
	}
	
	public void imprimir() {
		
		for (int i=0;i<tabla.length;i++) {
			if(tabla[i]==null) {
				System.out.println(i+".- Vacía");
			}else {
				System.out.println(i+".- "+tabla[i].toString());
			}
		}
		
	}
	
	public void quitar(K key, V value) {
		
	}
	
	public int encontrar(K key) {
		int pos=posHas(key);
		//tabla[pos]
		/*
		int pos=posHas(key);
		if(tabla[pos].getLlave().equals(key)) {
			return pos;
		}
		int i=posHas(key);
		while(tabla[i]!=null) {
			i++;
			if(tabla[i].getLlave().equals(key)) {
				break;
			}
		}
		return i;
		*/
		
		//TODO
		return 0;
	}
	
	private int posHas(K key) {
		System.out.println(Math.abs(key.hashCode()));
		return Math.abs(key.hashCode())%tabla.length;
	}

}
