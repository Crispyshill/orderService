package com.transcendenttopicals.orderService;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OrderController {
	
	@PostMapping("/placeOrder")
	public ResponseEntity<?> placeOrder(@RequestBody HashMap<String, Integer> shoppingCart){
		//TODO implement
		return null;
	}
	
	@PutMapping("/updateOrder")
	public ResponseEntity<?> updateOrder(@RequestBody Order order){
		//TODO implement;
		return null;
	}
	
	@GetMapping("/getOrder/{orderId}")
	public ResponseEntity<?> getOrder(@PathVariable String orderId){
		//TODO implement
		return null;
	}

}
