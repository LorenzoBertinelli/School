.MODEL SMALL

.DATA
    msgNumbers DB 'Numeri a una cifra: $'
    msgLowerCase DB 'Lettere minuscole: $'
    msgUpperCase DB 'Lettere maiuscole: $'

.CODE
    MOV AX, @DATA
    MOV DS, AX

    ; Stampa numeri a una cifra
    MOV AH, 09H
    ;LEA CARICA L'INDIRIZZO DI UN VALORE IN UN REGISTRO, MENTRE MOV CARICA IL VALORE IN UN REGISTRO
    LEA DX, msgNumbers 
    INT 21H

    MOV CX, 10  ; Contatore per i numeri da 0 a 9
    MOV DL, '0' ; Carattere '0'
printNumbers:
    MOV AH, 02H
    INT 21H

    INC DL      ; Passa al prossimo carattere numerico
    LOOP printNumbers  ; Continua finché non sono stati stampati tutti i numeri da 0 a 9

    ; Attendi un tasto
    MOV AH, 08H
    INT 21H

    ; Stampa lettere minuscole
    MOV AH, 09H
    LEA DX, msgLowerCase
    INT 21H

    MOV CX, 26  ; Contatore per le lettere minuscole (da 'a' a 'z')
    MOV DL, 'a' ; Carattere 'a'
printLowerCase:
    MOV AH, 02H
    INT 21H

    INC DL      ; Passa al prossimo carattere minuscolo
    LOOP printLowerCase  ; Continua finché non sono state stampate tutte le lettere minuscole

    ; Attendi un tasto
    MOV AH, 08H
    INT 21H

    ; Stampa lettere maiuscole
    MOV AH, 09H
    LEA DX, msgUpperCase
    INT 21H

    MOV CX, 26  ; Contatore per le lettere maiuscole (da 'A' a 'Z')
    MOV DL, 'A' ; Carattere 'A'
printUpperCase:
    MOV AH, 02H
    INT 21H

    INC DL      ; Passa al prossimo carattere maiuscolo
    LOOP printUpperCase  ; Continua finché non sono state stampate tutte le lettere maiuscole

    ; Termina il programma
    MOV AH, 4CH
    INT 21H
END