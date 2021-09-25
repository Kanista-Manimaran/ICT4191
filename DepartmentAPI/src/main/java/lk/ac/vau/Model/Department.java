package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@XmlRootElement
@Entity
public class Department {
	@Id
	private String Id;
	private String Name;
	private int No_of_emp;
	@OneToMany
	@JoinColumn(name="dept_Id",referencedColumnName="Id") 
	public List<Employee> emp;


	
	
	public Department() {}
	
	public Department(String id, String name, int no_of_emp, List<Employee> emp) {
		super();
		Id = id;
		Name = name;
		No_of_emp = no_of_emp;
		this.emp = emp;
	}

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNo_of_emp() {
		return No_of_emp;
	}
	public void setNo_of_emp(int no_of_emp) {
		No_of_emp = no_of_emp;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
