package com.cg.shoppingmanagement.shop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class ShopEntities {
	
	
	private int shopId;
	private String shopCategory;
	private int shopEmployeeID;
	private String shopName;
	private String customers;
	private String shopStatus;
	private String shopOwner;
	private String leaseStatus;
	
	public ShopEntities() {
		
	}
	
	public ShopEntities(int shopId, String shopCategory, int shopEmployeeID, String shopName, String customers,
			String shopStatus, String shopOwner, String leaseStatus) {
		
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopEmployeeID = shopEmployeeID;
		this.shopName = shopName;
		this.customers = customers;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public int getShopEmployeeID() {
		return shopEmployeeID;
	}

	public void setShopEmployeeID(int shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString()
	{
		return "ShopEntities [ShopId=" + shopId + ",ShopCategory=" + shopCategory + ",ShopEmployee=" + shopEmployeeID +",ShopName=" + shopName +",Customers=" + customers + ",ShopStatus=" + shopStatus +",ShopOwner=" + shopOwner +",LeaseStatus=" + leaseStatus + "]";
				
	}
	
	

}
