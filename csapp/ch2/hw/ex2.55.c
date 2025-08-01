#include <stdio.h>
#include "lib/show_bytes.h"

int main(int argc, char* argv[]) 
{
    int i = 0x12345678;
    
    show_bytes((byte_pointer)&i, sizeof(i));

    return 0;
}
