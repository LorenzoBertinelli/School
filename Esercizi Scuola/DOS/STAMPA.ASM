               DOSSEG
               .MODEL SMALL
               .STACK 200H
               .DATA
               .CODE

inizio:

                mov ah,02
                mov dl,76
                int 21h
                mov ah,02
                mov dl,79
                int 21h
                mov ah,02
                mov dl,82
                int 21h
                mov ah,02
                mov dl,69
                int 21h
                mov ah,02
                mov dl,78
                int 21h
                mov ah,02
                mov dl,90
                int 21h
                mov ah,02
                mov dl,79
                int 21h


                ;fine programma
                mov ah,4ch
                int 21h
                END inizio
