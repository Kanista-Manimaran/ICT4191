package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@XmlRootElement
@Entity
public class Hotel {
	@Id
	private String Id;
	private String Name;
	private String Location;
	
	@OneToMany(mappedBy = "hotel")
	public List<Room> room;
	@OneToMany(mappedBy = "hotel")
	public List<RoomType> roomtype;
	
	public Hotel(){}

	public Hotel(String id, String name, String location, List<Room> room, List<RoomType> roomtype) {
		super();
		Id = id;
		Name = name;
		Location = location;
		this.room = room;
		this.roomtype = roomtype;
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

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}

	public List<RoomType> getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(List<RoomType> roomtype) {
		this.roomtype = roomtype;
	}
	
	
	
	
	
	
	
}
