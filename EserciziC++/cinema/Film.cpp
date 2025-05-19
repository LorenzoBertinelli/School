#include "Film.h"

Film::Film()
{
    nome= "";
    posti = 0;
    durata = 0;
    
}

Film::Film(string n,int p,double d){
    this->nome=n;
    this->posti=p;
    this->durata=d;
 }

 string Film::getnome(){
    return this->nome;
}

float Film::getdurata(){
    return durata;
}

int Film ::getposti(){
    return posti;
}



void Film::setnome(string n)
{
    nome=n;
}

void Film::setposti(int p)
{
    posti=p;
}
void Film::setdurata(double d)
{
    durata=d;
}