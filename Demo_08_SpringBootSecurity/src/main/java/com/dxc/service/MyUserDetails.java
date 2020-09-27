package com.dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dxc.model.User;
import com.dxc.model.UserPrincipal;
import com.dxc.repository.UserRepository;
@Service
public class MyUserDetails implements UserDetailsService {
	@Autowired
	public UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("Username not found");
		}
		return new UserPrincipal(user);
	}

}
