package assignmentforjunit;
import static org.junit.Assert.*;
import org.junit.Test;
import assignmentforservice.Service;
public class Junit {
		@Test
		public void check()
		{
		Service s=new Service();	
		assertNotNull(s);
		}
	     @Test
	     public void sum()
	     {
	    	Service s=new Service();
	    	String a="C:/Users/AMIT/Desktop/Snehal/web_content.txt";
	    	assertEquals("C:/Users/AMIT/Desktop/Snehal/web_content.txt", a);
	     }
}
