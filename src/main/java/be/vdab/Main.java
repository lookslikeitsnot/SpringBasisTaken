package be.vdab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.presentation.PersoonViewer;
import be.vdab.presentation.PersoonViewerConfig;
import be.vdab.repositories.PersoonRepositoryConfig;
import be.vdab.services.ServicesConfig;

public class Main {

	public static void main(String[] args) {
		// Persoon pers1 = new Persoon(1, "Jan", "Demol", 0);
		// Persoon pers2 = new Persoon(2, "Ben", "Desnul", 4);
		// Persoon pers3 = new Persoon(3, "Julius", "Dejong", 6);
		// Persoon pers4 = new Persoon(4, "Mark", "Deridder", 2);
		//
		// List<Persoon> personen = List.of(pers1, pers2, pers3, pers4);
		//
		// try (ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("SpringXMLConfig.xml")) {
		// PersoonViewer persoonViewer = context.getBean(PersoonViewer.class);
		// persoonViewer.afbeelden();
		// }
		try (AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(
				new Class[] {PersoonRepositoryConfig.class, ServicesConfig.class, PersoonViewerConfig.class})) {
			context.getBean(PersoonViewer.class).afbeelden();
		}
	}

}
