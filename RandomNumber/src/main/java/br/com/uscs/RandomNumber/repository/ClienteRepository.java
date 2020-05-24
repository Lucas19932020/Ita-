package br.com.uscs.RandomNumber.repository;

import br.com.uscs.RandomNumber.models.clientes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<clientes, String> {}
