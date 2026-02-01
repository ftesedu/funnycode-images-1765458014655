#include <stdio.h>
void swap (float *a,float *b){
    float temp;
    temp = *a;
    *a = *b;
    *b = temp;
}
int main (){
    float a , b;
    scanf ("%f%f",&a,&b);
    swap (&a,&b);
    printf ("%.2f %.2f",a,b);
    return 0;
}