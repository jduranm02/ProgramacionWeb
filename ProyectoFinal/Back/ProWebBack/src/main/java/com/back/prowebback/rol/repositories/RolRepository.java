package com.back.prowebback.rol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.back.prowebback.rol.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}
