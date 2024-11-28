.model small
.stack 200h

.data
stringa1 db "ciao",'$'
stringa2 db   5 dup(?)

.code

copia   PROC
      salta:
        mov al,[si]
        mov [di],al
        inc si
        inc di
        cmp al,'$'
        je fine
        jne salta


        fine: ret
        ENDP
                

main:

        mov ax,@data
        mov ds,ax

        lea si, stringa1
        lea di, stringa2

        CALL copia



mov byte ptr [di],'$'
mov ah, 09h
lea dx,stringa2
int 21h



        mov ah,4ch
        int 21h
end main
