package co.com.qabox.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	

	public static final SimpleDateFormat dateFormatyyyyMMdd_hhmmss = 
		new SimpleDateFormat("yyyyMMdd_HHmmss");
	
	public static final SimpleDateFormat dateFormatyyyyMMdd = 
		new SimpleDateFormat("yyyyMMdd");
	
	public static final SimpleDateFormat dateFormatyyyyMMddhhmmss = 
		new SimpleDateFormat("yyyyMMddHHmmss");
	
	public static final SimpleDateFormat dateFormatyyyyMMddhh_mm_ss = 
			new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
	/**
	 * Representa el formato dd-MM-yyyy
	 */
	public static final SimpleDateFormat clasico = 
		new SimpleDateFormat("dd-MM-yyyy"); 
	
	public static Date getAyer(){
		
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE, -1);
		
		return new Date(today.getTimeInMillis());
	}
	
	public static Date getMañana(){
		
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE, 1);
		
		return new Date(today.getTimeInMillis());
	}
	
	public static long getDiferenciaMiliSegundos( Date d0, Date d1) throws Exception{
		
		if(d1.after(d0))
			return d1.getTime() - d0.getTime();
		
		throw new Exception("La fecha final debe ser superior a la inicial.");
	}
	
	public static double getDiferenciaSegundos( Date d0, Date d1) throws Exception{
		
		double milisegundos = getDiferenciaMiliSegundos(d0,d1);
		return milisegundos/1000;
		
	}
	
	public static String getFormatDate(SimpleDateFormat format, Date date){
		return format.format(date);
	}
	
	public static String getFormatDate(String format,Date date) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return getFormatDate(sdf,date);
	}
	
	public static String getFormatDate(String format) throws ParseException{
		return getFormatDate(format,new Date());
	}
	
	public static String getFormatDate(SimpleDateFormat format) throws ParseException{
		return getFormatDate(format,new Date());
	}
	
}
