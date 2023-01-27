package Java8programmes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	
	int id;
	String name;
	float 	price;
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}


public class JavaStreamExample {

	public static void main(String[] args) {
		
		List<Product> productsList= new ArrayList<Product>();
		productsList.add(new Product(1,"HP",30000f));
		productsList.add(new Product(2,"SAMSUNG",25000f));
		productsList.add(new Product(3,"Lenova",35000f));
		productsList.add(new Product(4,"Apple",50000f));
		
		List<Float> productPriceList= productsList.stream().filter(p->p.price >30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(productPriceList); 
		productsList.stream().filter(product->product.price==30000).forEach(product->System.out.println(product.name));
	}

}
