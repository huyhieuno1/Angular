package group1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERR")
public class User {

	@Id
	@Column(name="ID")
	private  int id;
	@Column(name="NAME")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
