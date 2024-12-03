#include <iostream>
using namespace std;
//dati input: raggio
//dati output: area e circonferenza
//vincoli integrit�: raggio>0


void area(double r){
    double area=(r)*(r)*(3.14);
    double circonferenza=(2)*(3.14)*(r);
    cout<<circonferenza<<endl;
    cout<<area;
}


int main()
{
    double r;
    cout << "insrisci il raggio del cerchio: " << endl;
    cin>>r;
    area(r);
    return 0;
}
