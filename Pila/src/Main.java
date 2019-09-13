
public class Main {

	public static void main(String[] args) {
		Pila<Integer> p=new Pila<>();
		p.push(2);
		p.push(3);
		p.push(10);
		p.push(1);
		p.push(8);
		p.push(7);
		p.imprime();
		p.pop();
		System.out.println("------Pila pop-------");
		p.imprime();
		System.out.println("------COLA-------");
		Cola<Integer> c= new Cola<>();
		c.enqueue(2);
		c.enqueue(3);
		c.enqueue(10);
		c.enqueue(1);
		c.enqueue(8);
		c.enqueue(7);
		c.imprime();
		System.out.println("------COLA dequeue-------");
		c.dequeue();
		c.imprime();
	}

}
