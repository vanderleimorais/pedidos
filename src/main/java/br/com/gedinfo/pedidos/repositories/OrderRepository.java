package br.com.gedinfo.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gedinfo.pedidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
