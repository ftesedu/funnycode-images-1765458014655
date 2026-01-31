#include <stdio.h>

int main() {
    int n;
    double S = 0.0;
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        S += 1.0 / i;
    }
    printf("%.3lf", S);
    return 0;
}
