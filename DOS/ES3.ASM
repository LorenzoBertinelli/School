DOSSEG
.MODEL SMALL
.STACK
.DATA
.CODE

mov ah,01
int 21h
sub al,30h
mov ch,0
mov cl,al
mov dl,10
mov ah,02
int 21h
mov dl,13
mov ah,02
int 21h
mov dl,'&'
mov ah,02
CICLO1:
dec cl
int 21h
loop CICLO1

mov ah,4ch
int 21h
END
