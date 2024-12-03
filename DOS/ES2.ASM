;es 2

        DOSSEG
        .MODEL SMALL
        .STACK
        .DATA
        .CODE

inizio:

        mov ax,@DATA
        mov ds,ax

        mov ah,01
        int 21h
        cmp al,'X'
        jne salto
        jmp fine

salto:
        mov dl,'!'
        mov ah,02
        int 21h

fine:
         mov ah,4ch
         int 21h
         END
