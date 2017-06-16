package com.fboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fboot.entities.Choix;

@Repository
public interface ChoixRepository extends JpaRepository<Choix,Integer>{

}
