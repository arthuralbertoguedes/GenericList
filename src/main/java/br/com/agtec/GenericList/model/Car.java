package br.com.agtec.GenericList.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private Long id;
	private String model;
	private String color;
	
	public Car() {}
	
	public Car(Long id, String model, String color) {
		this.id = id;
		this.model = model;
		this.color = color;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + "]";
	}
	
	
	
}
