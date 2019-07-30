package it.cast.jiewen.main;

public class Dish {
	private String name;
	private double price;
	private int like;

	/************* ≤Àµ•∂‘œÛ ************/
	public Dish(String name, double price, int like) {
		super();
		this.name = name;
		this.price = price;
		this.like = like;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
