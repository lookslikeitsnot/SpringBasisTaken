package be.vdab.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import be.vdab.repositories.PersoonRepository;

@Configuration
//@ComponentScan
//@ImportResource("classpath:services.xml")
public class ServicesConfig {	
	@Bean
	PersoonServiceImpl persoonServiceImpl(@Qualifier("TXT") PersoonRepository persoonRepository) {
		return new PersoonServiceImpl(persoonRepository);
	}
}
