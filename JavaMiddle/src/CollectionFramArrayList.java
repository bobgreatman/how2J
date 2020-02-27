import java.util.ArrayList;

public class CollectionFramArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList motos = new ArrayList();
		for (int i = 0; i < 7; i++) {
			motos.add(new Moto("moto " + i));
		}
		System.out.println(motos);
		Moto specialMoto = new Moto("special moto");
		
		motos.add(3, specialMoto);
		
		System.out.println(motos.toString());
		
		
		System.out.println(motos.contains(new Moto("moto 1")));
		System.out.println(motos.contains(specialMoto));
		
		
		System.out.println(motos.get(5));
		
		
		System.out.println("specialmoto position is: " + motos.indexOf(specialMoto));
		
		
		motos.remove(2);
		motos.remove(specialMoto);
		
		
		motos.set(5, new Moto("moto 5"));
		
		
		System.out.println(motos.size());
		
		
		Moto[] ms = (Moto[])motos.toArray(new Moto[]{});
		System.out.println("Array: " + ms);
		
		
		ArrayList anotherMotos = new ArrayList();
		anotherMotos.add(new Moto("moto a"));
		anotherMotos.add(new Moto("moto b"));
		anotherMotos.add(new Moto("moto c"));
		System.out.println("anotherMotos motos:\t" + anotherMotos);
		
		motos.addAll(anotherMotos);
		
		System.out.println("add another arraylist: \t" + motos);
		
		
		anotherMotos.clear();
		System.out.println("another clear: " + motos);
		
		
	}

}
