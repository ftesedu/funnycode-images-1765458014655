#include <stdio.h>
int main() {
    int n;
    double S = 0.0;
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        S = S + 1.0 / i; 
    }
    printf("%.3f", S);  
    return 0;
}