public class Employee1
{
	int id,salary;
	String name;
	 Employee1(int eid,String enm,int es)
	 {
		 id=eid;
		 salary=es;
		 name=enm;  
	 }
	 public static void main(String []args)
	 {
		 Employee1 e1=new Employee1(20,"pk",3500);
		 Employee1 e2=new Employee1(30,"p",4000);
		 Employee1 e3=new Employee1(40,"om",7000);
		 System.out.println(e1.id);
		 System.out.println(e1.salary);
		 System.out.println(e1.name);
		 System.out.println(e2.id);
		 System.out.println(e2.salary);
		 System.out.println(e2.name);
		 System.out.println(e3.id);
		 System.out.println(e3.salary);
		 System.out.println(e3.name);
