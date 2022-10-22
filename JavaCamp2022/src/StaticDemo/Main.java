package StaticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Moues";
		product.price = 10;
		productManager.add(product);
		DataBaseHelper.CRUD.delete();
		DataBaseHelper.Connection.connect();

	}

}
