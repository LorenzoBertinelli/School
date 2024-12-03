//Dato un numero intero, determinare se e' pari o dispari, i sui divisori. 
/*
dati input: val
dati putput: pari o dispari e divisori
vincoli di integrità: val>0
*/

#include <iostream>
#include <math.h>

using namespace std;

int main () {

    int val;
    float radice;

    do {
        cout << "Inserisci numero: ";
        cin >> val;
    } while(val <= 0);

    if (val % 2 == 0) {
        cout << "il numero e' pari" << endl;
    } else {
        cout << "il numero e' dispari" << endl;
    }

    cout << "divisori: ";
    for (int i = 1; i != val+1; ++i) { 
        if (val % i == 0) 
            cout << i << " "; 
    }


    radice = sqrt(val);
    cout << endl << "radice di val = " << radice; 

    return 0;
}