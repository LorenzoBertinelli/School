//leggere due dati da tastiera e un operatore aritmetico. Calcolare e visualizzare il risultato.
//dati in input: due numeri, operatore matematico
//dati in output: risultato
//vicoli di integrità: l'operatore deve essere +,-,/,*
#include <iostream>

using namespace std;

int main(){

    float num1, num2, risultato;
    char  operatore;  //+,-,/,*

    cout<<"inserisci il primo numero: "<<endl;
    cin>>num1;
       cout<<"inserisci il secondo numero: "<<endl;
    cin>>num2;

    do{
        cout<<"inserisci operatore: "<<endl;
        cin>>operatore;
    }
    while(operatore!='+' && operatore!='/' && operatore!='-' && operatore!='*');

    switch(operatore){
        case '+':
        {
            (risultato=num1+num2);
            break;
        }
        case '-':
        {
            (risultato=num1-num2);
            break;
        }
        case '/':
        {
            (risultato=num1/num2);
            break;
        }
        case '*':
        {
            (risultato=num1*num2);
            break;
        }
    }

    cout<<"risultato= "<<risultato<<endl;

return 0;
}