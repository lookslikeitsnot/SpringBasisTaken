package be.vdab.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan
@PropertySource("classpath:personen.properties")
public class PersoonRepositoryConfig {
	@Bean
	@Qualifier("CSV")
	PersoonRepository persoonRepositoryCSV(@Value("${persoonCSV}") String path) {
		return new PersoonRepositoryCSV(path);
	}
	@Bean
	@Qualifier("TXT")
	PersoonRepository persoonRepositoryTXT(@Value("${persoonTXT}") String path) {
		return new PersoonRepositoryMeerdereRegels(path);
	}
}
