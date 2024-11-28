;caricare un valore in un registro e salvare in un altro registro
;etichette     istruzioni\direttive      operandi     commenti
               DOSSEG
               .MODEL SMALL
               .STACK 200H
               .DATA
var1           DB     5
               .CODE
inizio:
               mov      ax,@data
               mov      ds,ax

               mov      bx,var1

               ;fine programma
               mov     4ch
               int     21h
               END     inizio
