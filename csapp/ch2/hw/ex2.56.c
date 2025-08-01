#include <stdio.h>
#include "lib/show_bytes.h"

int main(int argc, char* argv[]) 
{
    int i1 = 0x12345678;
    int i2 = -1;
    int i3 = 0;
    int i4 = 1;
    
    show_bytes((byte_pointer)&i1, sizeof(i1));
    show_bytes((byte_pointer)&i2, sizeof(i2));
    show_bytes((byte_pointer)&i3, sizeof(i3));
    show_bytes((byte_pointer)&i4, sizeof(i4));

    return 0;
}
