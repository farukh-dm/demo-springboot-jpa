package demo.springboot.country;

import java.io.Serializable;

//@Entity
public class CountryDto implements Serializable {
	
	private static final long serialVersionUID = -8575767795475922816L;
	
	//@Id
	public String id;
	public String name;
	public String description;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	

}
