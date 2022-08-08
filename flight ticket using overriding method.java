public class FlightTicket {
	String from,to,date,passName;
	int fare;
	public FlightTicket(String f,String t,String d,String pn,int fr) {
	this.from=f;
	this.to=t;
	this.date=d;
	this.passName=pn;
	this.fare=fr;
	}
		public static void main(String args[]){		
		FlightTicket e1=new FlightTicket("bangalore","delhi","05-02-21","purnima",6000);
		FlightTicket e2=new FlightTicket("bangalore","kolkata","06-02-21","purnima",6000);
		FlightTicket e3=new FlightTicket("bangalore","goa","10-02-21","purnima",5000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
}
		@Override
		public String toString() {
			String details=this.from+ " "+this.to+" "+this.date+" "+this.passName+ " "+this.fare;
			return details;	
		}
}
