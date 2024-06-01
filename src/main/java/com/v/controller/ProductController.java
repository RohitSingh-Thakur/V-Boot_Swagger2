package com.v.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.v.entity.Product;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@Api(value = "Product Controller", description = "REST APIs related to Product Entity!")
public class ProductController {

	@ApiOperation(value = "Get product Details", response = Product.class)
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved product Object"),
			@ApiResponse(code = 400, message = "Invalid input provided"),
			@ApiResponse(code = 500, message = "Internal server error") })
	
	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductByName(@ApiParam(value = "Name of the Product", required = true) @RequestParam String name) {
		return new Product();
	}
	
	

	@ApiOperation(value = "Create a new Product")
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved product Object"),
			@ApiResponse(code = 400, message = "Invalid input provided"),
			@ApiResponse(code = 500, message = "Internal server error") })
	@PostMapping(path = "/createProduct", consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product cerateProduct(@ApiParam(value = "Pass Product Details", required = true, name = "Product Class") @RequestBody Product product) {

		return product;
	}
	

}
