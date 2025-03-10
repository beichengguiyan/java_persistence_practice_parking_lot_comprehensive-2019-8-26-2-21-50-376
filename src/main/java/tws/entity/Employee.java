package tws.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {
    private int id;
    private String name;
    private int age;
    private List<Parkinglot> parkinglots = new ArrayList<Parkinglot>();
    public Employee() {

    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public List<Parkinglot> getParkinglots() {
		return parkinglots;
	}

	public void setParkinglots(List<Parkinglot> parkinglots) {
		this.parkinglots = parkinglots;
	}
}
