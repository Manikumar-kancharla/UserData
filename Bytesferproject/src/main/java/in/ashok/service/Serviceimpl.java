package in.ashok.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashok.entity.Users;
import in.ashok.repo.UserRepo;

@Service
public class Serviceimpl implements Service1 {
   
	@Autowired
	private UserRepo userrepo;
	
	
	@Override
	public List<Users> getAlldetails() {
		// TODO Auto-generated method stub
		return  userrepo.findAll() ;
	}

}
