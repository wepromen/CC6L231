package com.se00502x.lab321x.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.se00502x.lab321x.Repository.EntryRepository;
import com.se00502x.lab321x.entitys.Entrys;

@Service
@Transactional
public class EntryService {
	
	// get all entries
	@Autowired
	private EntryRepository repo;
	public List<Entrys> listAllEntries(){
		return repo.findAll();
	}
	 // get entry by id
	public Entrys getEntryByID(int id) {
		return repo.findById(id).get();
	}
	
	
}
