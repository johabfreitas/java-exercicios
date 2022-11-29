package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class WorkingDate {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Date d01 = new Date();
		Date d02 = new Date(System.currentTimeMillis());
		Date d03 = new Date(0L);
		Date d04 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("---------------------------------");
		System.out.println("y1 = " + sdf1.format(y1));
		System.out.println("y2 = " + sdf2.format(y2));
		System.out.println("y3 = " + sdf2.format(y3));
		System.out.println("d01 = " + sdf2.format(d01));
		System.out.println("d02 = " + sdf2.format(d02));
		System.out.println("d03 = " + sdf2.format(d03));
		System.out.println("d04 = " + sdf2.format(d04));
		
		System.out.println("---------------------------------");
		System.out.println("y1 = " + sdf3.format(y1));
		System.out.println("y2 = " + sdf3.format(y2));
		System.out.println("y3 = " + sdf3.format(y3));
		System.out.println("d01 = " + sdf3.format(d01));
		System.out.println("d02 = " + sdf3.format(d02));
		System.out.println("d03 = " + sdf3.format(d03));
		System.out.println("d04 = " + sdf3.format(d04));

	}

}
