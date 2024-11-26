// il giocatore deve soppravvivere per 1350 giorni (5 anni)

//possibile quest : lanciare petardi dalle scale. 10 punti quando becchi un prof, 
//15 se becchi la capra, 20 se becchi un marocchino, -20 se becchi QUARANTELLI <3,

#include <iostream>
#include <string>
#include <ctime>
#include <cstdlib>
#include <chrono>
#include <thread>
#include <fstream>

using namespace std;

string dialogo (string a) {

    cout<<"[";cout<<a;cout<<"]"<<endl;

    return a;

}

string map (string b) {
        cout<<""<<endl;
cout<<"                      %                                                      "<<endl;
cout<<"                      @ *******+=========:::::::::@@@@@@@@@@               "<<endl;
cout<<"                      @                                    @                 "<<endl;
cout<<"                      @           [Area B]              @@@@@@@@@@@@@@@@@@@@:"<<endl;
cout<<"    [palestra]        @                                 @                   *"<<endl;
cout<<"                      @                                 @                   *"<<endl;
cout<<"                      @ ::::::::::::::::::::::::::::::::@      [area A]     *"<<endl;
cout<<"                      @                                 @                   * "<<endl;
cout<<"                      @                                 @                   * "<<endl;
cout<<"@@@@@@@@@@@@@@@@@@@@@@@                                :@@@@@@@@@@@@@@@@@@@@* "<<endl;
cout<<"                                                                [Entrata]    "<<endl;
cout<<"                                         @@@@@@@@@@@*                        "<<endl;
cout<<"               @@@@@@@@@@@               @         +@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         +@                        "<<endl;
cout<<"               @@@@@@@@@@@                 .......  "<<endl<<endl;

return b;
}


