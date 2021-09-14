package com.qbo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {

	@GetMapping("")
	public ResponseEntity<List<String>>  getAll(){
		List<String> entities = new ArrayList<String>();
		entities.add("Luis");
		entities.add("Angel");
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}
}
