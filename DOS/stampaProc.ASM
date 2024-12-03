stampa PROC
    salta:
        mov dl, [bx]
        cmp dl, 0 ; Check for null terminator
        je fine ; Exit if null terminator found
        inc bx ; Move to next character
        jmp salta ; Continue printing

fine:
    mov ah, 0
    ret
endp stampa
main:
    mov ax, @data
    mov ds, ax
    mov bx, offset stringa1

    call stampa

    mov al, contatore
    mov ah, 0

salta2:
    div dieci ; Divide by 10, preserving remainder in AH
    mov cx, 0
    mov cl, ah ; Store remainder in CL (least significant digit)
    push cx ; Save remainder for later

    cmp al, 0 ; Check if quotient is 0
    je fine2 ; Exit if quotient is 0

    jne salta2 ; Continue dividing if quotient is not 0

fine2:
    pop ax ; Retrieve remainder from stack

    mov ah, 02 ; Set service number for output
    mov dl, al ; Convert ASCII digit to decimal
    add dl, 48 ; Convert decimal digit to ASCII representation
    int 21h ; Output character

    mov ah, 4ch ; Set service number for exit
    int 21h ; Exit program

end main