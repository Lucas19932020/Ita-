package br.com.leite.melisiteste;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController(value = "/exemplo")
public class RestController {
	
	@PostMapping
	public ResponseEntity<String> postMethod(@RequestBody String requestBody)
	{
	return new ResponseEntity("POST executado com texto de entrada "+requestBody,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<String> putMethod(@RequestBody String requestBody)
	{
	return new ResponseEntity("PUT executado com texto de entrada "+requestBody,HttpStatus.OK);
	}
	
	@PatchMapping
	public ResponseEntity<String> patchMethod(@RequestBody String requestBody)
	{
	return new ResponseEntity("PATCH executado com texto de entrada "+requestBody,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<String> getMethod()
	{
	return new ResponseEntity("GET executado",HttpStatus.OK);
	}
}
