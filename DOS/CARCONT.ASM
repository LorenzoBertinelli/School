DOSSEG
    .MODEL SMALL
    .STACK 200H
.DATA
    STRINGA   DB  "ciao",0  
.CODE

main:
        mov ax,@data
        mov ds,ax
        mov si,offset STRINGA
trova_fine:
        mov al,[si]
        cmp al,0
        je  fine_trovata
        inc  si
       jmp   trova_fine
fine_trovata:
        dec si

stampa_inversa:
        cmp  si,offset STRINGA-1
        je   termina
        mov  dl,[si]
        mov  ah,02h
        int 21h
        dec  si
        jmp  stampa_inversa
termina:
  
    mov ah,4ch
    int 21h


END main
