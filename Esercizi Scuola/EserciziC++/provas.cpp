#include <iostream>
#include <ctime>
using namespace std;

int main (){
    int v[]={1,3,4,5};
    int *p;
    p=&v[0];
    cout<<p<<endl;
    cout<<*(++p)<<endl;
    cout<<*(p++)<<endl;
    return 0;
}