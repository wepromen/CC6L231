package com.se00502x.lab321x.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.se00502x.lab321x.entitys.Entrys;
import com.se00502x.lab321x.service.EntryService;

@Controller
public class BlogController {
	@Autowired
	EntryService entryService;
	@RequestMapping("/")
	public String viewBlog(Model model) {
		List<Entrys> listEntries = entryService.listAllEntries();
		model.addAttribute("listEntries", listEntries);
		
		return "index";
		
	}
	
	
}
