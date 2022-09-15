package Serialisation;

import java.io.Serializable;

public class Book implements Serializable{
	int bid;
	String bname,aname;
	double price;
	
	public Book() {}

	public Book(int bid, String bname, String aname, double price) {
		this.bid = bid;
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	
}
