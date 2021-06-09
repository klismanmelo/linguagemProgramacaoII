#include<stdio.h>
#include<stdlib.h>

main() {
    int i, n=20;
    int v[n];
    for(i = 0; i<n ; i++){
        scanf("%d", &v[i]);
    }

    for(i=0; i<n; i++){
        if((v[i]%2) == 0) {
            printf("\n%d", v[i]);
        }
    }

}

