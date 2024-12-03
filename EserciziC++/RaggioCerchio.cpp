//progettare un algoritmo che, letto un valore r del raggio, calcoli e scriva l'area del cerchio relativo

#include <iostream>

using namespace std;
//dati in input: raggio r
//dati in output: area del cerchio, circonferenza
//vicoli di integrità: r>0
//variabili: raggio r, area, circonferenza c
//costanti: pigreco
int main()
{
  float r, area, c;
  cout << "inserisci il valore del raggio, deve essere maggiore di 0: " << endl;
  cin>>r;
  if(r>0){
    area=r*r*3.14; //formula dell'area
    c=2*3.14*r; //formula circonferenza
    cout<<"area= "<<area<<endl;
    cout<<"circonferenza= "<<c<<endl;
  }
  else{
    cout<<"errore di input"<< endl;
    }

  return 0;
}

