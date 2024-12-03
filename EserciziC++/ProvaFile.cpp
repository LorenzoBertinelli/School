#include <iostream>
#include <fstream>
using namespace std;

int main (){
    //scrittura su file
    ofstream file("esempioFile.txt");
    file<<"prima riga del file!\n";
    file<<"ecco la seconda riga!\n";
    file.close();

    //lettura file
    ifstream file2("esempioFile.txt");
    if(!file2){
        cout<<"errore nella lettura del file";
        return -1;
    }
    string linea;
    while(!file2.eof()){    //leggi fino a quando ci sono ancora caratteri all'interno del file
        getline(file2,linea);
        cout<<linea;
    }
    file2.close();

    return 0;
}