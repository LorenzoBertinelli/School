#include <iostream>
#include <math.h>

using namespace std;

void equazione(float a, float b, float c){

    //equazione testo
    cout<<a<<"x^2 +"<<b<<"x +"<<c<<endl;  

    double delta=pow(b,2)-4*a*c;
    if(delta<0){
        cout<<"impossibile"<<endl;
        return;
    }
    else if (delta==0){
        double x= -b /2*a;
        cout<<"x= "<<x<<endl;
        return;
    }
    double x1= (-b + sqrt(delta))/2*a;
    double x2= (-b - sqrt(delta))/2*a;
        
    cout<<"x1= "<<x1<<endl;
    cout<<"x2= "<<x2<<endl;

}

int main(){
    float val1, val2, val3;

    cout<<"Ciao, benvenuto in questo programma che calcola l'equazione e le/a radici/e dei/l risultato/i"<<endl;
    cout<<"Inserisci il primo valore: "<<endl;
    cin>>val1;
    cout<<"Inserisci il secondo valore: "<<endl;
    cin>>val2;
    cout<<"Inserisci il terzo valore: "<<endl;
    cin>>val3;


    equazione(val1,val2,val3);


    return 0;
}