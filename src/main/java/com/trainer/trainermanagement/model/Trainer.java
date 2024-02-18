package com.trainer.trainermanagement.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "trainer")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "technology")
	private String technology;

	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public Trainer(Long id, String name, Long empid,String email, String technology) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.technology = technology;
	}


	public Trainer() {
		super();
	}
	

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", email=" + email + ", technology=" + technology + "]";
	}


}

