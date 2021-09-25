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

import lk.ac.vau.Model.Post;
import lk.ac.vau.Repo.PostRepo;


@RestController
@RequestMapping("/Post")
@Produces(MediaType.APPLICATION_XML)

public class PostController {
	@Autowired
	PostRepo cont;
	
	@GetMapping
	public List<Post> getAll(){
		return cont.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Post get(@PathVariable("/{id}") Long id) {
		return cont.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Post post) {
		cont.save(post);
	}
	
	@PutMapping
	public void update(@RequestBody Post post) {
		cont.save(post);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("/{id}") Long id) {
		cont.deleteById(id);
	}
}
