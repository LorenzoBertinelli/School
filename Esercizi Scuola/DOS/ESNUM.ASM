             DOSSEG
             .MODEL
             .STOCK SMALL
             . DATA

      NUM    DB     100          ;DATO 8 BIT(byte)
      NUM2   DW     260          ;DATO A 16 BIT(WORD)
                        .CODE
             MOVE AX,@DATA
             MOVE DS,AX          ; ALLOCA IN MEMORIA INDIRIZZO DI SEGMENTO DATA

             MOV AL,NUM          ;muovo da memoria a registro
             MOV BX,NUM2
             MOV CL,NUM
             MOV DX,BX           ;muovo da registro a registro
             MOV AX,DX           


             MOV AH,4CH           ; FINE PROGRAMMA
             INT 21H
             END
