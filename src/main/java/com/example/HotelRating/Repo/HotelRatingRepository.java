package com.example.HotelRating.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.HotelRating.entity.Rating;

public interface HotelRatingRepository extends JpaRepository<Rating, Integer>{
	
	@Query("SELECT r FROM Rating r WHERE r.userId = :userId")
	    List<Rating> findByUserId(@Param("userId") int userId);
	 
	 @Query("SELECT r FROM Rating r WHERE r.hotelId = :hotelId")
	    List<Rating> findByHotelId(@Param("hotelId") int hotelId);

}
