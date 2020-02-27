import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFramTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Moto> motos = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			motos.add(new Moto("moto " + i));
		}
		System.out.println("first traversal:for cycle");
		for (int i = 0; i < motos.size(); i++) {
			Moto moto = motos.get(i);
			System.out.println(moto);
		}
		
		
		System.out.println("second traversal:iterator");
		Iterator<Moto> it = motos.iterator();
		while(it.hasNext()) {
			Moto moto = it.next();
			System.out.println(moto);
		}
		System.out.println("use for's iterator");
		for(Iterator<Moto> iterator = motos.iterator();iterator.hasNext();){
			Moto moto = (Moto) iterator.next();
			System.out.println(moto);
		}
		
		
		System.out.println("Enhanced for cycle");
		for(Moto moto : motos) {
			System.out.println(moto);
		}
		
	}

}
