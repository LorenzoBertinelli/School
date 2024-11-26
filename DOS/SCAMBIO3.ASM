.MODEL SMALL
.DATA
    NUM             DW      1      
    NUM2            DW      2      
    NUM3            DW      3

.CODE
    MOV  AX,@DATA  
    MOV  DS,AX     

    MOV AX,NUM
    MOV BX,NUM2
    MOV CX,NUM3
    MOV DX,AX
    MOV AX,CX
    MOV CX,BX
    MOV BX,DX



    MOV AH,4CH  ; pre return 0 in c++ (ci si prepara all'uscita del programma)  
    INT 21H       
    END
