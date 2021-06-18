package model;

public class Product {
	private String name;
	private double price;
	private long id;
	
	private Product next;
	
	public Product(String name, double price, long id){
		this.name = name;
		this.price = price;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public long getId() {
		return id;
	}

	public Product getNext() {
		return next;
	}

	public void setNext(Product next) {
		this.next = next;
	}

	@Override
	public String toString() {
		String out="";
		if(next!=null) {
			out = "Product [name=" + name + ", price=" + price + ", id=" + id + ", next=" + next.getName() + "]";
		}else {
			out = "Product [name=" + name + ", price=" + price + ", id=" + id + "]";
		}
		return out;
	}

	public boolean hasNext() {
       boolean has = false;
       if(next!=null) {
    	   has = true;
       }
		return has;
	}

	
	
	
	
	
	
	
	
	
	

}
