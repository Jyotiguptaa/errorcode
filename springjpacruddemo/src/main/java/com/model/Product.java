package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String descryption;
	@Column(name="manufacturer")
	private String manufacturer;
	@Column(name="name")
	private String name;
	@Column(name="unit")
	private String unit;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescryption() {
		return descryption;
	}
	public void setDescryption(String descryption) {
		this.descryption = descryption;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", description=" + descryption + ", manufacturer="
				+ manufacturer + ", name=" + name + ", unit=" + unit + ", getId()=" + getId() + ", getCategory()="
				+ getCategory() + ", getDescription()=" + getDescryption() + ", getManufacturer()=" + getManufacturer()
				+ ", getName()=" + getName() + ", getUnit()=" + getUnit() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
