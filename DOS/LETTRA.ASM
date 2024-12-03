                DOSSEG
                .MODEL SMALL
                .STACK 200H
                .DATA
                
var1    DB 0
        .CODE
;inizio
        mov ax,@data
        mov ds,ax

        mov ah, 01
        int 21h
        mov bl,al
        int 21h
        mov cl,al
        sub bl,48
        sub cl,48
        add bl,cl
        add bl,48
        mov dl,bl
        mov ah,02
        mov dl,13
        int 21h


        ;fine programma
        mov ah,4ch
        int 21h
        END inizio
