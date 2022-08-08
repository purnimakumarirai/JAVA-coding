public class Mobile {
	void sendSms() //method
	{
		System.out.println("sendSms");
	}
	void call() //method
	{
		System.out.println("call");
	}
	void takePhoto()  //method
	{
		System.out.println("takePhoto");
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.sendSms(); //invocation
		m1.sendSms(); //invocation
		m1.call(); //invocation
		
		
		

	}

