package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class User {
	@Id
	private String UserId;
	private String EmailId;
	private String FirstName;
	private String LastName;
	private int Age;
	@Transient
	private List<Link>links=new ArrayList<Link>();
	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	@OneToMany(mappedBy = "Owner")
	public List<Post> post;
	@OneToMany(mappedBy = "CommentedBy")
	public List<Comments> cmt;
	
	public User() {}

	public User(String userId, String emailId, String firstName, String lastName, int age, List<Post> post,
			List<Comments> cmt) {
		super();
		UserId = userId;
		EmailId = emailId;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		this.post = post;
		this.cmt = cmt;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Comments> getCmt() {
		return cmt;
	}

	public void setCmt(List<Comments> cmt) {
		this.cmt = cmt;
	}
	
	
	public void addLink(String uri, String rel) {
		Link link=new Link(uri,rel);
		links.add(link);
	}
	
	
	
	
	
	
}
