                        DOSSEG
                        .MODEL SMALL
                        .STACK
                        .DATA
                        .CODE
var1                    DW
var2                    DW
inizio
                        mov  ax,@DATA
                        mov  ds,ax


            
                  fine:
                        mov  ah,4ch
                        int  21h
                        END
