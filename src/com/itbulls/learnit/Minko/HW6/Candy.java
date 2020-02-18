package com.itbulls.learnit.Minko.HW6;

public abstract class Candy {
	public int number;
	private String name;
	private int calorie;
	private int weight;

	Candy(int number, String name, int weight, int calorie) {
		this.number = number;
		this.name = name;
		this.weight = weight;
		this.calorie = calorie;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Candy");
		sb.append(" name is ").append(name);
		sb.append(" weight is ").append(weight);
		sb.append(" calorie is ").append(calorie);
		return sb.toString();
	}
}
