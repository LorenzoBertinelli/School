DOSSEG
    .MODEL SMALL
    .STACK 200H
.DATA
    var1 DB ?
    var2 DB ?
.CODE
;inizio

    mov ax, @data
    mov ds, ax

    ; Legge il primo byte in var1
    mov ah, 01
    int 21h
    mov var1, al



    ; Legge il secondo byte in var2
    mov ah, 01
    int 21h
    mov var2, al


    ; Confronto dei valori letti
    mov al, var1
    mov bl, var2
    cmp al, bl
    je uguale
    ja maggiore
    jb minore

uguale:
    mov ah, 02H
    mov dl, 'U'
    int 21h
    jmp fine

maggiore:
    mov ah, 02H
    mov dl, '>'
    int 21h
    jmp fine

minore:
    mov ah, 02H
    mov dl, '<'
    int 21h


fine:
    ;fine programma
    mov ah, 4ch
    int 21h
END