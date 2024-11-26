DOSSEG
.MODEL SMALL
.STACK 200H
.DATA

stringa1 db  "arcobaleno",0
contatore db  0
dieci     db  10

.CODE

;dichiaro una procedura di stampa delle stringhe

stampa PROC
        mov     si,bx     ; carica l'indirizzo della stringa in si
      
      
salta:
       mov      al,[si]
       cmp      al,0       
       je       fine
       inc      si
       inc      contatore
       jmp      salta

fine:
    
       RET
       ENDP    stampa

main:
        mov     ax,@data
        mov     ds,ax
        mov     bx,offset stringa1     ;lea bx,stringa1

        ;chiamata della procedura di stampa
        call    stampa
salta2:
        mov     al,contatore
        mov     ah,0
        div     dieci
        mov     contatore,al
        mov     al,0
        mov     al,ah
        mov     ah,0
        push    ax
        cmp     contatore,0
        jne     salta2


        pop     dx
        add     dx,48
        mov     ah,02h
        int     21h

        pop     dx
        add     dx,48
        int     21h


        mov      ah,4ch
        int      21h
        END      main
