//dati in input: peso del pacco, distanza da percorrere, classe (urgente o normale) 
//dati in output: costo trasporto
//dati del problema: vedi tabella libro di testo pag A44 
//vicoli di integrità: peso>0 AND distanza>0

#include <iostream>

using namespace std;

int main(){

    float peso, distanza, CostoSpedizione, CostoKg;
    char  classe;
    do  //ciclo iterativo post condizionale   il do while serve a verificare i vincoli di intergrità
    {
        cout<<"inserisci il peso: "<<endl;
        cin>>peso;
        cout<<"inserisci la distanza in Km: "<<endl;
        cin>>distanza;
    }while(peso<0 || distanza<0);

    cout<<"inserisci la classe n/N(normale) oppure u/U(urgente): "<<endl;
    cin>>classe;
    //devo verificare che il carattere digitato sia "Normale" o "normale" oppure "Urgente" o "urgente"
    if(classe=='N'|| classe=='n'){
        if(distanza<=100){
            CostoKg=1.0;
            CostoSpedizione=CostoKg*peso;
            cout<<"il costo e': "<<CostoSpedizione<<endl;
        }
        else if(distanza>100 || distanza<=500){
                CostoKg=1.5;
            CostoSpedizione=CostoKg*peso;
            cout<<"il costo e': "<<CostoSpedizione<<endl;
        }
        else{
            CostoKg=2.0;
            CostoSpedizione=CostoKg*peso;
            cout<<"il costo e': "<<CostoSpedizione<<endl;
        }
    }
         else if(classe=='U' || classe=='u'){
        if(distanza<=100){
            CostoKg=1.5;
            CostoSpedizione=CostoKg*peso;
            cout<<"il costo e': "<<CostoSpedizione<<endl;
        }
        else if(distanza>100 || distanza<=500){
                CostoKg=2.0;
            CostoSpedizione=CostoKg*peso;
            cout<<"il costo e': "<<CostoSpedizione<<endl;
        }
        else{
            CostoKg=3.0;
            CostoSpedizione=CostoKg*peso;
            cout<<"il costo e': "<<CostoSpedizione<<endl;
        }
        }
    else{
        cout<<"Errore, il carattere selezionato non e' corretto"<<endl;
    }
        
    return 0;
}
