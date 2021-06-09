#include<stdio.h>
#include<stdlib.h>


main() {
    int i, n = 10;
    int v1[n], v2[n], vr[n];

    for (i = 0; i<n; i++) {
        scanf("%d", &v1[i]);
    }
    for (i = 0; i<n; i++) {
        scanf("%d", &v2[i]);
    }

    for (i = 0; i < n; i++) {
        vr[i] = v1[i] * v2[i];
    }

    for (i = 0; i < n; i++) {
        printf("\n%d", vr[i]);
    }

}
