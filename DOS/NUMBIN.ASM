stampare il binario di un numero decimale come parametro alla procedura

DOSSEG
.MODEL SMALL
.STACK 200H
.DATA

        formato_output db "%b",0xa, 0
        numero_da_convrtire dw 123

.CODE

start:
        mov ax,@DATA
        mov ds, ax

        mov ax, offset[numero_da_convertire]
        mov bx,2
        mov cx,32

ciclo_stampa:
        mov dx,0
        div bx
        add dl, 

