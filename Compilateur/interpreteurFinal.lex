import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column

%{
	public int getYyLine(){
		return yyline+1;
	}
	public int getYyColumn(){
		return yycolumn+1;
	}
	public String getYyText(){
		return yytext();
	}
%}

message = \"[^\"]*\" 
erreur_ident = [0-9]+[a-zA-Z]+
erreur_chaine = \"[^\"\n]*\n

%%
//Structure
"PROGRAMME_DOMUS" {return new Symbol(sym.PROGRAMME_DOMUS);}
"DECLARATION_APPAREILS" {return new Symbol(sym.DECLARATION_APPAREILS);}
"DECLARATION_INTERFACES" {return new Symbol(sym.DECLARATION_INTERFACES);}
"DECLARATION_SCENARII" {return new Symbol(sym.DECLARATION_SCENARII);}
"DECLARATION_COMMANDES" {return new Symbol(sym.DECLARATION_COMMANDES);}
"SCENARIO" {return new Symbol(sym.SCENARIO);}

//Mots-clés
"definir" {return new Symbol(sym.DEFINIR);}
"executer_scenario" {return new Symbol(sym.EXECUTER_SCENARIO);}
"associer" {return new Symbol(sym.ASSOCIER);}
"programmer" {return new Symbol(sym.PROGRAMMER);}
"message" {return new Symbol(sym.MESSAGE);}
"pourtout" {return new Symbol(sym.POURTOUT);}
"faire" {return new Symbol(sym.FAIRE);}
"fait" {return new Symbol(sym.FAIT);}
"si" {return new Symbol(sym.SI);}
"alors" {return new Symbol(sym.ALORS);}
"sinon" {return new Symbol(sym.SINON);}
"fsi" {return new Symbol(sym.FSI);}

//Fonctions
"ouvrir" {return new Symbol(sym.OUVRIR);}
"fermer" {return new Symbol(sym.FERMER);}
"eteindre" {return new Symbol(sym.ETEINDRE);}
"allumer" {return new Symbol(sym.ALLUMER);}
"tamiser" {return new Symbol(sym.TAMISER);}
"etat" {return new Symbol(sym.ETAT);}
"allumer_partiel" {return new Symbol(sym.ALLUMER_PARTIEL);}
"allumer_eco" {return new Symbol(sym.ALLUMER_ECO);}
"ouvrir_partiel" {return new Symbol(sym.OUVRIR_PARTIEL);}
"fermer_partiel" {return new Symbol(sym.FERMER_PARTIEL);}
"allume" {return new Symbol(sym.ALLUME);}
"eteint" {return new Symbol(sym.ETEINT);}
"demi" {return new Symbol(sym.DEMI);}
"eco" {return new Symbol(sym.ECO);}
"ouvert" {return new Symbol(sym.OUVERT);}
"ferme" {return new Symbol(sym.FERME);}

//Elements
"eclairage" {return new Symbol(sym.ECLAIRAGE);}
"volet" {return new Symbol(sym.VOLET);}
"chauffage" {return new Symbol(sym.CHAUFFAGE);}
"alarme" {return new Symbol(sym.ALARME);}
"fenetre" {return new Symbol(sym.FENETRE);}
"autre_appareil" {return new Symbol(sym.AUTRE_APPAREIL);}
"interrupteur" {return new Symbol(sym.INTERRUPTEUR);}
"mobile" {return new Symbol(sym.MOBILE);}
"telephone" {return new Symbol(sym.TELEPHONE);}
"telecommande" {return new Symbol(sym.TELECOMMANDE);}
"tablette" {return new Symbol(sym.TABLETTE);}
"tv" {return new Symbol(sym.TV);}
"hifi" {return new Symbol(sym.HIFI);}
"cafetiere" {return new Symbol(sym.CAFETIERE);}
"video_proj" {return new Symbol(sym.VIDEO_PROJ);}
"lave_vaisselle" {return new Symbol(sym.LAVE_VAISSELLE);}
"lave_linge" {return new Symbol(sym.LAVE_LINGE);}
"seche_linge" {return new Symbol(sym.SECHE_LINGE);}
"ordinateur" {return new Symbol(sym.ORDINATEUR);}
"portail" {return new Symbol(sym.PORTAIL);}
"PRINT" {return new Symbol(sym.PRINT);}

//Gestion d'erreurs
{erreur_chaine} {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => fin de chaine attendue ! "); }
{message} {return new Symbol(sym.CONTENU_MESSAGE, yytext());}
{erreur_ident} {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => syntaxe identificateur non respectee ! "); }

//Syntaxe
"</" {return new Symbol(sym.INFERIEUR_SLASH);} 
"<" {return new Symbol(sym.INFERIEUR);}
">" {return new Symbol(sym.SUPERIEUR);}
"//".*\n { }
"," {return new Symbol(sym.VIRGULE);}
"." {return new Symbol(sym.POINT);}
"(" {return new Symbol(sym.PARENTHESE_GAUCHE);}
")" {return new Symbol(sym.PARENTHESE_DROITE);}
"==" {return new Symbol(sym.DOUBLE_EGAL);}
"=" {return new Symbol(sym.EGAL);}
"{" {return new Symbol(sym.CROCHET_GAUCHE);}
"}" {return new Symbol(sym.CROCHET_DROITE);}
":" {return new Symbol(sym.DEUX_POINTS);}
";" {return new Symbol(sym.POINT_VIRGULE);}
"_" {return new Symbol(sym.UNDERSCORE);}
[0-9]+ {return new Symbol(sym.ENTIER, new Integer(yytext()));}
[a-z][a-zA-Z0-9_]* {return new Symbol(sym.IDENTIFIANT, new String(yytext()));}
//[a-zA-Z0-9 \[\]!\"#$%&'()*+,.\/:;<=>?@\\{|}~-]+ {return new Symbol(sym.STRING, yytext());}

[ \t]  { }
\n { }
. {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => caractere inconnu ! ");}
