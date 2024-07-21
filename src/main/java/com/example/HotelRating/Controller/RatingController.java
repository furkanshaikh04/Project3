package com.example.HotelRating.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HotelRating.Repo.HotelRatingRepository;
import com.example.HotelRating.entity.Rating;

@RestController
@RequestMapping( "/rating")
public class RatingController {
	@Autowired
	private HotelRatingRepository hotelRatingRepository;
	
	@GetMapping
	public List<Rating> getAllRating(){
		
		return hotelRatingRepository.findAll();
	}
	
	@PostMapping
	public Rating saveRating(@RequestBody Rating rating) {
		
		return hotelRatingRepository.save(rating);
	}
	
	@GetMapping("/findByUserId/{userId}")
	public List<Rating> findBuUserId(@PathVariable("userId") int userId){
		return hotelRatingRepository.findByUserId(userId);
	}
	
	@GetMapping("/findByHotelId/{hotelId}")
	public List<Rating> findByHotelId(@PathVariable("hotelId") int hotelId){
		return hotelRatingRepository.findByHotelId(hotelId);
	}
	

}
