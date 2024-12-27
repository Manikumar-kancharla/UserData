package in.ashok.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashok.entity.Users;
import in.ashok.repo.UserRepo;

@Service
public interface Service1 {

	
	public List<Users> getAlldetails();
	
	
}
