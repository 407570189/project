package com.tom;

public class price {
 protected String Aticket;
 private int price;
 public price(String Aticket,int price) {
	 this.Aticket = Aticket;
	 this.price = price;
	}
 public void print() {
	 System.out.println(Aticket+"\t"+price);
 }
}
