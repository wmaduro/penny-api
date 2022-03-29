package com.pennycorporation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.NameList;

@RestController
@RequestMapping(path = "/names")
public class NamesController {

	private List<String> nameList = new ArrayList<String>();

	@GetMapping()
	public ResponseEntity<List<String>> get() {

		nameList.add("Penny");
		nameList.add("Welerson");
		nameList.add("Emma");

		return new ResponseEntity<>(nameList, HttpStatus.OK);

	}

}
