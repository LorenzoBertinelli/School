                        ACAPO   MACRO
                                MOV DL,10
                                MOV AH,02
                                INT 21H
                                MOV DL,13
                                INT 21H
                                ENDM

                                DOSSEG
                                .MODEL SMALL
                                .STACK
                                .DATA

N       DB 0

                                .CODE
                        INIZIO:
                                MOV AX,@DATA
                                MOV DS,AX

                                MOV AH,01
                                INT 21H

                                SUB AL,48
                                MOV BL,AL
                                MOV N,AL
                                ACAPO

                        SALTA:
                                MOV CH,0
                                MOV CL,N
                                MOV DL,'*'
                                MOV AH,02

                        CICLO:
                                INT 21H
                                LOOP CICLO
                                ACAPO
                                DEC BL
                                CMP BL,0
                                JNE SALTA

                                MOV AH,4CH
                                INT 21H
                                END
