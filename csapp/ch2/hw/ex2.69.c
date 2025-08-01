#include <stdio.h>
#include <limits.h>

unsigned rotate_left(unsigned x, int n) {
   
    int mask = !n - 1;
    unsigned high = x >> (((sizeof(int) << 3) & mask) - n); 
    x = x << n; 

    return high | x;
}

int main(int argc, char* argv[]) 
{
    printf("0x%08x\n", rotate_left(0x12345678, 0));
    printf("0x%08x\n", rotate_left(0x12345678, 1));
    printf("0x%08x\n", rotate_left(0x12345678, 4));
    printf("0x%08x\n", rotate_left(0x12345678, 5));
    printf("0x%08x\n", rotate_left(0x12345678, 8));
    printf("0x%08x\n", rotate_left(0x12345678, 28));
    printf("0x%08x\n", rotate_left(0x12345678, 31));

    return 0;
}
