package com.jgm.model.chicken;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.jgm.model.user.User;

/**
*
* @author Javier Guerrero
*/

@Entity
@Table(name = "chiken")

public class Chicken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_chicken")
	private Integer id_chicken;
	
    @Column(name = "type")
	private String type;
	
	@ManyToOne
	private User id_user;
	
    @Column(name = "frecuency")
	private String frecuency;

	public Integer getId_chicken() {
		return id_chicken;
	}

	public void setId_chicken(Integer id_chicken) {
		this.id_chicken = id_chicken;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getId_user() {
		return id_user;
	}

	public void setId_user(User id_user) {
		this.id_user = id_user;
	}

	public String getFrecuency() {
		return frecuency;
	}

	public void setFrecuency(String frecuency) {
		this.frecuency = frecuency;
	}
	
	
}
