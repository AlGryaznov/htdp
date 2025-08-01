#include <stdio.h>
#include <limits.h>

unsigned fits_bits(int x, int n) {

    int w = sizeof(int) << 3;

    n = n - 1;

    return 0x1 & (x >> n);
}

int main(int argc, char* argv[]) 
{
    printf("0x%08x\n", fits_bits(0, 1));
    printf("0x%08x\n", fits_bits(1, 1));
    printf("0x%08x\n", fits_bits(1, 2));
    printf("0x%08x\n", fits_bits(2, 2));
    printf("0x%08x\n", fits_bits(3, 2));
    printf("0x%08x\n", fits_bits(7, 3));
    printf("0x%08x\n", fits_bits(7, 4));
    printf("0x%08x\n", fits_bits(8, 4));

    return 0;
}
