package lk.ac.vau.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
@Entity
public class Post {
	@Id
	private Long PostId;
	private String title;
	private String Content;
	private Date CreatedOn;
	@ManyToOne
	@JoinColumn(name="User_Id",referencedColumnName="UserId")
	@JsonIgnore
	public User Owner;
	@OneToMany(mappedBy = "CommentedIn")
	
	public List<Comments> cmt;
	
	public Post() {}

	public Post(Long postId, String title, String content, Date createdOn, User owner, List<Comments> cmt) {
		super();
		PostId = postId;
		this.title = title;
		Content = content;
		CreatedOn = createdOn;
		Owner = owner;
		this.cmt = cmt;
	}

	public Long getPostId() {
		return PostId;
	}

	public void setPostId(Long postId) {
		PostId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	public User getOwner() {
		return Owner;
	}

	public void setOwner(User owner) {
		Owner = owner;
	}

	public List<Comments> getCmt() {
		return cmt;
	}

	public void setCmt(List<Comments> cmt) {
		this.cmt = cmt;
	}

	
	
}
