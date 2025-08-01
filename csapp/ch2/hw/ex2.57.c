#include <stdio.h>
#include "lib/show_bytes.h"


void show_short(short x) 
{
    show_bytes((byte_pointer)&x, sizeof(x));
}

void show_long(long x) 
{
    show_bytes((byte_pointer)&x, sizeof(x));
}

void show_double(double x) 
{
    show_bytes((byte_pointer)&x, sizeof(x));
}

int main(int argc, char* argv[]) 
{

    int s = -1;
    int i = -1;
    int l = -1;
    int d = -1;
    
    show_short(s);
    show_int(i);
    show_long(l);
    show_double(d);

    return 0;
}
