/*
dati di input: x,y
dati di output: z
vincoli di integrità: non vi sono vinxoli di integrità
*/
#include <iostream>

using namespace std;

int main(){

    int x,y;
    int z;

    cout<<"inserisci il primo numero: "<<endl;
    cin>>x;
    cout<<"inserisci il secondo numero: "<<endl;
    cin>>y;

    z=0;

    while(x!=0){

        if(x%2!=0){
            z=z+y;
        }

        else{
            x=x/2;
            y=y*2;
        }

    }

    cout<<"Z e': "<<z<<endl;

    return 0;
}