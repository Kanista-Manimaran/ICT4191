package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Room {
	@Id
	private String Room_No;
	private String location;
	private String class_type;
	
	@ManyToOne
	@JoinColumn(name="h_Id",referencedColumnName="Id")
	public Hotel hotel;

	
	public Room() {}


	public Room(String room_No, String location, String class_type, Hotel hotel) {
		super();
		Room_No = room_No;
		this.location = location;
		this.class_type = class_type;
		this.hotel = hotel;
	}


	public String getRoom_No() {
		return Room_No;
	}


	public void setRoom_No(String room_No) {
		Room_No = room_No;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getClass_type() {
		return class_type;
	}


	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}


	public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	
	
	
	
	
	
	
	
}
