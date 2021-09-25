package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.vau.Model.Comments;

public interface CommentRepo extends JpaRepository<Comments,Long>{

}
