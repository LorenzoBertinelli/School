// primo es con le funzioni 18/11/2023
#include <iostream>

using namespace std;
//tipo funzione, nome della funzione ed elenco dei parametri formali
int maggiore(int val1, int val2){
    if(val1>val2){
        return val1;
    }
    else{
        return val2;
    }
}

int main(){

    int a,b, massimo;
    cout<<"Inserire i numeri: "<<endl;
    cin>>a;
    cin>>b;
    
    massimo=maggiore(a,b); //invocazione della funzione parametri attuali
    
    cout<<"Il maggiore e' "<<massimo;

    return 0;
}