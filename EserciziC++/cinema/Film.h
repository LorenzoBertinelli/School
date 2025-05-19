#include <string>
using namespace std;

class Film{

    private:
    string nome;
    int posti;
    double durata;

    public:
    Film(); //costruttore non parametrizzato
    Film(string,int, double); //costruttore parametrizzato


    string getnome();
    int getposti();
    float getdurata(); 

    void setnome(string);
    void setposti(int);
    void setdurata(double);



};