public class Pancard {
	String name;
	String pannumber;
	
	Pancard(String pnm,String pnb)
	{
		name=pnm;
		pannumber=pnb;
	}
	public static void main(String args[])
	{
		Pancard p1=new Pancard("purnima","abc");
		Pancard p2=new Pancard("rai","abc");
		System.out.println("your pancard name is"+" " +""+p1.name);
		System.out.println("your pancardnumber is"+" "+p2.pannumber);
		System.out.println();
	}
	

}
