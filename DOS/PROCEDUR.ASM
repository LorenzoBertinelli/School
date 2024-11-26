DOSSEG
.MODEL SMALL
.STACK 200H
.DATA

stringa1 db  "odio ",0
stringa2 db  "assembly ",0
stringa3 db  "tutta la vita!",0
.CODE

;dichiaro una procedura di stampa delle stringhe

stampa PROC
       mov      ah,02    ;sottofunzione di stampa
 salta:
       mov      dl,[bx]
       cmp      dl,0
       je       fine
       int      21h
       inc      bx
       jmp      salta

fine:
       RET
       ENDP    stampa

main:
        mov     ax,@data
        mov     ds,ax
        mov     bx,offset stringa1     ;lea bx,stringa1
        ;chiamaalla procedura di stampa
        call    stampa

        mov bx,offset stringa2
        call stampa

        mov bx,offset stringa3
        call stampa

        mov      ah,4ch
        int      21h
        END      main
