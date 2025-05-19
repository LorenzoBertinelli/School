#include <string>
using namespace std;

class Utente{

    private:
    string nome, email;


    public:
    Utente();
    Utente(string, string);


    string getnome();
    string getemail();

    void setnome(string);
void setemail(string);




};