
 #include <stdio.h>

int main(){
    long long n;
    int dem = 0;

    scanf("%lld", &n);

    for(long long i = 1; i <= n; i++){
        if(n % i == 0)
            dem++;
    }

    printf("%d", dem);
    return 0;
}
