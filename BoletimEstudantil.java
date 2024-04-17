package com.mycompany.boletimestudantil;

import java.util.Scanner;

public class BoletimEstudantil 
{

    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner (System.in);
        int mediaFinal = 0;
        
            System.out.println("Digite a media");
            
        mediaFinal = leitor.nextInt();
            
        if (mediaFinal < 6)
        {
            System.out.println("REPROVADO");
        }
        else if (mediaFinal ==6)
        {
            System.out.println("PROVA MINERVA");
        }
        else 
        {
            System.out.println("APROVADO");
        }
    }
}
