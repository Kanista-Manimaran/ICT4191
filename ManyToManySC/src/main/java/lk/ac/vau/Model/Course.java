package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Course {
	@Id
	private String CourseId;
	private String name;
	private int duration;
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="courses")
	private List<Student> students=new ArrayList<Student>();
	
	public Course() {}

	public Course(String courseId, String name, int duration, List<Student> students) {
		super();
		CourseId = courseId;
		this.name = name;
		this.duration = duration;
		this.students = students;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	
	
	
}
