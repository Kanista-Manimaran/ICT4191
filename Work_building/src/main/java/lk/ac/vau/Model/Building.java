package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Building {
	@Id
	private int bid;
	private String addres;
	enum BuildingType{
		Office,
		Retail,
		Resident,
		Warehouse
	}
	@Enumerated(EnumType.STRING)
	private BuildingType buildingtype;
	private int QualityLevel;
	private int status;
	@OneToMany(mappedBy = "building")
	public List<workerBuilding> worker;
	
	public Building() {
		super();
	}

	public Building(int bid, String addres, BuildingType buildingtype, int qualityLevel, int status,
			List<workerBuilding> worker) {
		super();
		this.bid = bid;
		this.addres = addres;
		this.buildingtype = buildingtype;
		QualityLevel = qualityLevel;
		this.status = status;
		this.worker = worker;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public BuildingType getBuildingtype() {
		return buildingtype;
	}

	public void setBuildingtype(BuildingType buildingtype) {
		this.buildingtype = buildingtype;
	}

	public int getQualityLevel() {
		return QualityLevel;
	}

	public void setQualityLevel(int qualityLevel) {
		QualityLevel = qualityLevel;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<workerBuilding> getWorker() {
		return worker;
	}

	public void setWorker(List<workerBuilding> worker) {
		this.worker = worker;
	}
	
	
}
