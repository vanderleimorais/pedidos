package br.com.gedinfo.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gedinfo.pedidos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
