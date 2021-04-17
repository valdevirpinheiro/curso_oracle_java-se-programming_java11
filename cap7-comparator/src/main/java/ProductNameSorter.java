import java.util.Arrays;
import java.util.Comparator;


public class ProductNameSorter implements Comparator<Product> {

	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}
	
	public static void main(String[] args) {
		Product[] products = { new Product("Tea"), new Product("Coffe"), new Product("Cake") };
		Arrays.sort(products, new ProductNameSorter());
		for (Product product : products) {
			System.out.println(product.toString());			
		}
	}

}
