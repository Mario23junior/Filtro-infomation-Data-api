package com.project.filterData.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.filterData.DTO.UserLocationDTO;
import com.project.filterData.Service.MapInformation;

@RestController
@RequestMapping("/user/information")
public class ControllerUser {
     
	private MapInformation mapInformation;
	
	public ControllerUser(MapInformation mapInformation) {
		 this.mapInformation = mapInformation;
 	}
	
	
	@GetMapping("/map")
	public List<UserLocationDTO> ListInformation() {
		List <UserLocationDTO> userLocation = mapInformation.getAllUserLocation();
		return userLocation;
	}
	
}
