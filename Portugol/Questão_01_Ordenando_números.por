programa
{
	
	funcao inicio()
	{
		inteiro vetor[10]= {2,5,1,3,4,9,7,8,10,6}, i, j, l=1
			//ordenando os números para aparecer na tela
			escreva("Vetor entrada desordenada: ")
			para(i=0; i<10; i++){
				escreva(vetor[i], ",")
			}
			escreva("\n")
			enquanto(l==1) {
				l=0
				para(i=0; i< 10-1; i++){
				se(vetor[i] > vetor[i+1]){
					j = vetor[i]
					vetor[i] = vetor[i+1]
					vetor[i+1] = j
					l=1
				}
			}
		}
			//ordem crescente oculta da tela
			para(i=0; i<10; i++){
				escreva("")
			}
			
			escreva("\n Vetor saída ordenada decrescente: ")
			para(i=10; i>=0 ; i--) {
			escreva(i+",")
			
			}
	//Prof. ainda não aprendi como não escrever a vírgula até o penúltimo número. 
	//Prometo me esforçar mais, quase chorei nessa questão ='(		
				
		}
			
}
				


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */