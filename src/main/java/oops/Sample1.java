package oops;

public class Sample1 extends Demo0 {

	
     public void equals() {
    	System.out.println(c.equals(d));}
    	 public void reverseString() {
    		 for(int i=c.length()-1;i>=0;i--)
    			 System.out.print(c.charAt(i));
    	System.out.println();	 
    	 }
    		 public static void concat() {
    			 String e="vishal";
    			 String f="vishal";
    			 
    			System.out.println(e.concat(f));
    		 }
    	 public static void main(String[] args) {
    		 sub();
    		 Sample1.concat();
    		 Sample1 obj = new Sample1();
    		 obj.reverseString();
    		 obj.equals();
    		 obj.add();
    	 }
}
