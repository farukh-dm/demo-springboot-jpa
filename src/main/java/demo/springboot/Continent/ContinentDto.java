package demo.springboot.Continent;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "continents")
public class ContinentDto implements Serializable {
	
	private static final long serialVersionUID = 4866375874056179361L;
	
	@Id
	public String id;
	public String name;
	public String description;
	//public List<CountryDto> countries;
	
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
	
	/*
	 * public List<CountryDto> getCountries() { return countries; }
	 * 
	 * public void setCountries(List<CountryDto> countries) { this.countries =
	 * countries; }
	 */
	
}
