DOSSEG
.MODEL SMALL
.STACK 200H
.DATA

numero  DB 16
due     DB 2
resto   DW 0

.CODE

inizio:

mov ah,0
mov ds,ax

ciclo:
mov ah,0
DIV due
mov resto, ax
mov numero, al
push resto
cmp al,0
jne ciclo

fine:
pop dx
ADD 48,dx
push dx
mov ah,4ch
int 21h
END inizio


