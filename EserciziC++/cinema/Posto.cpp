#include "Posto.h"

Posto::Posto()
{
    salaNumero = 0;
    disponibile = false;
}

Posto::Posto(bool d, int n){
    this->salaNumero = n;
    this->disponibile = d;
}

int Posto::getSalaNumero()
{
    return this->salaNumero;
}

bool Posto::isDisponibile()
{
    return disponibile;
}

void Posto::setSalaNumero(int n)
{
    this->salaNumero = n;  // Assegna il valore del parametro al membro della classe
}

void Posto::setDisponibile(bool d)
{
    disponibile = d;
}