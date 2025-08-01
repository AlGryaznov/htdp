#include <stdio.h>

int int_shifts_are_arithmetic()
{
    int i = -1 ;

    return !((i >> 1) + 1);
}

int main(int argc, char* argv[]) 
{

    printf("is shifts are arithmetic - %d\n", 
            int_shifts_are_arithmetic());
    return 0;
}
