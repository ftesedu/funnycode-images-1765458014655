#include <stdio.h>
int main (){
    int n;
    double tong=0;
    scanf ("%d", &n);
    if (n<=0){
        return 0;
    }
    for (int i=1;i<=n;i++){
        tong += 1.0/i;
    }
    printf("%.3lf", tong);
    return 0;
}