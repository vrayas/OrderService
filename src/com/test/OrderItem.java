/**
 * 
 */
package com.test;

/**
 * @author LALITA
 *
 */
public class OrderItem {
	 private String mItemName;
	    private Long mTime;

	/**
	 * 
	 */
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderItem(String pItemName,Long pTime) {
	      this.mItemName=pItemName;
	      this.mTime=pTime;
	    }

	/**
	 * @return the mItemName
	 */
	public String getItemName() {
		return mItemName;
	}

	/**
	 * @param mItemName the mItemName to set
	 */
	public void setItemName(String mItemName) {
		this.mItemName = mItemName;
	}

	/**
	 * @return the mTime
	 */
	public Long getTime() {
		return mTime;
	}

	/**
	 * @param mTime the mTime to set
	 */
	public void setTime(Long mTime) {
		this.mTime = mTime;
	}

}
