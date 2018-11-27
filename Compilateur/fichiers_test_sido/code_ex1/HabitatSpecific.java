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
		if(appareil1.getNomAppareil().equals("hf"))
			appareil1.appliquer(TypeActionAppareil.ALLUMER);

			break;

			case 3:
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getTypeAppareil().equals(TypeAppareil.VOLET))
			appareil1.appliquer(TypeActionAppareil.FERMER);
	for(CAppareil appareil1 : this.l_appareils) 
		if(appareil1.getTypeAppareil().equals(TypeAppareil.ECLAIRAGE))
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
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.estTypeAutreAppareil())
			appareil3.appliquer(TypeActionAppareil.ETEINDRE);

			break;

			case 4:
	for(CEnsAppareil ensemble : this.l_ensembles) 
		if(ensemble.getNomEnsAppareil().equals("elec_salon"))
			for(CAppareil appareil3 : ensemble.getLAppareils()) 
				System.out.println("Etat de " + appareil3.getNomAppareil() + " = " + appareil3.getEtatAppareil());
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.estTypeAutreAppareil())
			if(appareil3.getTypeAppareil().equals(TypeAppareil.AUTRE_APPAREIL_ORDINATEUR))
			appareil3.appliquer(TypeActionAppareil.ALLUMER);
	this.execScenarioNum(2);
	for(CAppareil appareil3 : this.l_appareils) 
		if(appareil3.getNomAppareil().equals("a1"))
			if(appareil3.getEtatAppareil() == TypeEtatAppareil.ETEINT){
	for(CAppareil appareil4 : this.l_appareils) 
		if(appareil4.getNomAppareil().equals("a1"))
			appareil4.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);
}
	for(CAppareil appareil4 : this.l_appareils) 
		if(appareil4.getNomAppareil().equals("a1"))
			if(appareil4.getEtatAppareil() == TypeEtatAppareil.ETEINT){
	for(CAppareil appareil5 : this.l_appareils) 
		if(appareil5.getNomAppareil().equals("a1"))
			appareil5.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);
	for(CAppareil appareil5 : this.l_appareils) 
		if(appareil5.getNomAppareil().equals("a1"))
			appareil5.appliquer(TypeActionAppareil.ETEINDRE);
}
	for(CAppareil appareil5 : this.l_appareils) 
		if(appareil5.getNomAppareil().equals("a1"))
			if(appareil5.getEtatAppareil() == TypeEtatAppareil.DEMI){
	for(CAppareil appareil6 : this.l_appareils) 
		if(appareil6.getNomAppareil().equals("a1"))
			appareil6.appliquer(TypeActionAppareil.ALLUMER);
}
	else{ 
	for(CAppareil appareil7 : this.l_appareils) 
		if(appareil7.getNomAppareil().equals("a1"))
			if(appareil7.getEtatAppareil() == TypeEtatAppareil.ALLUME){
	for(CAppareil appareil8 : this.l_appareils) 
		if(appareil8.getNomAppareil().equals("a1"))
			appareil8.appliquer(TypeActionAppareil.ETEINDRE);
}
	else{ 
	for(CAppareil appareil9 : this.l_appareils) 
		if(appareil9.getNomAppareil().equals("a2"))
			appareil9.appliquer(TypeActionAppareil.ALLUMER);
}
}
	for(CAppareil appareil9 : this.l_appareils) 
		if(appareil9.getNomAppareil().equals("r1"))
			if(appareil9.getEtatAppareil() == TypeEtatAppareil.ECO){
	for(CAppareil appareil10 : this.l_appareils) 
		if(appareil10.getNomAppareil().equals("r1"))
			appareil10.appliquer(TypeActionAppareil.ALLUMER);
}
	for(CAppareil appareil10 : this.l_appareils) 
		if(appareil10.getNomAppareil().equals("r1"))
			if(appareil10.getEtatAppareil() == TypeEtatAppareil.ETEINT){
	for(CAppareil appareil11 : this.l_appareils) 
		if(appareil11.getNomAppareil().equals("r1"))
			appareil11.appliquer(TypeActionAppareil.ALLUMER_ECO);
}
	else{ 
	for(CAppareil appareil12 : this.l_appareils) 
		if(appareil12.getNomAppareil().equals("r1"))
			if(appareil12.getEtatAppareil() == TypeEtatAppareil.ALLUME){
	for(CAppareil appareil13 : this.l_appareils) 
		if(appareil13.getNomAppareil().equals("r1"))
			appareil13.appliquer(TypeActionAppareil.ETEINDRE);
}
	else{ 
	for(CAppareil appareil14 : this.l_appareils) 
		if(appareil14.getNomAppareil().equals("e"))
				System.out.println(" bip !");
}
}
	for(CAppareil appareil14 : this.l_appareils) 
		if(appareil14.getNomAppareil().equals("fen"))
			if(appareil14.getEtatAppareil() == TypeEtatAppareil.OUVERT){
	for(CAppareil appareil15 : this.l_appareils) 
		if(appareil15.getNomAppareil().equals("e"))
				System.out.println("fenêtre ouverte !");
}
	for(CAppareil appareil15 : this.l_appareils) 
		if(appareil15.getNomAppareil().equals("cafe"))
			if(appareil15.getEtatAppareil() == TypeEtatAppareil.ALLUME){
	for(CAppareil appareil16 : this.l_appareils) 
		if(appareil16.getNomAppareil().equals("cafe"))
			appareil16.appliquer(TypeActionAppareil.ETEINDRE);
}
	for(CAppareil appareil16 : this.l_appareils) 
		if(appareil16.getNomAppareil().equals("cafe"))
			if(appareil16.getEtatAppareil() == TypeEtatAppareil.ETEINT){
	for(CAppareil appareil17 : this.l_appareils) 
		if(appareil17.getNomAppareil().equals("cafe"))
			appareil17.appliquer(TypeActionAppareil.ALLUMER);
}

			break;

			case 5:
	for(CAppareil appareil17 : this.l_appareils) 
		if(appareil17.getNomAppareil().equals("e1"))
			if(appareil17.getEtatAppareil() == TypeEtatAppareil.ETEINT){
	for(CAppareil appareil18 : this.l_appareils) 
		if(appareil18.getNomAppareil().equals("e1"))
			appareil18.appliquer(TypeActionAppareil.ALLUMER);
}
	else{ 
	for(CAppareil appareil19 : this.l_appareils) 
		if(appareil19.getNomAppareil().equals("e1"))
			if(appareil19.getEtatAppareil() == TypeEtatAppareil.DEMI){
	for(CAppareil appareil20 : this.l_appareils) 
		if(appareil20.getNomAppareil().equals("e1"))
			appareil20.appliquer(TypeActionAppareil.ETEINDRE);
}
}
	for(CAppareil appareil20 : this.l_appareils) 
		if(appareil20.getNomAppareil().equals("e2"))
			if(appareil20.getEtatAppareil() == TypeEtatAppareil.ALLUME){
	for(CAppareil appareil21 : this.l_appareils) 
		if(appareil21.getNomAppareil().equals("e2"))
			appareil21.appliquer(TypeActionAppareil.TAMISER);
}
	for(CAppareil appareil21 : this.l_appareils) 
		if(appareil21.getNomAppareil().equals("v1"))
			if(appareil21.getEtatAppareil() == TypeEtatAppareil.OUVERT){
	for(CAppareil appareil22 : this.l_appareils) 
		if(appareil22.getNomAppareil().equals("v1"))
			appareil22.appliquer(TypeActionAppareil.FERMER_PARTIEL);
}
	for(CAppareil appareil22 : this.l_appareils) 
		if(appareil22.getNomAppareil().equals("v1"))
			if(appareil22.getEtatAppareil() == TypeEtatAppareil.FERME){
	for(CAppareil appareil23 : this.l_appareils) 
		if(appareil23.getNomAppareil().equals("v1"))
			appareil23.appliquer(TypeActionAppareil.OUVRIR_PARTIEL);
	for(CAppareil appareil23 : this.l_appareils) 
		if(appareil23.getNomAppareil().equals("e"))
				System.out.println(" alors ");
}
	else{ 
	for(CAppareil appareil24 : this.l_appareils) 
		if(appareil24.getNomAppareil().equals("v1"))
			if(appareil24.getEtatAppareil() == TypeEtatAppareil.DEMI){
	for(CAppareil appareil25 : this.l_appareils) 
		if(appareil25.getNomAppareil().equals("v1"))
			appareil25.appliquer(TypeActionAppareil.FERMER);
}
	else{ 
	for(CAppareil appareil26 : this.l_appareils) 
		if(appareil26.getNomAppareil().equals("v1"))
			appareil26.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil26 : this.l_appareils) 
		if(appareil26.getNomAppareil().equals("e"))
				System.out.println(" sinon ");
}
}

			break;			default:
		}
	}
}