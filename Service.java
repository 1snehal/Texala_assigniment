package assignmentforservice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class Service {
public void opration()
{
	String s ="";
	try {
			URL u=new URL("https://www.google.com");
			URLConnection con=u.openConnection();
			InputStream c=con.getInputStream();
			InputStreamReader  read=new InputStreamReader(c);
			BufferedReader b=new BufferedReader(read);
			File f=new File("C:/Users/AMIT/Desktop/Snehal/web_content.txt");
			FileOutputStream ff=new FileOutputStream(f);
			ObjectOutputStream os=new ObjectOutputStream(ff);
			while(true)
			{
			s=b.readLine();
			if(s!=null)
			{
				System.out.println(s);
				os.writeObject(s.toString());
			}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
