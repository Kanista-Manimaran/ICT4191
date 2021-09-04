package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class RoomType {
	@Id
	private String Type_Id;
	private String Type_Name;
	private String facility;
	@ManyToOne
	@JoinColumn(name="h_Id",referencedColumnName="Id")
	public Hotel hotel;
	
	public RoomType() {}

	public RoomType(String type_Id, String type_Name, String facility, Hotel hotel) {
		super();
		Type_Id = type_Id;
		Type_Name = type_Name;
		this.facility = facility;
		this.hotel = hotel;
	}

	public String getType_Id() {
		return Type_Id;
	}

	public void setType_Id(String type_Id) {
		Type_Id = type_Id;
	}

	public String getType_Name() {
		return Type_Name;
	}

	public void setType_Name(String type_Name) {
		Type_Name = type_Name;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	
	
	
	
	
	
	
	
}
