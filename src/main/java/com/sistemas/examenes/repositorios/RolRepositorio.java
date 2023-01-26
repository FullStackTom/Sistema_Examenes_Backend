package com.sistemas.examenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemas.examenes.modelo.Rol;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Integer> {

}
