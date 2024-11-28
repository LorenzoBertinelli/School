DOSSEG
    .MODEL SMALL
    .STACK 100H
.DATA
    inputPrompt DB 'Inserisci un carattere alfabetico: $'
    errorPrompt DB 'Errore: Inserire un carattere alfabetico!$'
    character   DB  ?
.CODE
;inizio

    mov ax, @data
    mov ds, ax   

    ; Stampa prompt per inserire il carattere
    mov ah, 09h
    lea dx, inputPrompt
    int 21h

    ; Legge un carattere da input
    mov ah, 01h
    int 21h
    mov character, al

    ; Controlla se il carattere è una lettera dell'alfabeto
    cmp character, 'a'
    jl notAlphabet
    cmp character, 'z'
    jg notAlphabet

    ; Converti carattere minuscolo in maiuscolo
    sub character, 32 ; 32 PERCHè è LA DIFFRENZA TRA UN CARATTERE MINUSCOLO E IL IL SUO CORRISPONDENTE MAIUSCOLO
    jmp printResult

checkUpperCase:
    ; Controlla se il carattere è maiuscolo
    cmp character, 'A'
    jl notAlphabet
    cmp character, 'Z'
    jg notAlphabet

    ; Converti carattere maiuscolo in minuscolo
    add character, 32

printResult:
    ; Stampa il carattere convertito
    mov ah, 02h
    mov dl, character
    int 21h
    jmp endProgram

notAlphabet:
    ; Se il carattere non è alfabetico, stampa un messaggio di errore
    mov ah, 09h
    lea dx, errorPrompt
    int 21h

endProgram:
    ; Fine del programma
    mov ah, 4ch
    int 21h
END
