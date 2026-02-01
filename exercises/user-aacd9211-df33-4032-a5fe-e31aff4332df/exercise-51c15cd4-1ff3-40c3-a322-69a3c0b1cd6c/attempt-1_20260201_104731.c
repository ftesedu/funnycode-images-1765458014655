#include <stdio.h>

void swap(double *a, double *b){
    double temp = *a;
    *a = *b;
    *b = temp;
}

int main(){
    double x, y;
    scanf("%lf %lf", &x, &y);

    swap(&x, &y);

    printf("%.2lf %.2lf", x, y);
    return 0;
}
