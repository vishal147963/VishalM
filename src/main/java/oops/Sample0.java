package oops;

public class Sample0 extends pract0{
 public void adduser(String fname, String lname) {
	 System.out.println(fname +"  "+lname);
 }
	public static void main(String[] args) {
		Sample0 obj=new Sample0();
		obj.login("admin","pass");
		String a=obj.capturettle();
		System.out.println(a);
		obj.adduser("abc","pqr");

	}

}
