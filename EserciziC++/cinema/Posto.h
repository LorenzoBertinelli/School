#include <string>
using namespace std;

class Posto {
    private:
        int salaNumero;  // Nome cambiato
        bool disponibile;

    public:
        Posto();
        Posto(bool, int);

        bool isDisponibile();  // Nome cambiato
        int getSalaNumero();   // Nome cambiato

        void setDisponibile(bool);  // Nome cambiato
        void setSalaNumero(int);     // Nome cambiato
};