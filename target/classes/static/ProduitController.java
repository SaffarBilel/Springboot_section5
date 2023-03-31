package com.bilel.produits.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bilel.produits.service.ProduitService;


	
@Controller
public class ProduitController {	
@Autowired
ProduitService produitService;
@RequestMapping("/showCreate")
	
public String showCreate()
{
	return "createProduit";
}
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
