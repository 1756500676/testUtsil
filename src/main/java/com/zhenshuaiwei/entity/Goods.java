/**  
 * zsw 公司 ZhenShuaiWei_SSM_PROJECT
 * @Title: Goods.java 
 * @Prject: zhenshuaiwei-senior1-week2execise01
 * @Package: com.zhenshuaiwei.entity 
 * @Description: TODO
 * @author: zsw  
 * @date: 2019年11月8日 下午6:58:03 
 * @version: V1.0   
 */
package com.zhenshuaiwei.entity;

import java.math.BigDecimal;

/** 
 * @ClassName: Goods 
 * @Description: TODO
 * @author:zsw 
 * @date: 2019年11月8日 下午6:58:03  
 */
public class Goods {
	
	private Integer id;
	private String name;
	private BigDecimal price;
	private int sells;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the sells
	 */
	public int getSells() {
		return sells;
	}
	/**
	 * @param sells the sells to set
	 */
	public void setSells(int sells) {
		this.sells = sells;
	}
	/** 
	 * @Title:Goods
	 * @Description:TODO 
	 * @param id
	 * @param name
	 * @param price
	 * @param sells 
	 */
	public Goods(Integer id, String name, BigDecimal price, int sells) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sells = sells;
	}
	/** 
	 * @Title:Goods
	 * @Description:TODO  
	 */
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", sells=" + sells + "]";
	}
	
	

}
