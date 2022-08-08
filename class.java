public class Shirt {
	
	int size;
	String color;
	Shirt(int ssz,String scl){
		size=ssz;
		color=scl;
	}

	public static void main(String[] args) {
		Shirt s1=new Shirt(30,"red");
		Shirt s2=new Shirt(20,"pink");
		System.out.println("size"+" "+"of"+" "+"Shirt"+" "+ s1.size);
		System.out.println("size"+" "+"of"+" "+"Shirt"+" "+ s2.size);
		System.out.println("color"+" "+"of"+" "+"Shirt"+" "+ s1.color);
		System.out.println("color"+" "+"of"+" "+"Shirt"+" "+ s2.color);
		

	}

