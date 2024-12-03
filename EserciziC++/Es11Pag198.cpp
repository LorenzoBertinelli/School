/*
Una biblioteca ha identificato tutti i libri della propria collezione mediante un codice numerico. Si deve realizzare un programma C++
che consenta di effettuare le seguenti operazioni memorizzando le informazioni relative a un libro (codice, titolo, autore, 
anno di pubblicazione, editore) in un vettore di strutture:
· aggiunta di un nuovo libro alla collezione;
· visualizzazione dell'elenco dei libri della collezione;
· visualizzazione delle informazioni relative a un libro a partire dal codice;
· visualizzazione delle informazioni relative a un libro a partire dal titolo.
*/
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
struct libro{
    int codice;
    string titolo;
    string autore;
    string editore;
    float anno;
};
void aggiungiLibro(libro *libri, int i){
    cout << "Inserisci i dati del libro (codice, titolo, autore, anno, editore): ";
    cin >> libri[i].codice >> libri[i].titolo >> libri[i].autore >> libri[i].anno >> libri[i].editore;
}
void visualizzaLibri(libro *libri, int dimensione){
    for(int i = 0; i < dimensione; i++){
        cout << "Codice: " << libri[i].codice << endl;
        cout << "Titolo: " << libri[i].titolo << endl;
        cout << "Autore: " << libri[i].autore << endl;
        cout << "Anno: " << libri[i].anno << endl;
        cout << "Editore: " << libri[i].editore << endl;
        cout << "                 " << endl;
    }
}
void visualizzaLibroCodice(libro *libri, int dimensione, int codice){
    for(int i = 0; i < dimensione; i++){
        if(libri[i].codice == codice){
            cout << "Informazioni sul libro:" << codice << endl;
            cout << "                 " << endl;
            cout << "Codice: " << libri[i].codice << endl;
            cout << "Titolo: " << libri[i].titolo << endl;
            cout << "Autore: " << libri[i].autore << endl;
            cout << "Anno: " << libri[i].anno << endl;
            cout << "Editore: " << libri[i].editore << endl;
            cout << "                            " << endl;
            return;
        }
    }
    cout << "Libro non trovato" << endl;
}
void visualizzaLibroTitolo(libro *libri, int dimensione, string titolo){
    for(int i = 0; i < dimensione; i++){
        if(libri[i].titolo == titolo){
            cout << "Informazioni sul libro " << titolo << endl;
            cout << "                 " << endl;
            cout << "Codice: " << libri[i].codice << endl;
            cout << "Titolo: " << libri[i].titolo << endl;
            cout << "Autore: " << libri[i].autore << endl;
            cout << "Anno: " << libri[i].anno << endl;
            cout << "Editore: " << libri[i].editore << endl;
            cout << "                 " << endl;
            return;
        }
    }
    cout << "Libro non trovato" << endl;
}

void salva_file(libro libri[], int dimensione){
    ofstream fileLibri;
    fileLibri.open("fileLibri.txt");
    for(int i=0; i<dimensione; i++){
    fileLibri<<libri[i].titolo <<" "<<libri[i].autore<<endl;
    }
    fileLibri.close();

}

bool apri_file(libro libri[]){ 
    ifstream fileLibri;
    string autore;
    string titolo;
    int i=0;
    if(fileLibri.fail()){
        return true;
    }
    else{
    while(!fileLibri.eof()){
        fileLibri>>autore;
        fileLibri>>titolo;
        libri[i].autore=autore;
        libri[i].titolo=titolo;
        i++;
    }
    }
    fileLibri.close();

   /* ifstream fileLibri("fileLibri.txt");
    if(!fileLibri){
        cout<<"errore nella lettura del file";
        return -1;
    }
    string autore;
    string titolo;
    while(!fileLibri.eof()){    //leggi fino a quando ci sono ancora caratteri all'interno del file
        getline(fileLibri,autore);
        cout<<autore;
        getline(fileLibri,titolo);
        cout<<titolo;
    }
    fileLibri.close();*/
}

int main(){
    libro *libri;
    int dimensione;
    int scelta;
    int codice;
    string titolo;
    cout << "Inserisci il numero di libri da aggiungere: ";
    cin >> dimensione;
    libri = new libro[dimensione];       //libro libri[dimensione]; 
    do{
        cout << "1. Aggiungi libro" << endl;
        cout << "2. Visualizza elenco libri" << endl;
        cout << "3. Visualizza libro per codice" << endl;
        cout << "4. Visualizza libro per titolo" << endl;
        cout << "5. Esci" << endl;
        cout << "Scelta: ";
        cin >> scelta;
        switch(scelta){        
            case 1:
                for(int i = 0; i < dimensione; i++)
                    aggiungiLibro(libri, i);
                break;
            case 2:
                salva_file(libri, 0);
                visualizzaLibri(libri, dimensione);
                apri_file(libri);   
                break;
            case 3:
                cout << "Inserisci il codice del libro da visualizzare: ";
                cin >> codice;
                visualizzaLibroCodice(libri, dimensione, codice);
                break;
            case 4:
                cout << "Inserisci il titolo del libro da visualizzare: ";
                cin >> titolo;
                visualizzaLibroTitolo(libri, dimensione, titolo);
                break;
            case 5:
                return 0;
            default:
                cout << "Scelta non valida" << endl;
                break;
        }
    }while(dimensione!=0);

return 0;
}
