package Model;

public class shoe {
	private int id;
	private String name;
	private String model;
	private int price;
	private int stock;
	
	public shoe() {
		super();
	}
	public shoe(int id, String name, String model, int price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.stock = stock;
	}
	
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString()
	{
		return getId()+","+getName()+","+getModel()+","+getPrice()+","+getStock();
	}
	
}
