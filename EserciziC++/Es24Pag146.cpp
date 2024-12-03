#include <iostream>
#include <cmath>

using namespace std;

double perimetro(double a,double b, double c){
    double p=a+b+c;
    return p; 
}

double Area(double a, double b, double c){
    double p=perimetro(a,b,c);
    p=p/2;
    double A=sqrt(p*(p-a)*(p-b)*(p-c));
    return A;
}

int main (){
    double a,b,c;

    cout<<"Ciao, benvenuto in questo programma che calcola l'area (tramite la formula di Erone) e il perimetro di un triangolo "<<endl;
    cout<<"Inserisci il primo valore: "<<endl;
    cin>>a;
    cout<<"Inserisci il secondo valore: "<<endl;
    cin>>b;
    cout<<"Inserisci il terzo valore: "<<endl;
    cin>>c;
    cout<<"Il perimetro e': "<<perimetro(a,b,c)<<endl;
    cout<<"l'area e': "<<Area(a,b,c)<<endl;

    
    return 0;
}