package com.project.filterData.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.project.filterData.DTO.UserLocationDTO;
import com.project.filterData.Model.Location;
import com.project.filterData.Model.User;
import com.project.filterData.Repository.UserRepository;

public class MapInformation {

	private UserRepository userRepository;
	
	public MapInformation(UserRepository userRepository) {
		this.userRepository = userRepository;
 	}
	
	public List<UserLocationDTO> getAllUserLocation() {
		return ((List<User>) userRepository
				      .findAll())
				      .stream()
				      .map(this::converterUserLocationDTO)
				                   .collect(Collectors.toList());
	}
	
	private UserLocationDTO converterUserLocationDTO(User user) {
		
	    UserLocationDTO userLocationDTO = new UserLocationDTO();
	    userLocationDTO.setId(user.getId());
	    userLocationDTO.setUsername(user.getUsername());
	    Location location = user.getLocation();
	}
	
}
