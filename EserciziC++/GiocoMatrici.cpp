/*Realizzare un programma in linguaggio C++ che permetta di implementare il gioco del Memory.
Campo di gioco: una matrice 10x10 nella quale sono state nascoste 50 coppie di simboli a due a due uguali tra loro. 
Compito del giocatore chiamare in successione le coordinate di due celle, cercando di scoprire le coppie contenenti 
simboli uguali. 
Ogni volta che il giocatore individua una coppia corretta, questa rimane scoperta ed il gioco ha termine quando 
risultano scoperte tutte le 50 coppie, 
altrimenti i simboli vengono nuovamente coperti. 
Punteggio ottenuto: il numero dei tentativi effettuati per scoprire tutte le coppie. */
#include <iostream>
#include <ctime>
#define DIM 10
using namespace std;

void stampa_matrice(char celle[DIM][DIM], int x1=-1, int y1=-1, int x2=-1, int y2=-1){
    for(int i=0; i<DIM; i++){
        for(int j=0; j<DIM;j++){
            if(celle[i][j]=='*'){
                cout<<"\033[0m"<<celle[i][j]<<"\t";
            }
            else if((i==x1 && j==y1) || (i==x2 && j==y2) ){
                cout << "\033[0;31m" << celle[i][j] << "\033[0m\t";  // Stampa il numero in rosso
            }
            else if(celle[i][j]!='*'){
                cout<< "\033[0;32m" << celle[i][j] << "\033[0m\t";  // Stampa il numero in verde
            }
        }
        cout<<endl;
    }

}

int cont_asterisco(char board[DIM][DIM]){
    int cont=0;
    for(int i=0; i<DIM; i++){
        for(int j=0; j<DIM; j++){
            if(board[i][j]=='*'){
                cont++;
            }
        }
    }

    return cont;
}

void asterisco(char board[DIM][DIM]){
    for(int i=0; i<DIM; i++){
        for(int j=0; j<DIM; j++){
            board[i][j]='*';
        }
    }
}

void asterisco(char board[DIM][DIM], int x1, int y1, int x2, int y2){
    board[x1][y1]='*';
    board[x2][y2]='*';
}

int main (){

    char celle[DIM][DIM];
    char board[DIM][DIM];
    int caratteri[127]={0};
    int char2=97, char1=char2-DIM*DIM/2;
    int x1, y1, x2, y2;
    int n_mosse=0;
    
    srand(time(NULL));

    for(int i=0; i<DIM; i++){
        for(int j=0; j<DIM;j++){
            int estratto;
            do{
                estratto=rand()%(char2-char1+1)+char1;
            }while(caratteri[estratto]>=2);
            board[i][j]='*';
            caratteri[estratto]=caratteri[estratto]+1;
            celle[i][j]=estratto;
        }
    }

    stampa_matrice(celle);
    stampa_matrice(board);

    do{
        do
        {
            cout<<"Inserisci il valore della prima coordinata x (riga): ";
            cin>>x1;
            cout<<"Inserisci il valore della prima coordinata y (colonna): ";
            cin>>y1;
            cout<<"Inserisci il valore della seconda coordinata x (riga): ";
            cin>>x2;
            cout<<"Inserisci il valore della seconda coordinata y (colonna): ";
            cin>>y2;
            if((x1==x2 && y1==y2) || (x1>=DIM || y1>=DIM || x2>=DIM || y2>=DIM) || (x1<0 || y1<0 || x2<0 || y2<0)){
                cout<<"Errore nell'immisione dei dati!  Reinserire i dati"<<endl;
            }
            else if(board[x1][y1]!='*' || board[x2][y2]!='*'){
                cout<<"Errore: carta gia' estratta!"<<endl;
            }
            else{
                break;
            }
        } while (true);

        n_mosse++;
       

        board[x1][y1]=celle[x1][y1];
        board[x2][y2]=celle[x2][y2];

        if(celle[x1][y1]!=celle[x2][y2]){
            stampa_matrice(board,x1,y1,x2,y2);
            asterisco(board,x1,y1,x2,y2);

        }
        else{
            stampa_matrice(board);

        }

    }while(cont_asterisco(board)!=0);

    cout<<"HAI VINTO!"<<endl;
    cout<<"Il tuo punteggio e' di: "<<n_mosse<<endl;

    return 0;
}