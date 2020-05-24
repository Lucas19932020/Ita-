package br.com.uscs.RandomNumber.resources;

import br.com.uscs.RandomNumber.models.clientes;
import br.com.uscs.RandomNumber.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value="/cadastro")

public class ClienteResource {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<clientes> listacCiesntes(){
        return (List<clientes>) clienteRepository.findAll();
    }

}
