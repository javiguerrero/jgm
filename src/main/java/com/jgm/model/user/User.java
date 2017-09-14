package com.jgm.model.user;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.jgm.model.chicken.Chicken;

/**
*
* @author Javier Guerrero
*/

@Entity
@Table(name = "user")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
	private Integer id_user;
	
    @Column(name = "username")
	private String username;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private List<Chicken> chickens;

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Chicken> getChickens() {
		return chickens;
	}

	public void setChickens(List<Chicken> chickens) {
		this.chickens = chickens;
	}
	
	

}
