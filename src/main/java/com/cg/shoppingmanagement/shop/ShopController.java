package com.cg.shoppingmanagement.shop;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopController {
	@Autowired
	private ShopService service;
	
	//Retrieve all rows from database
	@GetMapping("/shoptable")
	public List<ShopEntities> list(){
		return service.listAll();
	}
	@GetMapping("/shoptable/{id}")
	public ResponseEntity<ShopEntities> get(@PathVariable Integer id)
	{
	try
	{
	ShopEntities ShopEntities = service.get(id);
	return new ResponseEntity<ShopEntities>(ShopEntities, HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<ShopEntities>(HttpStatus.NOT_FOUND);
	}
	}
	// RESTful API method for Create operation
	@PostMapping("/shoptable")
	public void add(@RequestBody ShopEntities ShopEntities)
	{
	service.save(ShopEntities);
	}
	// RESTful API method for Update operation
	@PutMapping("/shoptable/{id}")
	public ResponseEntity<?> update(@RequestBody ShopEntities ShopEntities, @PathVariable Integer id)
	{
	try
	{
	ShopEntities existShopEntities = service.get(id);
	service.save(existShopEntities);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	// RESTful API method for Delete operation
	@DeleteMapping("/shoptable/{id}")
	public void delete(@PathVariable Integer id)
	{
	service.delete(id);
	}
	}
	


