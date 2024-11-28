#include <iostream>

using namespace std;

void stampa(char n, int num){
    int cast=n;
    int somma=0;
    for(int i=0; i<num; i++){
        char lettera=cast+1+i;
        somma=somma+lettera;

        cout<<lettera;   
    } 
    cout<<somma<<endl;
  
}


int main(){
    char n;
    int val;

    cout<<"inserisci il carattere: "<<endl;
    cin>>n;
    cout<<"inserisci il valore: "<<endl;
    cin>>val;

    stampa(n,val);


}