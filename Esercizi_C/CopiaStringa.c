#include <stdio.h>
#include <string.h>

void copia(char *frase, char *letteremin){
    
    for(int i=0; i<strlen(frase);i++){
        if(frase[i]>=97 && frase[i]<=122){
            frase[i]=letteremin[i];
        }
    }

    letteremin[i]='\0';
}

int main(){
    char frase[100];
    char letteremin[100];
    

    printf("inserisci una frase: %s\n", frase);
    scanf("%s", & frase);

    printf("le lettere minuscole sono: %s\n", copia(frase, letteremin));
    return 0;
}