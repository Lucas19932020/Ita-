package br.com.uscs.demo.uscsdemo;

import java.util.UUID; 

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(value = "demo")

public class DBEntity {
	
	@PrimaryKeyColumn(
			name = "id",
			ordinal = 1,
			type = PrimaryKeyType.PARTITIONED)
	UUID id;
	
	@Column(value = "mensagem")
	String mensagem;

}
