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
		CChauffage rad1 = new CChauffage("rad1", TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(rad1);
		CAlarme a1 = new CAlarme("a1", TypeAppareil.ALARME);
		ma_liste_appareils.add(a1);
		CVoletFenetre fen = new CVoletFenetre("fen", TypeAppareil.FENETRE);
		ma_liste_appareils.add(fen);
		CAutreAppareil cafe = new CAutreAppareil("cafe", TypeAppareil.AUTRE_APPAREIL_CAFE);
		ma_liste_appareils.add(cafe);
		CAutreAppareil hf = new CAutreAppareil("hf", TypeAppareil.AUTRE_APPAREIL_HIFI);
		ma_liste_appareils.add(hf);
		CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
		mon_eclairage_salon.addAppareil(e2);
		mon_eclairage_salon.addAppareil(e3);
		ma_liste_ens_appareils.add(mon_eclairage_salon);

		//Declarations Interfaces
		CInterface b1 = new CInterface("b1", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b1);
		CInterface b2 = new CInterface("b2", TypeInterface.INTERRUPTEUR);ma_liste_interfaces.add(b2);
		CInterface t1 = new CInterface("t1", TypeInterface.MOBILE);ma_liste_interfaces.add(t1);
		CInterface c1 = new CInterface("c1", TypeInterface.TELECOMMANDE);ma_liste_interfaces.add(c1);

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

		String noel1_contenu = "";
		CScenario noel1 = new CScenario("noel1",noel1_contenu);
		ma_liste_scenarios.add(noel1);

		String noel2_contenu = "";
		CScenario noel2 = new CScenario("noel2",noel2_contenu);
		ma_liste_scenarios.add(noel2);

		String noel3_contenu = "";
		CScenario noel3 = new CScenario("noel3",noel3_contenu);
		ma_liste_scenarios.add(noel3);

		//Commandes
		b1.addScenarioAssocie("bonjour");
		b2.addScenarioAssocie("depart");
		t1.addScenarioAssocie("depart");
		c1.addScenarioAssocie("noel1");
		c1.addScenarioAssocie("noel2");
		c1.addScenarioAssocie("noel3");
		CProgrammation prog_soiree = new CProgrammation("soiree");
		ma_liste_programmations.add(prog_soiree);
		prog_soiree.addDate(new CDate(2017,-1,1,18,0));
		CProgrammation prog_soiree_musique = new CProgrammation("soiree_musique");
		ma_liste_programmations.add(prog_soiree_musique);
		prog_soiree_musique.addDate(new CDate(2017,11,20,19,30));
		prog_soiree_musique.addDate(new CDate(2017,11,21,19,30));

		//Zone de fin
		monHabitat = new HabitatSpecific(ma_liste_appareils,ma_liste_ens_appareils, ma_liste_scenarios,ma_liste_interfaces, ma_liste_programmations);
	}
}