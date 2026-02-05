#include <stdio.h>

int main() {
    int num, sum = 0, temp;

    printf("Enter a number: ");
    scanf("%d", &num);

    temp = num;

    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }

    if (sum % 3 == 0)
        printf("%d is divisible by 3", num);
    else
        printf("%d is not divisible by 3", num);

    return 0;
}
