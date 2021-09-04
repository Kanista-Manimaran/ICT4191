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

import lk.ac.vau.Model.RoomType;
import lk.ac.vau.Repo.RoomTypeRepo;

@RestController
@RequestMapping("/RoomType")
@Produces(MediaType.APPLICATION_XML)

public class RoomTypeController {

	@Autowired
	RoomTypeRepo cont;

	public List<RoomType> getAll(){
		return cont.findAll();
	}

	@GetMapping("/{id}")
	public RoomType get(@PathVariable("id") String id) {
		return cont.findById(id).get();
	}

	@PostMapping
	public void add(@RequestBody RoomType rm) {
		cont.save(rm);
	}

	@PutMapping
	public void update(@RequestBody RoomType rm) {
		cont.save(rm);
	}

	@DeleteMapping("/{id}")
	public void delete(@RequestBody String id) {
		cont.deleteById(id);
	}


























}
