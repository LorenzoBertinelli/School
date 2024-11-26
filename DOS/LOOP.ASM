                MODEL SAMLL
                .STACK 100H
                .DATA
var1            DW 10
var2            DB '*'
var3            DW 4

                .CODE

                mov ax,@data
                mov ds,ax

                mov dl,'*'
                mov ah,02
                mov cx,10
          ciclo:
                int 21h
                loop ciclo

                mov ah,4ch
                int 21h
                END


