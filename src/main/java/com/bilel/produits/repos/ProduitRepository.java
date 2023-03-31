package com.bilel.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilel.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
