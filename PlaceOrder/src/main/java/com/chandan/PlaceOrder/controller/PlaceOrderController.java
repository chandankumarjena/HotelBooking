package com.chandan.PlaceOrder.controller;

import java.net.URI;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.chandan.PlaceOrder.entity.Hotel;
import com.chandan.PlaceOrder.repository.CustomerRepository;
import com.chandan.PlaceOrder.repository.HotelRepository;
import com.chandan.PlaceOrder.repository.RoomRepository;

@RestController
public class PlaceOrderController {

	@Autowired
	private HotelRepository hotelRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private RoomRepository roomRepository;
	
	@PostMapping("/api/orders")
	public ResponseEntity<Object> placeOrder(@Valid @RequestBody Hotel hotel) {
		hotelRepository.save(hotel);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.buildAndExpand(hotel.getHotelId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
