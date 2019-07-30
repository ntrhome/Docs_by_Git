package my.data;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ClassDate {

	public static void main(String[] args) {
		System.out.println("ClassDate do:");
		
		var u = new Unit();
		System.out.println("> " + u.toString());
		u.setBirthday("2020-02-03");
		System.out.println("> " + u.toString());
		
		

	}

}
