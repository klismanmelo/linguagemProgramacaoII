#include<stdio.h>
#include<stdlib.h>

main() {
    int i,
        n=10,
        menor,
        posicao = 0;

    int v[n];

    for(i=0;i<n;i++) {
        scanf("%d", &v[i]);
    }

    menor = v[0];

    for(i=0;i<n;i++) {
        if(menor > v[i]){
            menor = v[i];
            posicao = i;
        }
    }

    printf("Menor valor = %d \nposicao = %d", menor,posicao);

}
