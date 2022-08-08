public class Product {
	int price=250;
	Product()
	{
		int price=100;
		System.out.println(price);
		System.out.println(this.price);	
	}
   public static void main(String[] args) {
		Product p1=new Product();

	}

}
