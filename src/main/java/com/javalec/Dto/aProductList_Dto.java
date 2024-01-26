package com.javalec.Dto;

public class aProductList_Dto {
	
	int pId;
	String pName;
	String pColor;
	String pPrice;
	
	public aProductList_Dto() {
		
	}

	public aProductList_Dto(int pId, String pName, String pColor, String pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pColor = pColor;
		this.pPrice = pPrice;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpColor() {
		return pColor;
	}

	public void setpColor(String pColor) {
		this.pColor = pColor;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	
	

}
