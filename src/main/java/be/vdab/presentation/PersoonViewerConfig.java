package be.vdab.presentation;

import org.springframework.context.annotation.Bean;

import be.vdab.PersoonEigenschap;
import be.vdab.services.PersoonService;

//@ImportResource("classpath:presentation.xml")
public class PersoonViewerConfig {
	@Bean
	PersoonViewer persoonViewer(PersoonService persoonService) {
		return new PersoonViewer(new PersoonEigenschap[] { PersoonEigenschap.VOORNAAM, PersoonEigenschap.FAMILIENAAM,
				PersoonEigenschap.AANTAL_KINDEREN }, persoonService);
	}
}