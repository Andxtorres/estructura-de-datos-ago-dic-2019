
public class Arista<T extends Comparable<T>> implements Comparable<Arista<T>> {
	
	private Vertice<T> vertice1;
	private Vertice<T> vertice2;
	
	public Arista(Vertice<T> vertice1,Vertice<T> vertice2) {
		this.vertice1=vertice1;
		this.vertice2=vertice2;
	}
	public Vertice<T> getVertice1() {
		return vertice1;
	}
	public void setVertice1(Vertice<T> vertice1) {
		this.vertice1 = vertice1;
	}
	public Vertice<T> getVertice2() {
		return vertice2;
	}
	public void setVertice2(Vertice<T> vertice2) {
		this.vertice2 = vertice2;
	}
	@Override
	public int compareTo(Arista<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
