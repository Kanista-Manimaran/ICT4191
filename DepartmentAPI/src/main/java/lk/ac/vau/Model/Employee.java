package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@XmlRootElement
@Entity
public class Employee {
	@Id
	private String Id;
	private String name;
	@ManyToOne
	@JoinColumn(name="dept_Id",referencedColumnName="Id")
	private Department department;
	
	public Employee() {}
	
	

	public Employee(String id, String name, Department department) {
		super();
		Id = id;
		this.name = name;
		this.department = department;
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
	

	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	
	
	
	
	
	
	
	
	
	
}
