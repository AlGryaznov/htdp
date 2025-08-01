#include <stdio.h>
#include <limits.h>

#include "lib/show_bytes.h"

int int_size_is_32()
{

    long msb = 0;
    msb = (1 << 31);

    show_bytes((byte_pointer)&msb, sizeof(long));

    msb = ((msb >> 31) >> 1); 
    show_bytes((byte_pointer)&msb, sizeof(long));

    return msb & 0x1;
}

int bad_int_size_is_32()
{
    int set_msb = 1 << 31;
    int beyond_msb = 1 << 32;

    return set_msb && !beyond_msb;
}

int main(int argc, char* argv[]) 
{
    printf("int_size_is_32() = %d\n", int_size_is_32());


    return 0;
}
