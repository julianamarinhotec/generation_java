programa
{
	
	funcao inicio()
	{
		inteiro vetor[]= {2,5,1,3,4,9,7,8,10,6}, i , par=0, impar=0, soma=0, media
	
	         	//vetor na tela entrada
			escreva("Vetor entrada: ")
			para(i=0; i<10; i++){
				 escreva(vetor[i], ",")
	      }
               escreva("\n")
         			
			para(i=0; i<10; i++){
                  se(vetor[i]% 2 ==0){
				escreva("Números pares: \n")
				escreva(vetor[i],"\n")
			
			}senao{
				escreva("Números ímpares: \n")
				escreva(vetor[i],"\n")
			}
		}

	          	para(i=0; i<10; i++){
	          		soma += vetor[i]
	          	}
			media = soma/10
			
			
			//saída na tela
							
				escreva("\n Números Ímpares: ", impar)
				escreva("\n Números Pares: ", par)
				escreva("\n Soma dos números: ", soma)
				escreva("\n Média dos números: ", media)

//Prof. não consegui colocar os números pares juntos na mesma linha e os ímpares também.

	}
               
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 986; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */