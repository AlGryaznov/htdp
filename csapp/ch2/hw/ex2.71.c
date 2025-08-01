#include <stdio.h>
#include <limits.h>

typedef unsigned packed_t;


unsigned xbyte(packed_t word, int n) {

    int shift = 24 - (n << 3); 

    return (word << shift) >> 24;
}

/* 
 * This code doesn't fill higher bits of value with sign
 * 
 * int xbyte(packed_t word, int bytenum)
{
    return (word >> (bytenum << 3)) & 0xFF;
}
*/

int main(int argc, char* argv[]) 
{
    printf("0x%08x\n", xbyte(0x12345678, 0));
    printf("0x%08x\n", xbyte(0x12345678, 1));
    printf("0x%08x\n", xbyte(0x12345678, 2));
    printf("0x%08x\n", xbyte(0x12345678, 3));

    printf("0x%08x\n", xbyte(0xA1B2C3D4, 0));
    printf("0x%08x\n", xbyte(0xA1B2C3D4, 1));
    printf("0x%08x\n", xbyte(0xA1B2C3D4, 2));
    printf("0x%08x\n", xbyte(0xA1B2C3D4, 3));

    return 0;
}
