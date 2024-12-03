;etichette               istruzione           
                        DOSSEG
                        .MODEL SMALL
                        .STACK 200H
                        .DATA
var1                    DW  20            ; se il dato sta tra 0 a 255 uso DB altrimenti uso DW 
var2                    DB  'a'           ; se viene chiesto di usare DW si usa DW nel caso richiesto
var3                    DW  0
                        .CODE
inizio:
                        mov ax,@data      ; instruzioni necessarie per caricare l'indirizzo del segmento dati
                        mov ds,ax          

                        mov ax,var1
                        mov var3,ax
                        mov al,var2
                        inc al            ; come se in c++ si facessi var++ oppure var=var+1

                        ;fine programma
                        mov     ah,4ch
                        int     21h
                        END
