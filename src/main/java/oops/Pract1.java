package oops;

public class Pract1 extends Sample1 {
	public void max() {
	int[]pqr= {10,20,5,32};
	int max= pqr[0];
	for(int i=1;i<pqr.length;i++)
	{
		if(pqr[i]>max) {
			max=pqr[i];}
		}
	System.out.println("max value is"+max);
	}
public void d1() {
	System.out.println("d1 method in pract class");
}
	
	
	public static void main(String[] args) {
Pract1 obj=new Pract1();
obj.max();
obj.add();
obj.d1();
	}

}
