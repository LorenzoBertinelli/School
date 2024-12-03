DOSSEG
    .MODEL SMALL
    .STACK 200H
.DATA
    STRINGA   DB  "ciao Mondo",0
    n     DW   7
.CODE

main:
        mov ax,@data
        mov ds,ax
        mov si, offset STRINGA
        mov cx,n
stampa_primi:
        cmp cx,0
        je fine_stampa
        mov al,[si]
        cmp al,0
        je fine_stampa
        mov dl,al
        mov ah,02h
        int 21h
        inc si
        dec cx
        jmp stampa_primi
fine_stampa:
        mov ah,4ch
        int 21h

END main


