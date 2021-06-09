#include<stdio.h>
#include<stdlib.h>

main() {

    int i, vr[6],
        v1[6], n1,
        v2[6], n2,
        v3[6], n3;

    for(i=0;i<6;i++) {
        vr[i] = rand() % 99;
        printf("\n%d", vr[i]);
    }

    for(i=0;i<6;i++) {
        scanf("%d", &v1[i]);
    }
    for(i=0;i<6;i++) {
        if(vr[i] == v1[i]){
            n1++;
        }
    }

    printf("\n%d", n1);

}
