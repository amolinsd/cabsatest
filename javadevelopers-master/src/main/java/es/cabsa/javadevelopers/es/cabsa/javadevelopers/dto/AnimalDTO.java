package es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto;

public class AnimalDTO {
	
	private Integer id;
	private String name;
	private Integer legs;
	private String food;
	
	public AnimalDTO() {	
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

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "AnimalDTO [id=" + id + ", name=" + name + ", legs=" + legs + ", food=" + food + "]";
	}
}
