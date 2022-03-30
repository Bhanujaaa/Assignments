package com.Online.MovieTicketBooking.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Online.MovieTicketBooking.model.User;
import com.Online.MovieTicketBooking.repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository UserRepo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=UserRepo.findByEmail(email);
		if(user==null) {
			System.out.println("null");
			throw new UsernameNotFoundException("NOT FOUND");
			
		}
		else {
			
		}
			return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),new ArrayList<>());
		// TODO Auto-generated method stub
	
	}
	



}
