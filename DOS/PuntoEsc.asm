DOSSEG
    .MODEL SMALL
    .STACK 100H
.DATA
    
.CODE

   mov ax, @data
   mov ds, ax  
   
   ;prende in unput un carattere e lo mette nel registro al
   mov ah,01   
   int 21h

   cmp al,97 ;97 è la a minuscola
   jne fine 
   mov dl,'!'  ; stampa a schermo quello che c'è in dl
   mov ah,02
   int 21h

fine:
    mov ah,4ch
    int 21h
END

