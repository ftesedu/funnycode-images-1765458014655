#include <stdio.h>

int main() {
    long long N;
    long long count = 0;
    scanf("%lld", &N);
    for (long long i = 1; i * i <= N; i++) {
        if (N % i == 0) {
            if (i * i == N)
                count++;  
            else
                count += 2; 
        }
    }
    printf("%lld", count);
    return 0;
}
