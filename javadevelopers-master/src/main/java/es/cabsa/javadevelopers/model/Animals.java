package es.cabsa.javadevelopers.model;

public class Animals {
	private Integer id;
	private String name;
	private Integer legs;	
	
	public Animals() {		
	}

	public Animals(Integer id, String name, Integer legs) {
		super();
		this.id = id;
		this.name = name;
		this.legs = legs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLegs() {
		return legs;
	}

	public void setLegs(Integer legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Animals [id=" + id + ", name=" + name + ", legs=" + legs + "]";
	}
	
	

}
