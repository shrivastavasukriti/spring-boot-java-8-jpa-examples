package com.sukriti.backend.billingorder.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="order")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order implements Serializable{

	/**
	 * Serial Version UID for serialization and deserialization of the order object.
	 */
	private static final long serialVersionUID = -2605061532909193067L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(name="order_name")
	private String orderName;
	@Column(name="order_type")
	private String orderType;
	
	public int getId() {
		return id;
	}
	public String getOrderName() {
		return orderName;
	}
	public String getOrderType() {
		return orderType;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", orderType="
				+ orderType + "]";
	}
	
}
