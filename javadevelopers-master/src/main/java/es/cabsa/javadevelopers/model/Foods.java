package es.cabsa.javadevelopers.model;

public class Foods {
	
	private Integer id;
	private String food;
	
	public Foods() {		
	}
	
	public Foods(Integer id, String food) {
		super();
		this.id = id;
		this.food = food;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Foods [id=" + id + ", food=" + food + "]";
	}
	
	
	
	
	
	

}
