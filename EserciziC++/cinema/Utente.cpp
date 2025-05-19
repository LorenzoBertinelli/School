#include "Utente.h"

Utente::Utente()
{
    nome= "";
    email= "";
    
}

//costruttore parametrizzato
Utente::Utente(string n,string e){
    this->nome=n;
    this->email=e;   
 }

 string Utente::getnome()
{
    return this->nome;
}

string Utente::getemail()
{
    return email;
}

void Utente::setnome(string n)
{
    nome=n;
}
void Utente::setemail(string e)
{
    email=e;
}