package lk.ac.vau.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class workerBuilding implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name="wid",referencedColumnName="wid")
	private Worker worker;
	@Id
	@ManyToOne
	@JoinColumn(name="bid",referencedColumnName="bid")
	private Building building;
	private Date startTime;
	private int NoOfDay;
	public workerBuilding(Worker worker, Building building, Date startTime, int noOfDay) {
		super();
		this.worker = worker;
		this.building = building;
		this.startTime = startTime;
		NoOfDay = noOfDay;
	}
	public workerBuilding() {
		super();
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public int getNoOfDay() {
		return NoOfDay;
	}
	public void setNoOfDay(int noOfDay) {
		NoOfDay = noOfDay;
	}
	
	
}
