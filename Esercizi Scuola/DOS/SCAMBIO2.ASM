          DOSSEG
          .MODEL
          .STOCK SMALL
          .DATA

NUM        DB     1
NUM2       DW     2
NUM3       DB     300
           .CODE
INIZIO:
           MOV AX,@DATA
           MOV DS,AX

           MOV AX,NUM
           MOV BX,NUM2
           MOV DX,NUM3
           MOV DX,AX
           MOV AX,CX
           MOV CX,BX
           MOV BX,DX


           MOV AH,4CH
           INT 21H
           END
