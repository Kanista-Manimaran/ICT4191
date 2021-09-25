package lk.ac.vau.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.vau.Model.User;

public interface UserRepo extends JpaRepository<User,String>{

	Optional<User> findAllById(List<User> array);

}
