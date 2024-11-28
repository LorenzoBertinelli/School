            .MODEL SMALL
            .DATA
NUM         DW    400
NUM2        DB    'E'
VAR_DATO    DW    0

          .CODE
          MOV AX,@DATA
          MOV DS,AX

          MOV AX,NUM
          MOV VAR_DATO,AX
          MOV Bl,NUM2
          INC Bl

          MOV AH,4CH
          INT 21H
          END

          
