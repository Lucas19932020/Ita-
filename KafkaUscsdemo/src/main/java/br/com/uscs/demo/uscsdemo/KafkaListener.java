package br.com.uscs.demo.uscsdemo;

import java.util.UUID; 

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
@org.springframework.kafka.annotation.KafkaListener(groupId = "uscsdemo", topics = "uscsdemo")
public class KafkaListener {
	private final CassandraRepositoryImpl cassandraRepository;
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	@KafkaHandler
	public void handler(String mensagem)
	{
		cassandraRepository.save(DBEntity.builder().id(UUID.randomUUID()).mensagem(mensagem).build());
		System.out.println(mensagem);
		mensagem = "Mensagem adicionada: " + mensagem;
		kafkaTemplate.send("uscsdemoprod", mensagem);
	}
}
