/*Es17 Pag a58*/ 

#include <iostream>

/*  dati di input: giorno, mese, anno
    dati di output: giorno della settimana
    vincoli di intergrità: 1<g<31  1<m<12    1582<a<2100*/

using namespace std;

int main(){
    
    int giorno,mese,anno,somma,resto;
    cout<<"inserisci il giorno: ";
    cin>>giorno;
    cout<<"inserisci il mese: ";
    cin>>mese;
    cout<<"inserisci l'anno: ";
    cin>>anno;

    if((giorno>=1 && giorno<=31) && (mese>=1 && mese<=12) && (anno>=1582 && anno<=2100)){
        mese=mese - 2;
    if(mese<0){
        anno=anno-1;
        mese=mese+12;    
    }
        somma=giorno+anno +anno/4-anno/100+(mese-2)*31/12;
        resto=somma % 7; //resto della divisione per 7
        if(resto==0){
            cout<<"Domenica!" <<endl;
        }
        else if(somma==1){
            cout<<"Lunedi!" <<endl;
        }
        else if(somma==2){
            cout<<"Martedi!" <<endl;
        }
        else if(somma==3){
            cout<<"Mercoledi!" <<endl;  
        }
        else if(somma==4){
            cout<<"Giovedi!" <<endl;  
        } 
        else if(somma==5){
            cout<<"Venerdi!" <<endl;  
        } else if(somma==6){
            cout<<"Sabato!" <<endl;  
        } 
    }

    else{
        cout<<"Dati non corretti!"<< endl;
    }

    return 0;
}