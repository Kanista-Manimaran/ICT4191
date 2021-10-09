package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Worker {
	@Id
	private int wid;
	private String Name;
	private String Typeofwork;
	
	enum SkillType{
		Electric,
		Plumping,
		Roofing,
		Framing
		
	}
	@Enumerated(EnumType.STRING)
	private SkillType skilltype;
	
	@ManyToOne
	@JoinColumn(name="SuperviserId",referencedColumnName="WId")
	private Worker supervisor;
	
	@OneToMany(mappedBy="worker")
	private List<workerBuilding> wkbuild;

	public Worker(int wid, String name, String typeofwork, SkillType skilltype, Worker supervisor,
			List<workerBuilding> wkbuild) {
		super();
		this.wid = wid;
		Name = name;
		Typeofwork = typeofwork;
		this.skilltype = skilltype;
		this.supervisor = supervisor;
		this.wkbuild = wkbuild;
	}

	public Worker() {
		super();
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTypeofwork() {
		return Typeofwork;
	}

	public void setTypeofwork(String typeofwork) {
		Typeofwork = typeofwork;
	}

	public SkillType getSkilltype() {
		return skilltype;
	}

	public void setSkilltype(SkillType skilltype) {
		this.skilltype = skilltype;
	}

	public Worker getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Worker supervisor) {
		this.supervisor = supervisor;
	}

	public List<workerBuilding> getWkbuild() {
		return wkbuild;
	}

	public void setWkbuild(List<workerBuilding> wkbuild) {
		this.wkbuild = wkbuild;
	}

	
}
