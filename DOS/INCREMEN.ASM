            .MODEL SMALL
            .DATA
NUM         DW    4
NUM2        DB    'E'
VAR_DATO    DW    3

          .CODE        
          MOV AX,@DATA
          MOV DS,AX

          MOV AX,NUM
          MOV VAR_DATO,AX
          MOV BX,NUM2
          INC BX

          MOV AH,4CH
          INT 21H
          END

          
