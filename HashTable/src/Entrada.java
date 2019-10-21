
public class Entrada<K,V> {
	
	private K llave;
	private V valor;
	
	
	public Entrada(K llave, V valor) {
		super();
		this.llave = llave;
		this.valor = valor;
	}
	public K getLlave() {
		return llave;
	}
	public void setLlave(K llave) {
		this.llave = llave;
	}
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Entrada [llave=" + llave + ", valor=" + valor + "]";
	}
	
	
	

}
