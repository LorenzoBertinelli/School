         DOSSEG
        .MODEL SMALL
        .STACK
        .DATA
        .CODE

inizio:

        mov ax,@DATA
        mov ds,ax

        mov dl,'a'
        mov ah,02
        int 21h
        mov dl,'b'
        mov ah,02
        int 21h
        mov dl,'c'
        mov ah,02
        int 21h
        mov dl,'d'
        mov ah,02
        int 21h
        mov dl,'e'
        mov ah,02
        int 21h
        mov dl,'f'
        mov ah,02
        int 21h
        mov dl,'g'
        mov ah,02
        int 21h
        mov dl,'h'
        mov ah,02
        int 21h
        mov dl,'i'
        mov ah,02
        int 21h
        mov dl,'j'
        mov ah,02
        int 21h
        mov dl,'k'
        mov ah,02
        int 21h
        mov dl,'l'
        mov ah,02
        int 21h
        mov dl,'m'
        mov ah,02
        int 21h
        mov dl,'n'
        mov ah,02
        int 21h
        mov dl,'o'
        mov ah,02
        int 21h
        mov dl,'p'
        mov ah,02
        int 21h
        mov dl,'q'
        mov ah,02
        int 21h
        mov dl,'r'
        mov ah,02
        int 21h
        mov dl,'s'
        mov ah,02
        int 21h
        mov dl,'t'
        mov ah,02
        int 21h
        mov dl,'u'
        mov ah,02
        int 21h
        mov dl,'v'
        mov ah,02
        int 21h
        mov dl,'w'
        mov ah,02
        int 21h
        mov dl,'x'
        mov ah,02
        int 21h
        mov dl,'y'
        mov ah,02
        int 21h
        mov dl,'z'
        mov ah,02
        int 21h
        
fine:
        mov ah,4ch
        int 21h
        END





