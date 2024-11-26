DOSSEG
    .MODEL SMALL
    .STACK 200H
.DATA
    NOME   DB  'LORENZO',0
.CODE
;inizio

    mov ax,@data
    mov ds,ax

    mov si,offset NOME  ;si Š il registro che contiene l'indirizzo del primo elemento
    mov bx,si    ; memorizzo l'indirizzo iniziale
    add bx,6  ;vado al termine del buffer
    mov ah,2
    ciclo:
  
    cmp bx,si
    jl fine

    mov dl,[bx]     ; muovo in dl il contenuto puntato da bx
    dec bx
    int 21h
    jmp ciclo


    fine:
    mov ah,4ch
    int 21h
END

     ;andare  acapo
     mov dl,10
     int 21h
     mov dl,13
     int 21h
