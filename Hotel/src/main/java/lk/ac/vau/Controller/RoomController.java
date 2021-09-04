package lk.ac.vau.Controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Room;
import lk.ac.vau.Repo.RoomRepo;

@RestController
@RequestMapping("/Room")
@Produces(MediaType.APPLICATION_XML)

public class RoomController {

	@Autowired
	RoomRepo cont;


	public List<Room> getAll(){
		return cont.findAll();
	}


	@GetMapping("/{id}")
	public Room get(@PathVariable("id") String Id) {
		return cont.findById(Id).get();
	}

	@PostMapping
	public void add(@RequestBody Room room) {
		cont.save(room);
	}

	@PutMapping
	public void update(@RequestBody Room room) {
		cont.save(room);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String Id) {
		cont.deleteById(Id);
	}


}
