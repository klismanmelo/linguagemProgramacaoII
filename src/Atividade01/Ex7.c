#include<stdio.h>
#include<stdlib.h>

main(){
    int i, n = 10, v[n], status;
    int numero;

    for(i=0;i<n;i++) {
        v[i] = rand() % 99;
    }
    scanf("%d", &numero);

    for(i=0;i<n;i++) {
        if(v[i] == numero){
            printf("\n%d", i);
            status = 1;
        }
    }
    if(status != 1){
        printf("O número fornecido não existe no vetor!");
    }
}
