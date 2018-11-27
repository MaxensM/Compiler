public class CMaisonUser extends CMaison {

	public CMaisonUser() {
	super();

		//Declarations d'appareils
		CEclairage e1 = new CEclairage("e1", TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e1);
		CEclairage e2 = new CEclairage("e2", TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e2);
		CVoletFenetre v1 = new CVoletFenetre("v1", TypeAppareil.VOLET);
		ma_liste_appareils.add(v1);
		CAutreAppareil hf = new CAutreAppareil("hf", TypeAppareil.AUTRE_APPAREIL_HIFI);
		ma_liste_appareils.add(hf);
		CAutreAppareil cafe = new CAutreAppareil("cafe", TypeAppareil.AUTRE_APPAREIL_CAFE);
		ma_liste_appareils.add(cafe);
		CVoletFenetre v2 = new CVoletFenetre("v2", TypeAppareil.VOLET);
		ma_liste_appareils.add(v2);
		CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
		mon_eclairage_salon.addAppareil(e1);
		mon_eclairage_salon.addAppareil(e2);
		ma_liste_ens_appareils.add(mon_eclairage_salon);

		//Declarations Interfaces
		CInterface b1 = new CInterface("b1", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b1);
		CInterface b2 = new CInterface("b2", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b2);
		CInterface b3 = new CInterface("b3", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b3);
		CInterface t1 = new CInterface("t1", TypeInterface.MOBILE);ma_liste_interfaces.add(t1);
		CInterface zap = new CInterface("zap", TypeInterface.TELECOMMANDE);ma_liste_interfaces.add(zap);
		CInterface b4 = new CInterface("b4", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b4);

		//Scenarios

		String bonjour_contenu = "";
		CScenario bonjour = new CScenario("bonjour",bonjour_contenu);
		ma_liste_scenarios.add(bonjour);

		String bonjour2_contenu = "";
		CScenario bonjour2 = new CScenario("bonjour2",bonjour2_contenu);
		ma_liste_scenarios.add(bonjour2);

		String soiree_contenu = "";
		CScenario soiree = new CScenario("soiree",soiree_contenu);
		ma_liste_scenarios.add(soiree);

		String fincafe_contenu = "";
		CScenario fincafe = new CScenario("fincafe",fincafe_contenu);
		ma_liste_scenarios.add(fincafe);

		String soiree_musique_contenu = "";
		CScenario soiree_musique = new CScenario("soiree_musique",soiree_musique_contenu);
		ma_liste_scenarios.add(soiree_musique);

		String verif_contenu = "";
		CScenario verif = new CScenario("verif",verif_contenu);
		ma_liste_scenarios.add(verif);

		//Commandes
		b1.addScenarioAssocie("bonjour");
		t1.addScenarioAssocie("bonjour");
		zap.addScenarioAssocie("bonjour");
		CProgrammation prog_soiree_musique = new CProgrammation("soiree_musique");
		ma_liste_programmations.add(prog_soiree_musique);
		prog_soiree_musique.addDate(new CDate(2017,12,31,19,0));
		CProgrammation prog_soiree = new CProgrammation("soiree");
		ma_liste_programmations.add(prog_soiree);
		prog_soiree.addDate(new CDate(2017,-1,1,18,0));
		prog_soiree_musique.addDate(new CDate(2017,7,14,19,30));
		prog_soiree_musique.addDate(new CDate(2017,12,24,18,30));
		b2.addScenarioAssocie("bonjour2");
		b3.addScenarioAssocie("soiree");
		b3.addScenarioAssocie("fincafe");
		b3.addScenarioAssocie("verif");
		b4.addScenarioAssocie("soiree_musique");

		//Zone de fin
		monHabitat = new HabitatSpecific(ma_liste_appareils,ma_liste_ens_appareils, ma_liste_scenarios,ma_liste_interfaces, ma_liste_programmations);
	}
}