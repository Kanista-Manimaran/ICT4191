package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Student {
	@Id
	private String StudentId;
	private String name;
	private int age;
	private String degree;
	
	@ManyToMany
	@JoinTable(name="Student_Table", joinColumns= {@JoinColumn(name="Student_id",referencedColumnName="StudentId")},
	inverseJoinColumns={@JoinColumn(name="Course_id",referencedColumnName="CourseId")})
	private List<Course> courses=new ArrayList<Course>();

	public Student() {}
	
	
	
	public Student(String studentId, String name, int age, String degree, List<Course> courses) {
		super();
		StudentId = studentId;
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.courses = courses;
	}

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
	
	
	
	
	
	
	
}
