package my.data;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Unit {
	public String type;
	public Date birthday;
	
	public void setDate(Date date) {
		birthday = date;
	}
	
	@Override
	public String toString() {
		if(birthday != null) {
			var dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //"yyyy-MM-dd'T'hh:mm:ss.SSSSSSZ"
			return dateFormat.format(birthday);
		} else {
			return "";
		}
	}
	
	public void setBirthday(String s) {
		if(s != null) {
			var dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //"yyyy-MM-dd'T'hh:mm:ss.SSSSSSZ"
			if(birthday == null) {
				birthday = new Date();
			}
			try {
				birthday = dateFormat.parse(s); //"2011-04-11T22:27:18.491726-05:00"
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}


//s = dateFormat.format(new java.util.Date()).toString();
//
//try {
//	birthday = dateFormat.parse(s);
//} catch (ParseException e) {
//	System.out.println("ERROR");
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//
