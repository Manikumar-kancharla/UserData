package in.ashok.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashok.entity.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

}
