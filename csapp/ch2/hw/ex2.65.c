#include <stdio.h>
#include <limits.h>

int odd_ones_v1(unsigned x)
{
    x = (x >> 16) ^ (x & 0xFFFF);
    x = (x >> 8) ^ (x & 0xFF);
    x = (x >> 4) ^ (x & 0xF);
    x = (x >> 2) ^ (x & 0x3);
    x = (x >> 1) ^ (x & 0x1);

    return x;
}

int odd_ones_v2(unsigned x)
{
    x = (x >> 16) ^ x;
    x = (x >> 8) ^ x;
    x = (x >> 4) ^ x;
    x = (x >> 2) ^ x;
    x = (x >> 1) ^ x;

    return x & 0x1;
}

int odd_ones(unsigned x)
{
    return odd_ones_v2(x);
}
int main(int argc, char* argv[]) 
{
    int x = 0xffffffff;
    printf("odd_ones(0x%08x) = %d)\n", x, odd_ones(x));

    x = 0xfffffffe;
    printf("odd_ones(0x%08x) = %d)\n", x, odd_ones(x));

    x = INT_MIN;
    printf("odd_ones(0x%08x) = %d)\n", x, odd_ones(x));

    x = INT_MIN + 1;
    printf("odd_ones(0x%08x) = %d)\n", x, odd_ones(x));


    return 0;
}
