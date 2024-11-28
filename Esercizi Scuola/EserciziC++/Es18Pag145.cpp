#include <iostream>

// Funzione per verificare se un numero è primo
double isPrime(int n) {
    if (n <= 1) {
        return false;
    }

    for (int i = 2; i <= n / 2; ++i) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}

using namespace std;

int main() {
    int n;

    // Input del valore massimo n
    cout<<"Ciao, benvenuto in questo programma che calcola i numeri primi che precedono il numero inserito"<<endl;
    cout << "Inserisci un numero intero positivo : ";
    cin >> n;

    // Verifica e visualizzazione dei numeri primi tra 1 e n
    cout << "Numeri primi tra 1 e " << n << ":\n";
    for (int i = 2; i <= n; ++i) {
        if (isPrime(i)) {
            cout << i << " ";
        }
    }

    return 0;
}