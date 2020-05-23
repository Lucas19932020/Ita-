package br.com.uscs.demo.uscsdemo;

import java.util.UUID; 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepositoryImpl extends CrudRepository<DBEntity,UUID> {}
