public class CMaisonUser extends CMaison {

	public CMaisonUser() {
	super();

		//Declarations d'appareils
		CEclairage e1 = new CEclairage("e1", TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e1);
		CEclairage e2 = new CEclairage("e2", TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e2);
		CEclairage e3 = new CEclairage("e3", TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e3);
		CVoletFenetre v1 = new CVoletFenetre("v1", TypeAppareil.VOLET);
		ma_liste_appareils.add(v1);
		CVoletFenetre v2 = new CVoletFenetre("v2", TypeAppareil.VOLET);
		ma_liste_appareils.add(v2);
		CVoletFenetre v3 = new CVoletFenetre("v3", TypeAppareil.VOLET);
		ma_liste_appareils.add(v3);
		CVoletFenetre v4 = new CVoletFenetre("v4", TypeAppareil.VOLET);
		ma_liste_appareils.add(v4);
		CAutreAppareil hf = new CAutreAppareil("hf", TypeAppareil.AUTRE_APPAREIL_HIFI);
		ma_liste_appareils.add(hf);
		CChauffage r1 = new CChauffage("r1", TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(r1);
		CChauffage rad1 = new CChauffage("rad1", TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(rad1);
		CAlarme a1 = new CAlarme("a1", TypeAppareil.ALARME);
		ma_liste_appareils.add(a1);
		CAlarme a2 = new CAlarme("a2", TypeAppareil.ALARME);
		ma_liste_appareils.add(a2);
		CAlarme a3 = new CAlarme("a3", TypeAppareil.ALARME);
		ma_liste_appareils.add(a3);
		CVoletFenetre v5 = new CVoletFenetre("v5", TypeAppareil.VOLET);
		ma_liste_appareils.add(v5);
		CVoletFenetre fen = new CVoletFenetre("fen", TypeAppareil.FENETRE);
		ma_liste_appareils.add(fen);
		CAutreAppareil cafe = new CAutreAppareil("cafe", TypeAppareil.AUTRE_APPAREIL_CAFE);
		ma_liste_appareils.add(cafe);
		CAutreAppareil matv = new CAutreAppareil("matv", TypeAppareil.AUTRE_APPAREIL_TV);
		ma_liste_appareils.add(matv);
		CAutreAppareil proj = new CAutreAppareil("proj", TypeAppareil.AUTRE_APPAREIL_VP);
		ma_liste_appareils.add(proj);
		CAutreAppareil lv = new CAutreAppareil("lv", TypeAppareil.AUTRE_APPAREIL_LV);
		ma_liste_appareils.add(lv);
		CAutreAppareil ll = new CAutreAppareil("ll", TypeAppareil.AUTRE_APPAREIL_LL);
		ma_liste_appareils.add(ll);
		CAutreAppareil port = new CAutreAppareil("port", TypeAppareil.AUTRE_APPAREIL_PORTAIL);
		ma_liste_appareils.add(port);
		CAutreAppareil ordi2 = new CAutreAppareil("ordi2", TypeAppareil.AUTRE_APPAREIL_ORDINATEUR);
		ma_liste_appareils.add(ordi2);
		CAutreAppareil ordi1 = new CAutreAppareil("ordi1", TypeAppareil.AUTRE_APPAREIL_ORDINATEUR);
		ma_liste_appareils.add(ordi1);
		CAutreAppareil ordi = new CAutreAppareil("ordi", TypeAppareil.AUTRE_APPAREIL_ORDINATEUR);
		ma_liste_appareils.add(ordi);
		CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
		mon_eclairage_salon.addAppareil(e2);
		mon_eclairage_salon.addAppareil(e3);
		ma_liste_ens_appareils.add(mon_eclairage_salon);
		CEnsAppareil elec_salon = new CEnsAppareil("elec_salon");
		elec_salon.addAppareil(matv);
		elec_salon.addAppareil(proj);
		elec_salon.addAppareil(ordi);
		ma_liste_ens_appareils.add(elec_salon);

		//Declarations Interfaces
		CInterface b1 = new CInterface("b1", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b1);
		CInterface t1 = new CInterface("t1", TypeInterface.MOBILE);ma_liste_interfaces.add(t1);
		CInterface tel1 = new CInterface("tel1", TypeInterface.TELEPHONE);ma_liste_interfaces.add(tel1);
		CInterface tab1 = new CInterface("tab1", TypeInterface.TABLETTE);ma_liste_interfaces.add(tab1);
		CInterface zap = new CInterface("zap", TypeInterface.TELECOMMANDE);ma_liste_interfaces.add(zap);
		CInterface b2 = new CInterface("b2", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b2);

		//Scenarios

		String bonjour_contenu = "";
		CScenario bonjour = new CScenario("bonjour",bonjour_contenu);
		ma_liste_scenarios.add(bonjour);

		String soiree_contenu = "";
		CScenario soiree = new CScenario("soiree",soiree_contenu);
		ma_liste_scenarios.add(soiree);

		String soiree_musique_contenu = "";
		CScenario soiree_musique = new CScenario("soiree_musique",soiree_musique_contenu);
		ma_liste_scenarios.add(soiree_musique);

		String depart_contenu = "";
		CScenario depart = new CScenario("depart",depart_contenu);
		ma_liste_scenarios.add(depart);

		String test_contenu = "";
		CScenario test = new CScenario("test",test_contenu);
		ma_liste_scenarios.add(test);

		String test2_contenu = "";
		CScenario test2 = new CScenario("test2",test2_contenu);
		ma_liste_scenarios.add(test2);

		//Commandes
		b1.addScenarioAssocie("bonjour");
		tel1.addScenarioAssocie("test");
		tab1.addScenarioAssocie("test");
		zap.addScenarioAssocie("test");
		t1.addScenarioAssocie("test");
		t1.addScenarioAssocie("bonjour");
		t1.addScenarioAssocie("depart");
		CProgrammation prog_test2 = new CProgrammation("test2");
		ma_liste_programmations.add(prog_test2);
		prog_test2.addDate(new CDate(-1,1,1,6,0));
		CProgrammation prog_soiree = new CProgrammation("soiree");
		ma_liste_programmations.add(prog_soiree);
		prog_soiree.addDate(new CDate(2012,-1,1,18,0));
		CProgrammation prog_soiree_musique = new CProgrammation("soiree_musique");
		ma_liste_programmations.add(prog_soiree_musique);
		prog_soiree_musique.addDate(new CDate(2012,11,20,19,30));
		prog_soiree_musique.addDate(new CDate(2012,11,21,19,30));
		b2.addScenarioAssocie("depart");

		//Zone de fin
		monHabitat = new HabitatSpecific(ma_liste_appareils,ma_liste_ens_appareils, ma_liste_scenarios,ma_liste_interfaces, ma_liste_programmations);
	}
}