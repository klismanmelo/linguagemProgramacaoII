#include<stdio.h>
#include<stdlib.h>

main() {
    int i, n=6, troca = 0, p;
    int v[n];

    for(i=0;i<n;i++) {
        scanf("%d", &v[i]);
    }



    for (i=0;i<3;i++){
        p = n-i;
        troca = v[i];
        v[i] = v[p];
        v[p] = troca;
    }

    for (i=0;i<n;i++) {
        printf("\n%d", v[i]);
    }

}
