package com.jgm.model.production;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
*
* @author Javier Guerrero
*/

@Entity
@Table(name = "production")
public class Production {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_production")
	private Integer id_production;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "production_date")
	private Date production_date;
	
    @Column(name = "state")
	private Byte state;
	
    @Column(name = "price")
	private Integer price;

	public Integer getId_production() {
		return id_production;
	}

	public void setId_production(Integer id_production) {
		this.id_production = id_production;
	}

	public Date getProduction_date() {
		return production_date;
	}

	public void setProduction_date(Date production_date) {
		this.production_date = production_date;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	
}
