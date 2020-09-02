package Program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	Date d = new Date();
	System.out.println(d.getDate());
	System.out.println(d.getYear());
	System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
	System.out.println(d);
	
	 Date dNow = new Date( );
     SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

     System.out.println("Current Date: " + ft.format(dNow));
System.out.println(ft.getClass());	
}
}
