#include <iostream>

using namespace std;
void scambio(int &x, int &y){
    int t;  //variabile temporanea che serve come appoggio per effettuare lo scambio
    t=x;
    x=y;
    y=t;
}

void BubbleSort(int vet[], int N){          //procedura per l'ordinamento midiante algoritmo di ordinamento Bubble Sort
    bool s;     //variabile di controllo
    do{         //fino a quando viene effettuato uno scambio 
        for(int i=0; i<(N-1); i++){
            s=false;
            if(vet[i]>vet[i+1]){        //confornto coppia elementi
                scambio(vet[i],vet[i+1]);  //invoco la funzione
                s=true;
            }
        }
    }while(s==true);        // oppure while(s);  sottindende che s devve essre = a true

} 

void seleSort(int vet[], int dim){
    
    int i, j, posizione_min;
    int temp;
    for (i = 0; i < dim-1; i++){
        posizione_min = i;
        for (j = i+1; j < dim; j++){
            if(vet[j] < vet[posizione_min]){
                posizione_min= j;
            }
        }
        if(i != posizione_min){
            temp = vet[posizione_min];
            vet[posizione_min] = vet[i];
            vet[i]=temp;
        }
    }
}
        



const int MAX=100;  //dimensione max del vettore

int main (){
    int v[MAX], dim, scelta;

    do{
        cout<<"Inserisci la dimensione del vettore (compresa tra 1 escluso e 100 incluso): "<<endl;
        cin>>dim;
    }while(dim<=1 || dim>100);

    cout<<endl;
    
    for(int i=0; i<dim; i++){
        cout<<"inserisci l'elemento "<<i+1<<": "<<endl;
        cin>> v[i];
    }

 do{
        cout << "1. Utilizza l'ordinamento Bublle Sort" << endl;
        cout << "2. Utilizza l'ordinamento Selection Sort" << endl;
        cout << "3. Utilizza l'ordinamento Insert Sort" << endl;
        cout << "4. Utilizza l'ordinamento Quick Sort" << endl;
        cout << "5. Esci" << endl;
        cout << "Scelta: ";
        cin >> scelta;
        switch(scelta){        
            case 1:
                for(int i = 0; i < dim; i++)
                    BubbleSort(v,dim);
                break;
            case 2:
                   seleSort(v,dim);
                break;
            case 3:
                
                break;
            case 4:
               
                break;
            case 5:
                return 0;
            default:
                cout << "Scelta non valida" << endl;
                break;
        }
    }while(dim!=0);
    BubbleSort(v,dim);

    cout<<endl;

    cout<<"Vettore ordinato!"<<endl;
    for(int i=0; i<dim; i++){
        cout<<"v[ "<<i+1<<"]: "<<v[i]<<endl;
    }


    return 0; 
}
    