DOSSEG
    .MODEL SMALL
    .STACK 200H
.DATA
    stringa  dw  500,234,-90,78,761
    risultato dw 0
.CODE
;inizio

    mov ax,@data
    mov ds,ax


    mov si,offset stringa  
    mov ax,0
    mov cx,5
ciclo:
    add ax,[si]
    inc si   
    loop ciclo
    mov risultato,ax



END

     ;andare  acapo
     mov dl,10
     int 21h
     mov dl,13
     int 21h
