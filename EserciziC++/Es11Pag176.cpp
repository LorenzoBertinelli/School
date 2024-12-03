#include <iostream>
using namespace std;
bool trovanumeri(int vettore[], int dim, int numero){
    for(int i=0; i<dim; i++){
        if(vettore[i]==numero){
            return true;
        }
        return false;
    }
}
int contanum(int vettore[], int dim, int numero){
    int cont=0;
    for(int i=0; i<dim; i++){
        if(vettore[i]==numero){
            cont++;
        }
    }
    return cont;
}
int main(){

    int numero, dim, vettore[10];

    cout<<"quanti elementi vuoi inserire? "<<endl;
    cin>>dim;

   cout<<"inserisci i dati da tastiera"<<endl;

    
//ciclo che legge n dati
    for(int i=0; i<dim; i++)
        cin>>vettore[i];

        cout<<"inserisci un vettore da trovare nel vettore"<<endl;
        cin>>numero;
     
        if(trovanumeri(vettore,dim,numero)){
            cout<<"true"<<endl;
        }
        else
        cout<<"false"<<endl;
        
    

    cout<<"la quantita' di numero argomento e': "<<contanum(vettore,dim,numero);
    return 0;
}