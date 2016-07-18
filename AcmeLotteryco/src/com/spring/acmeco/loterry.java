package com.spring.acmeco;

public class loterry {
	
	private String lotterytype;
	private String lotterynumber;
	private int quantity;


	public String getLotterytype() {
		return lotterytype;
	}

	public void setLotterytype(String lotterytype) {
		this.lotterytype = lotterytype;
	}
	
	public String getLotterynumber() {
		return lotterynumber;
	}

	public void setLotterynumber(String lotterynumber) {
		this.lotterynumber = lotterynumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "loterry [lotterytype=" + lotterytype + ", lotterynumber=" + lotterynumber + ", quantity=" + quantity
				+ "]";
	}

	public loterry(String lotterytype, String lotterynumber, int quantity) {
		super();
		this.lotterytype = lotterytype;
		this.lotterynumber = lotterynumber;
		this.quantity = quantity;
	}

	public loterry(int quantity) {
		super();
		this.quantity = quantity;
	}

	public loterry() {

	}

	public loterry(String lotterytype, int quantity) {
		super();
		this.lotterytype = lotterytype;
		this.quantity = quantity;
	}
	
	
	

}
