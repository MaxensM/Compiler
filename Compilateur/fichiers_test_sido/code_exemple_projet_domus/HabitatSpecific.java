import java.util.ArrayList;

public class HabitatSpecific extends Habitat {

	public HabitatSpecific(ArrayList<CAppareil> lapp, ArrayList<CEnsAppareil> lens, ArrayList<CScenario> lscen, ArrayList<CInterface> lint, ArrayList<CProgrammation> lprog)
		{
			super(lapp,lens,lscen,lint,lprog);
		}

public void execScenarioNum(int num){System.out.println("Execution du scenario" + this.l_scenarios.get(num).getNomScenario()+ "...");



		switch(num) {

			case 0:
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getTypeAppareil().equals(TypeAppareil.VOLET))
			appareil0.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("a1"))
			appareil0.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("cafe"))
			appareil0.appliquer(TypeActionAppareil.ALLUMER);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("rad1"))
			if(appareil0.getEtatAppareil() == TypeEtatAppareil.ETEINT){
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getNomAppareil().equals("rad1"))
			appareil1.appliquer(TypeActionAppareil.ALLUMER);
}
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getNomAppareil().equals("hf"))
			appareil1.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 1:
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getTypeAppareil().equals(TypeAppareil.VOLET))
			appareil1.appliquer(TypeActionAppareil.FERMER);
	for(CEnsAppareil ensemble : this.l_ensembles) 
		if(ensemble.getNomEnsAppareil().equals("mon_eclairage_salon"))
			for(CAppareil appareil1 : ensemble.getLAppareils()) 
			appareil1.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 2:
	this.execScenarioNum(1);
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.estTypeAutreAppareil())
			if(appareil1.getTypeAppareil().equals(TypeAppareil.AUTRE_APPAREIL_HIFI))
			appareil1.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 3:
				System.out.println("Scenario Depart");
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getTypeAppareil().equals(TypeAppareil.VOLET))
			appareil1.appliquer(TypeActionAppareil.FERMER);
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getTypeAppareil().equals(TypeAppareil.ECLAIRAGE))
			appareil1.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.estTypeAutreAppareil())
			appareil1.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getNomAppareil().equals("fen"))
			if(appareil1.getEtatAppareil() == TypeEtatAppareil.FERME){
	for(CAppareil appareil2 : this.l_appareils) 
		if(appareil2.getNomAppareil().equals("a1"))
			appareil2.appliquer(TypeActionAppareil.ALLUMER);
}
	else{ 
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.getNomAppareil().equals("fen"))
				System.out.println("Attention : la fenêtre " + appareil3.getNomAppareil() + " est ouverte !");
}

			break;

			case 4:
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.getNomAppareil().equals("e1"))
			appareil3.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 5:
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.getNomAppareil().equals("e2"))
			appareil3.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 6:
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.getNomAppareil().equals("e3"))
			appareil3.appliquer(TypeActionAppareil.ALLUMER);

			break;			default:
		}
	}
}