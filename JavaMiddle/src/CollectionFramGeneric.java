import java.util.List;
import java.util.ArrayList;

public class CollectionFramGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List motos = new ArrayList();
		motos.add(new Moto("bmw"));
		motos.add(new Dream("fight"));
		
		Moto moto1 = (Moto)motos.get(0);
//		Moto moto2 = (Moto)motos.get(1);
		
		
		List<Moto> genericMotos = new ArrayList<Moto>();
		genericMotos.add(new Moto("bms"));
//		genericMotos.add(new Dream("fight"));
		
		Moto moto = genericMotos.get(0);
		
		
		List<Moto> genericMotos1 = new ArrayList<>();
		
	}

}
