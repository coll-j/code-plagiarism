package project1_func;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class function {
	public int tanggal;
	public int bulan;
	public int tahun;
	Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    int month = localDate.getMonthValue();
    int year = localDate.getYear();
    int dte = localDate.getDayOfMonth();
	
	public int gettotal() {
		int total = year-tahun-1;
		if (month>=bulan && dte>=tanggal) {
			return total+1;
		} else {
			return total;
		}
	}
	
	public void tanggal(int tanggal) {
		this.tanggal = tanggal;
	}
	
	public void bulan(int bulan) {
		this.bulan = bulan;
	}

	public void tahun(int tahun) {
		this.tahun = tahun;		
	}

}
