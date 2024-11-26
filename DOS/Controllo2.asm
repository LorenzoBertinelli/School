DOSSEG
    .MODEL SMALL
    .STACK 200H
.DATA
    var1    DB 0
    var2    DB 3
.CODE
;inizio

    mov ax,@data
    mov ds,ax

    mov al,var1
    mov bl,var2
    cmp al,bl
    jne maggiore
    mov ah,02
    mov dl,'U'
    int 21h
    jmp fine
    cmp al,bl
    maggiore:
    jna  minore
    mov ah, 01
    mov dl,'>'   
    int 21h
    cmp al,bl
    minore:
    jb  fine
    mov ah, 01
    mov dl,'<'   
    int 21h

    ;fine programma
    fine:
    mov ah,4ch
    int 21h
END