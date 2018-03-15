package be.vdab;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.services.PersoonService;
import be.vdab.services.PersoonServiceImpl;

public class Main {

	public static void main(String[] args) {
		Persoon pers1 = new Persoon(1, "Jan", "Demol", 0);
		Persoon pers2 = new Persoon(2, "Ben", "Desnul", 4);
		Persoon pers3 = new Persoon(3, "Julius", "Dejong", 6);
		Persoon pers4 = new Persoon(4, "Mark", "Deridder", 2);

		List<Persoon> personen = List.of(pers1, pers2, pers3, pers4);

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml")) {
//			PersoonViewer persoonViewer = context.getBean(PersoonViewer.class);
//			persoonViewer.afbeelden(personen);
			context.getBean(PersoonServiceImpl.class).findAll().stream().forEach(System.out::println);
		}
	}

}
