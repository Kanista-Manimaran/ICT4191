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

import lk.ac.vau.Model.Course;
import lk.ac.vau.Repo.CourseRepo;

@RestController
@RequestMapping("/coursemtm")
@Produces(MediaType.APPLICATION_XML)
public class CourseControl {
	@Autowired
	CourseRepo cont;

	public List<Course> getAll(){
		return cont.findAll();
	}



	@GetMapping("/{id}")
	public Course get(@PathVariable("id") String Id) {
		return cont.findById(Id).get();
	}

	@PostMapping
	public void add(@RequestBody Course crs) {
		cont.save(crs);
	}

	@PutMapping
	public void update(@RequestBody Course crs) {
		cont.save(crs);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String Id) {
		cont.deleteById(Id);
	}


}
