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
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import lk.ac.vau.Model.Comments;
import lk.ac.vau.Model.Post;
import lk.ac.vau.Model.User;
import lk.ac.vau.Repo.UserRepo;

@RestController
@RequestMapping("/User")
@Produces(MediaType.APPLICATION_XML)

public class UserController {
	@Autowired
	UserRepo cont;
	
	@GetMapping
	public List<User> getAll(){
		List<User> array=cont.findAll();
		for(User arr :array) {
			//http://localhost:8080/user/uid1101
			String postUrl= linkTo(UserController.class).slash(arr.getUserId()).toString();
			//http://localhost:8080/user/uid1101
			String commentUrl= linkTo(UserController.class).slash(arr.getUserId()).toString();
			
			arr.addLink(postUrl, "Post");
			arr.addLink(commentUrl, "Comment");
		}
		return array;
	}
	
	
	@GetMapping("/{id}")
	public User get(@PathVariable("/{id}") String id) {
		//http://localhost:8080/user/uid1101/post
		String postUrl= linkTo(UserController.class).slash(id).slash("post").toString();
		//http://localhost:8080/user/uid1101/comment
		String commentUrl= linkTo(UserController.class).slash(id).slash("comment").toString();
		User user =cont.findById(id).get();
		user.addLink(postUrl, "Post");
		user.addLink(commentUrl, "Comment");

		return cont.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody User user) {
		cont.save(user);
	}
	
	@PutMapping
	public void update(@RequestBody User user) {
		cont.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("/{id}") String id) {
		cont.deleteById(id);
	}
	
	@GetMapping("/{id}/post")
	public List<Post> getuserost(@PathVariable("/{id}") String id) {
		return cont.findById(id).get().getPost();
	}
	
	@GetMapping("/{id}/cmd")
	public List<Comments> getusercmd(@PathVariable("/{id}") String id) {
		return cont.findById(id).get().getCmt();
	}
	
	
	
	
	
	
}
