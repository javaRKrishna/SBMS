package com.kk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {
	@Value("#{info.dosaPrice+info.idlyPrice+info.pohaPrice}")
	public float total;
	@Value("Paradise")
	public String hotelName;
	@Autowired
	public ItemsInfo items;
	
	@Override
	public String toString() {
		return "BillGenerator [total=" + total + ", hotelName=" + hotelName + ", items=" + items + "]";
	}
	
}
