#include <string>
using namespace std;

class Posto{

    private:
    int numeroSala;
    bool disponibile;

    public:
    Posto();
    Posto(bool, int);

    bool getdisponibile();
    int getnumeroSala();

    void setdisponibile(bool);
void setnumeroSala(int);





};