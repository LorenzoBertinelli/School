DOSSEG
    .MODEL SMALL
    .STACK 200H
.DATA
    var1    DB 0
.CODE
;inizio

    mov ax,@data
    mov ds,ax

    mov ah,01
    int 21h           ; leggo il primo carattere var1
    mov var1,al
    int 21h           ; leggo il secondo carattere bl
    mov bl,al 

    ciclo:
    inc var1
    cmp bl,var1
    je fine
    mov dl,var1
    mov ah,02
    int 21h
    jmp ciclo


    fine:
    mov ah,4ch
    int 21h
END