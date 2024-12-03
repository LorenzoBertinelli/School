#ifndef FUNZIONI_H_INCLUDED
#define FUNZIONI_H_INCLUDED 
#include <ctime>   //implementare le funzioni
using namespace std;
void leggivettore(float vettore [], int dim){
        srand (time(NULL)); // srand è una funzione che inizializza il generatore di numeri casuali
        int numero;
        /*genera un numero tra -5 e 18: */
        for(int i=0; i<dim;i++){
            numero=rand()  % 24-5;
            vettore[i]=numero;
        }
}
//stampo il contenuto dell'array
void stampavettore(float vettore [], int dim){
        for(int i=0; i<dim; i++){
            cout<<vettore[i]<<" ";
        }
    }
    //calcola media
float calcolaMedia(float vettore [], int dim){
        float somma=0;
        for(int i=0; i<dim; i++){
            somma=somma+vettore[i];
        }
        return somma/dim; //restituisce la media
}
//calcola il valore minimo
float calcolaMinimo(float vettore [], int dim){
        float minimo=vettore[0];
        for(int i=0; i<dim; i++){
            if(vettore[i]<minimo){
            minimo=vettore[i];
            }
            i++;
        }
        return minimo;
}

float calcolaMassimo(float vettore [], int dim){
        float massimo=vettore[0];
        for(int i=0; i<dim; i++){
            if(vettore[i]>massimo){
            massimo=vettore[i];
            }
            i++;
        }
        return massimo;
}

int sopraMedia(float vettore [], int dim){
        float media=calcolaMedia(vettore,dim);//funzione media che restituisce la media
        int giorni=0;
        for (int i=0; i<dim;i++){
            if(vettore[i]>=media){
                giorni++;
            }
        }
        return giorni;
}
//quali giorni hanno il valore minimo
void giornivaloreminimo(float vettore [], int dim){
    float valmin=calcolaMinimo(vettore,dim); //richiamo la funzione che calcola il valore minimo
    int giorni[31]=();
    int j=0; //indice secondo vettore

    for(int i=0; i<dim; i++){
        if(vettore[i]==valmin){
            giorni[j]=i++; //salvo nel vettore le posizioni che corrispondo alla richiesta
            j++; //incremento l'indice del vettore che memorizza i giorni
        }
    }
    //stampa il vettore giorni
    stampavettore(giorni,j);
}


#endif //FUNZIONI_H_INCLUDED









#include <iostream>
#include <windows.h>
#include "funzioni.h"

using namespace std;

int main (){
    
    float temperature[31];//dichiare array di 31 elementi
    //menù
    int scelta;
    do{
        cout<<"Scegli: \n 1 per riempire il vettore \n 2 per stampare \n 3 per calcolare la media \n 4 il minimo \n 5 il massimo \n 6 il numero di giorni sopra alla media\n 7 per sapere quali giorni hanno il valore minimo  \n 0 per uscitre"<<endl;
        cin>>scelta;

        switch(scelta){
            case 1:leggivettore(temperature,31);break;
            case 2:stampavettore(temperature,31);break;
            case 3:cout<<"la media e'"<<calcolaMedia(temperature,31)<<endl;break;
            case 4:cout<<"valore minimo e': "<<calcolaMinimo(temperature,31)<<endl;break;
            case 5:cout<<"valore massimo e': "<<calcolaMassimo(temperature,31)<<endl;break;
            case 6:cout<<"il numero di giorni sopra alla media e': "<<sopraMedia(temperature,31)<<endl;break;
            case 7:cout<<"i giorni con il valore minimo sono: " <<giornivaloreminimo(temperature,31)<<endl;break;
            case 0:cout<<"per uscire"<<endl;break;
            default:cout<<"scelta non possibile"<<endl;
        }
        system("pause");//premi un tasto per continuare
        system("cls");//pulisce lo schermo

    }while(scelta!=0);//esce se si preme il tasto 0
    leggivettore(temperature,31);
    stampavettore(temperature,31);
    return 0;
}