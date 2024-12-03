#include <iostream>
#include <cstring>
using namespace std;
 
bool palindromo (char str1[],char str2[])
{
 
        int i = 0;
        if (strlen(str1) == strlen(str2) && str1[0] == str2[0])
        {
            return true;
        }
        else
        {
             return false;
        }
}
 
int main () {
 
char str1[50];
char str2[50];
 
    cin>>str1;
    cin>>str2;
 
    cout<<palindromo(str1,str2);
 
    return 0;
}
ha il menu contestualeParagrafo
 
ha il menu contestuale