package miniRPG;

public class Item {
	private String name;
	private String description;
	private int value;
	
	public Item(String name, String description, int value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
