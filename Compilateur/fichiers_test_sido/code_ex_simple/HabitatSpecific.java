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
		if(appareil0.getNomAppareil().equals("v1"))
			appareil0.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("v2"))
			appareil0.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("e1"))
			appareil0.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("hf"))
			appareil0.appliquer(TypeActionAppareil.ALLUMER);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("cafe"))
			appareil0.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 1:
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getTypeAppareil().equals(TypeAppareil.VOLET))
			appareil0.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("e1"))
			appareil0.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.estTypeAutreAppareil())
			appareil0.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 2:
	for(CEnsAppareil ensemble : this.l_ensembles) 
		if(ensemble.getNomEnsAppareil().equals("mon_eclairage_salon"))
			for(CAppareil appareil0 : ensemble.getLAppareils()) 
			appareil0.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 3:
				System.out.println("Extinction de la machine a cafe.");
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.estTypeAutreAppareil())
			if(appareil0.getTypeAppareil().equals(TypeAppareil.AUTRE_APPAREIL_CAFE))
			appareil0.appliquer(TypeActionAppareil.ETEINDRE);

			break;

			case 4:
	this.execScenarioNum(2);
	for(CAppareil appareil0 : this.l_appareils) 
		if(appareil0.getNomAppareil().equals("hf"))
			if(appareil0.getEtatAppareil() == TypeEtatAppareil.ALLUME){
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getNomAppareil().equals(""))
				System.out.println("La hifi est deja allumee !");
}
	else{ 
	for(CAppareil appareil2 : this.l_appareils) 
		if(appareil2.getNomAppareil().equals("hf"))
			appareil2.appliquer(TypeActionAppareil.ALLUMER);
}

			break;

			case 5:
	for(CAppareil appareil2 : this.l_appareils) 
		if(appareil2.getTypeAppareil().equals(TypeAppareil.ECLAIRAGE))
				System.out.println("Etat de " + appareil2.getNomAppareil() + " = " + appareil2.getEtatAppareil());
	for(CAppareil appareil2 : this.l_appareils) 
		if(appareil2.getNomAppareil().equals("hf"))
			if(appareil2.getEtatAppareil() == TypeEtatAppareil.ALLUME){
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.getNomAppareil().equals("e"))
				System.out.println("La hifi est allumee.");
}

			break;			default:
		}
	}
}