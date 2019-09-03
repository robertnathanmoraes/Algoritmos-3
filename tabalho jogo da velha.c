#include <stdio.h>
#include <stdlib.h>


void display(char t[3][3]){
//abre tela()

  // printf("   1   2   3   Y\n"); ??
   
   system("cls");   
   printf("\t %c | %c| %c \n",t[0][0],t[0][1],t[0][2]);
   printf("\t ---|---|--- \n ");
   printf("\t %c | %c| %c \n",t[1][0],t[1][1],t[1][2]);
   printf("\t ---|---|--- \n ");
   printf("\t %c | %c| %c \n",t[2][0],t[2][1],t[2][2]);

   printf("X\n");
//fecha tela()
}

void teste_trinca()
{//abre teste
/*-------------TESTA NA HORIZONTAL--------*/

      
/*----------TESTA NA VERTICAL--------*/

 
}//fecha teste

void play1(int x, int y)
{//abre play1
char t[3][3];
   display(t);
   printf("Jogador 1: Digite a coordenada **X**: ");
   scanf("%i",&x);
   printf("Jogador 1: Digite a coordenada **Y**: ");
   scanf("%i",&y);
}//fecha play1

void play2(int x, int y)
{//abre play2
	char t[3][3];
   display(t);      
   printf("Jogador 2: Digite a coordenada **X**: ");
   scanf("%i",&x);
   printf("Jogador 2: Digite a coordenada **Y**: ");
   scanf("%i",&y);
}//fecha play2

int main()
{//abre main()

   char tela[3][3];
   int i,j,teste,x,y,velha;

   for(i=0;i<3;i++)//for1
      for(j=0;j<3;j++)//for2
         tela[i][j]=' ';
      
      while(teste!=0)//while1
      {//abre while teste      
         
         if(teste!=0)
         {//abre if play1
                  
            play1(x, y);
            if(tela[x][y]==' ')//if menor
            {//abre if menor
               tela[x][y]='X';
               system("cls");
               velha++;
               teste_trinca(     );      
            }//fecha if menor
            else
            {
               system("cls");
               printf("Jah esta sendo usada essa posisao!!\n"); 
               printf("Pressione qualquer tecla para entrar novo valor\n");
               getch();
               system("cls");
               play1(x, y);
            }
         
         
         }//fecha if play1
         if(teste!=0)
         {//abre if play2
                     
            play2(x, y);
            if(tela[x][y]==' ')
            {
               velha++;
               tela[x][y]='O';
               system("cls");
               teste_trinca(       );   
            }
            else
            {
               system("cls");
               printf("Jah esta sendo usada essa possisao!!\n"); 
               printf("Pressione qualquer tecla para entrar novo valor\n");
               getch();
               system("cls");
               play2(x, y);
            }
         
         }//fecha if play2

        }//fecha while teste

}//fecha main()
