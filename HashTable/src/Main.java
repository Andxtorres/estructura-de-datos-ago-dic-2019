
public class Main {

	public static void main(String[] args) {
		
		HashTable<Alumno,Double> hashTable= new HashTable<>();
		hashTable.imprimir();
		Alumno a= new Alumno("Andrés","A01211914","Torres");
		Alumno a2= new Alumno("Juan","A01111714","Pérez");
		hashTable.insertar( a, 100.0);
		hashTable.insertar( a2, 80.0);
		hashTable.imprimir();
		System.out.println(hashTable.encontrar(a2));

	}

}
