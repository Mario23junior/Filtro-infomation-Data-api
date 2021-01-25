package com.project.filterData.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.filterData.DTO.UserLocationDTO;
import com.project.filterData.Model.User;
import com.project.filterData.Repository.UserRepository;
import com.project.filterData.Service.MapInformation;

@RestController
@RequestMapping("/user/information")
public class ControllerUser {
     
	private MapInformation mapInformation;
	private UserRepository userRepository;
	
	public ControllerUser(MapInformation mapInformation, UserRepository userRepository) {
		 this.mapInformation = mapInformation;
		 this.userRepository = userRepository;
 	}
	
	@GetMapping("/map")
	public List<UserLocationDTO> ListInformation() {
		List <UserLocationDTO> userLocation = mapInformation.getAllUserLocation();
		return userLocation;
	}
	
	@PostMapping
	public User salvarData(@RequestBody User user){
		return userRepository.save(user);
	}

}
