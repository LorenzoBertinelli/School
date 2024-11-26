#include <iostream>
#include <math.h>

using namespace std;

double distanza(double x1, double y1, double x2, double y2){ 
    //calcolo la distnza fra due punti in un piano cartesiano 
    double distanza=pow((x2-x1),2)+pow((y2-y1),2); 
    double radice=sqrt(distanza);

    //restituisco il risultato dell'operazione
    return radice;
}

int main(){

    double x1, y1,x2, y2, x3, y3;
    cout<<"Caio, benvenuto in questo programma che calcola il perimetro di un triangolo"<<endl;
    cout<<"Per poter fare questo calcolo ho bisogno che inserisci i punti di un piano cartesiano"<<endl;
    cout<<"Inserisci x1: "<<endl;
    cin>>x1;
    cout<<"Inserisci y1: "<<endl;
    cin>>y1;
    cout<<"Inserisci x2: "<<endl;
    cin>>x2;
    cout<<"Inserisci y2: "<<endl;
    cin>>y2;
    cout<<"Inserisci x3: "<<endl;
    cin>>x3;
    cout<<"Inserisci y3: "<<endl;
    cin>>y3;


    double lato1=distanza(x1, y1, x2, y2);
    double lato2=distanza(x3, y3, x2, y2);
    double lato3=distanza(x1, y1, x3, y3);

    double perimetro= lato1+lato2+lato3;

    cout<<"il perimetro e': "<<perimetro<<endl;
    return 0;
}