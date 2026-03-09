package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdharDto;
import com.example.demo.entity.Adhar;
import com.example.demo.entity.Person;
import com.example.demo.repo.AdharRepo;
import com.example.demo.repo.PersonRepo;

@Service
public class AdharServiceImpl implements AdharService {
	@Autowired
	AdharRepo adharRepo;

	@Autowired
	PersonRepo personRepo;

	@Override
	public void AddAdharForPerson(AdharDto adharDto) {

		Person p = new Person();
		p.setName(adharDto.getPersonName());
		p.setAddress(adharDto.getAddress());
		Person savedPerson = personRepo.save(p);

		Adhar a = new Adhar();
		a.setAdharNumber(adharDto.getAdharNumber());
		a.setPerson(savedPerson);
		adharRepo.save(a);

	}
}
