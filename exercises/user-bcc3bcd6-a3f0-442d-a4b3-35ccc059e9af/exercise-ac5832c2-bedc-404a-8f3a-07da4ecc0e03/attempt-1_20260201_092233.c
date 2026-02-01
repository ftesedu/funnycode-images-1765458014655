#include <stdio.h>
int isPalindrome(int n) {
    int rev = 0, tmp = n;
    while (tmp > 0) {
        rev = rev * 10 + tmp % 10;
        tmp /= 10;
    }
    return rev == n;
}
int hasDigit6(int n) {
    while (n > 0) {
        if (n % 10 == 6)
            return 1;
        n /= 10;
    }
    return 0;
}
int sumDigitEnd8(int n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum % 10 == 8;
}
int main() {
    int a, b;
    scanf("%d %d", &a, &b);

    for (int i = a; i <= b; i++) {
        if (isPalindrome(i) && hasDigit6(i) && sumDigitEnd8(i)) {
            printf("%d ", i);
        }
    }
    return 0;
}
