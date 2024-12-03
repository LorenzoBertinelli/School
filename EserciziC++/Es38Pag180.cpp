#include <iostream>
#include <string.h>

using namespace std;
int main (){
    char csv[]="1;37;46;54";

    for(int i=0; i<strlen(csv);i++){
        if(csv[i]==';'){
            csv[i]=',';
        }
        cout<<csv[i];
    }
    return 0;
}