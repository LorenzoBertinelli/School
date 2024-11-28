 /* es16 pag a58*/
 
 #include <iostream>

 using namespace std;

int main(){


    int a, b, c;  

    cout<< "Inserisci il primo numero:  "; 

    cin>>a;  

    cout<< "Inserisci il secondo numero:  "; 

    cin>>b; 

    cout<< "Inserisci il terzo numero: "; 

    cin>>c; 

    if (a<b && b<c) {  

         

      if (a*a+b*b==c*c) { 

        cout<<"E' una terna pitagorica"; 

        } 

      else { 

             cout<<"Non e' una terna pitagorica"; 
      }

    }

      else {

        cout<<"Errore di input";
      }
    


    return 0;

}

