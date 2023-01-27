import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PriceExample {

	int id;
	String name;
	float price;

	public PriceExample(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class ProductExample {

	public static void main(String[] args) {

		List<PriceExample> myList = new ArrayList<PriceExample>();

		myList.add(new PriceExample(1, "Hp", 30000f));
		myList.add(new PriceExample(2, "Lenovo", 40000f));
		myList.add(new PriceExample(3, "Dell", 45000f));
		myList.add(new PriceExample(4, "Apple", 50000f));
List<Object> priceOfProduct= myList.stream().filter(p->p.price>40000f).map(p->p.price).collect(Collectors.toList());

System.out.println(priceOfProduct);
myList.stream().filter(p->p.price==40000f).forEach(p->System.out.println(p.name));
}

}
