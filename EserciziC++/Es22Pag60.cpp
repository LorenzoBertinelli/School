// Es22Pag60
#include <iostream>

using namespace std;

int main()
{

    int tipo;
    char priorita, durata;
    float costo_abbonamento;

    do
    {
        cout << "Che abbonamento vuoi: 1, 2 o 3?" << endl;
        cin >> tipo;
    } while (tipo < 1 || tipo > 3);    

    do
    {
        cout << "durata dell'abbonamento: S, M o A?" << endl;
        cin >> durata;
    } while (durata != 'S' && durata != 'M' && durata != 'A');

    switch (tipo)
    {
    case 1:
        switch (durata)
        {
        case 'S':
            costo_abbonamento = 10;
            break;

        case 'M':
            costo_abbonamento = 30;
            break;

        case 'A':
            costo_abbonamento = 250;
            break;
        }
        break;
    case 2:
        switch (durata)
        {
        case 'S':
             costo_abbonamento = 5;
            break;

        case 'M':
             costo_abbonamento = 10;
            break;

        case 'A':
             costo_abbonamento = 150;
            break;
        }
        break;
    case 3:
        switch (durata)
        {
        case 'S':
            costo_abbonamento = 15;
            break;

        case 'M':
             costo_abbonamento = 40;
            break;

        case 'A':
            costo_abbonamento = 300;
            break;
        }
        break;
    }

    cout << "Vuoi un abbonamento di alta priorita' (a) o di bassa priorita' (B)" << endl;
    cin >> priorita;

    if (priorita == 'B')
    {
        costo_abbonamento = costo_abbonamento - (costo_abbonamento * 20 / 100);
        cout << "Il costo dell'abbonamento e' di: " << costo_abbonamento << endl;
    }
    else
    {
        cout << "Il costo dell'abbonamento e' di: " << costo_abbonamento << endl;
    }

    return 0;
}