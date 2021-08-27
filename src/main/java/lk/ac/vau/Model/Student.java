package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Student {	
	@Id
	private String Id;
	private String name;
	private int age;
	private String degree;
	private double gPA;	
	
	
	public Student(String id, String name, int age, String degree, double gPA) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.gPA = gPA;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getgPA() {
		return gPA;
	}
	public void setgPA(double gPA) {
		this.gPA = gPA;
	}	
	
	
	
	
	
	
	
}