int main (void) {

string c0="",c1="",c2="",c3="",c4="",c5="";//questi sono i checkpoint

cout<<"  _____ _______ _____  ____   _____    _____ _____ __  __ _    _ _            _______ ____  _____  "<<endl;
cout<<" |_   _|__   __/ ____|/ __ \\ / ____|  / ____|_   _|  \\/  | |  | | |        /\\|__   __/ __ \\|  __ \\ "<<endl;
cout<<"   | |    | | | (___ | |  | | (___   | (___   | | | \\  / | |  | | |       /  \\  | | | |  | | |__) |"<<endl;
cout<<"   | |    | |  \\___ \\| |  | |\\___ \\   \\___ \\  | | | |\\/| | |  | | |      / /\\ \\ | | | |  | |  _  / "<<endl;
cout<<"  _| |_   | |  ____) | |__| |____) |  ____) |_| |_| |  | | |__| | |____ / ____ \\| | | |__| | | \\ \\ "<<endl;
cout<<" |_____|  |_| |_____/ \\____/|_____/  |_____/|_____|_|  |_|\\____/|______/_/    \\_\\_|  \\____/|_|  \\_\\"<<endl<<endl<<endl;

string nome,cognome;

cout<<"'detta la Lobby'"<<endl<<endl;
string menui = "";



cout<<"[A] Nuova Partita"<<endl<<endl;  // inizia una nuova avventura (di merda)!
cout<<"[B] Carica Partita"<<endl<<endl; //tutta una roba da programmare
cout<<"[C] Crediti"<<endl<<endl;  // scriviamo la gang
cout<<"[D] esci dal gioco"<<endl<<endl<<endl; //esce dal gioco



cin>>menui;

if (menui == "C" || menui =="c")
{
    while (menui == "c"  || menui == "C")
    {
    
    
    
    cout<<"Creatore - NAPOY."<<endl;
    cout<<"Sponsor  - Rik"<<endl;
    cout<<"Developer- NAPOY,DIEGHOST_8"<<endl;

cout<<""<<endl<<endl<<endl;

cout<<"[A] Nuova Partita"<<endl<<endl;  // inizia una nuova avventura (di merda)!
cout<<"[B] Carica Partita"<<endl<<endl; //tutta una roba da programmare
cout<<"[C] Crediti"<<endl<<endl;  // scriviamo la gang
cout<<"[D] esci dal gioco"<<endl<<endl<<endl; //esce dal gioco



cin>>menui;
    }
}
//bool gv; // Giocatore Vivo, (se e' falso il gioco si dovra' interrompere)

if (menui == "d" || menui == "D")
{

    return 0;
}




if (menui == "A" || menui == "a")
{
    //gv = true;
        ofstream nom("nome.txt");
    nom<<"";
    nom.close();

    ofstream cog("cognome.txt");
    cog<<"";
    cog.close();

    ofstream cap1("cap1.txt");
    cap1<<"";
    cap1.close();

cout<<"ciao studente! benvenuto all'itsos! qui dovrai soppravvivere per 5 (quasi impossibile) anni!"<<endl;
cout<<"scrivi prima di tutto il nome del tuo personaggio!  "; cin>>nome;

    ofstream nomee("nome.txt");
    nomee<<nome;
    nomee.close();

cout<<"scrivi il tuo cognome!  "; cin>>cognome;

    ofstream cognomee("cognome.txt");
    cognomee<<cognome;
    cognomee.close();


    string scientifico,informatico,meccanico,af; // letteralmente gli indirizzi

    cout<<""<<endl;
cout<<"                      %                                                      "<<endl;
cout<<"                      @ *******+=========:::::::::@@@@@@@@@@               "<<endl;
cout<<"                      @                                    @                 "<<endl;
cout<<"                      @           [Area B]              @@@@@@@@@@@@@@@@@@@@:"<<endl;
cout<<"    [palestra]        @                                 @                   *"<<endl;
cout<<"                      @                                 @                   *"<<endl;
cout<<"                      @ ::::::::::::::::::::::::::::::::@      [area A]     *"<<endl;
cout<<"                      @                                 @                   * "<<endl;
cout<<"                      @                                 @                   * "<<endl;
cout<<"@@@@@@@@@@@@@@@@@@@@@@@                                :@@@@@@@@@@@@@@@@@@@@* "<<endl;
cout<<"                                                                [Entrata]    "<<endl;
cout<<"                                         @@@@@@@@@@@*                        "<<endl;
cout<<"               @@@@@@@@@@@               @         +@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         %@                        "<<endl;
cout<<"               @         @               @         +@                        "<<endl;
cout<<"               @@@@@@@@@@@                 .......  "<<endl<<endl;

cout<<"*premi un qualsiasi tasto per andare avanti*"<<endl;

string a0 = "69104pippoplutopaperino";
string a1 = "69104pippoplutopaperino";
string a2 = "69104pippoplutopaperino";
string a3 = "69104pippoplutopaperino";


cin>>a0;

if (a0 != "69104pippoplutopaperino")
{
    cout<<"[Rappresentante]"<<endl;
    cout<<"Benvenuti all'ITSOS! "<<endl;
    cout<<"qui passerete i vostri 5 anni a formarvi verso"<<endl;
    cout<<"il mondo del lavoro e dell'universita',"<<endl<<endl;
    cout<<"[NUOVA QUEST]"<<endl;
    cout<<"soppravvivi per i prossimi 5 anni all'itsos."<<endl;
    cout<<"*premi un qualsiasi tasto per andare avanti*"<<endl<<endl<<endl;
    cin>>a1;
}
if (a1 != "69104pippoplutopaperino")
{
    ofstream cap1("cap1.txt");
    cap1<<"true";
    cap1.close();

    cout<<"*sei stato collocato nella tua classe*"<<endl;
    cout<<"scegli con quale compagno di classi parlare"<<endl;
    string gianmarco_zanzari = "Gianmarco Zanzari",luca_bagozzi="Luca Bagozzi",francesco_rubino="Francesco Rubino";

    cout<<"[A] ???"<<endl;
    cout<<"[B] ???"<<endl;
    cout<<"[C] ???"<<endl;
    string p2; //personaggio secondario

    while (c1 == "")
    {
        string p2d = "";
    
    while (p2 != "a" || p2 != "A" || p2 != "b" || p2 != "B" || p2 != "c" || p2 != "C")
    {
        cin>>p2;

    
    

        if (p2 == "a" || p2 =="A")
        {
           
            cout<<"["<<nome<<" "<<cognome<<"]"<<endl;
            cout<<"Ciao!..."<<endl;
            cout<<"["<<gianmarco_zanzari<<"]"<<endl;
            cout<<"ciao, piacere..."<<endl;

            p2d = gianmarco_zanzari;

            c1 = gianmarco_zanzari;
             break;

             cout<<"["<<gianmarco_zanzari<<"]"<<endl;
             cout<<""<<endl;

        }
        else        if (p2 == "b" || p2 =="B")
        {   
            cout<<"["<<nome<<" "<<cognome<<"]"<<endl;
            cout<<"Ciao!..."<<endl;
            c1 = luca_bagozzi;break;
        }
            else    if (p2 == "c" || p2 =="C")
        { 
            cout<<"["<<nome<<" "<<cognome<<"]"<<endl;
            cout<<"Ciao!..."<<endl;
            c1 = francesco_rubino;break;
        }
    else if (p2 != "a" || p2 != "A" || p2 != "b" || p2 != "B" || p2 != "c" || p2 != "C")
    {
        cout<<"errore";
    }
 }
           

        
    }
    
}



}
    return 0;
}