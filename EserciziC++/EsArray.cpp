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