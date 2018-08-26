package br.com.api.servicos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.api.dao.ServicoRepository;

@SpringBootApplication(scanBasePackages = { "br.com.api.dao", "br.com.api.controllers", "br.com.api.services",
	"br.com.api.dto" })
@EntityScan(basePackages = "br.com.api.entidades")
@EnableJpaRepositories(basePackageClasses = ServicoRepository.class)
public class ApiServicosApplication {

    public static void main(String[] args) {
	SpringApplication.run(ApiServicosApplication.class, args);
    }
}
