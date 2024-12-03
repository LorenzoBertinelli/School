#ifndef FUNZIONI_H_INCLUDED
#define FUNZIONI_H_INCLUDED 
#include <math.h>

using namespace std;
struct posizione{
    float longitudine;
    float lat;
    long int secondi;
};



const int raggio=6371;

void calcolapercosro(posizione pa, posizione pb){
    float d;

    d=2*raggio*acos(sqrt(pow(sin((pb.lat-pa.lat)/2),2))+(cos(pa.lat)*cos(pb.lat)*pow(sin(pb.longitudine-pa.longitudine)/2)),2);

    cout<<"Distanza in km: "<<d;
}


#endif   //FUNZIONI_H_INCLUDED