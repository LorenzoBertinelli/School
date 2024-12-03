; etichette     istruzioni
                DOSSEG
                .MODEL SMALL
                .STACK
                .DATA
var1            DW 20
var2            DW 4
var3            DW 8
var4            DW 10
                .CODE
inizio:
                mov     ax,@data
                mov     ds,ax

                mov     ax,var1
                mov     bx,var2
                mov     cx,var3
                mov     dx,var4
                add     ax,cx
                add     dx,bx
                sub     dx,cx
                sub     ax,bx


                ;fine programma
                mov     ah,4ch
                int     21h
                END
