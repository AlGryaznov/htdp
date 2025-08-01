#include <stdio.h>

int any_ones(int x)
{
    return !!x;
}

char any_ones_b(char x)
{
    return !!x;
}


int any_zeros(int x)
{
    return any_ones(~x);
}

char any_zeros_b(char x)
{
    return any_ones_b(~x);
}


int main(int argc, char* argv[]) 
{
    int x = 1;
    printf("1) any_ones(%d) is  %d\n", x, any_ones(x)); 
    x = -1;
    printf("1) any_ones(%d) is  %d\n", x, any_ones(x)); 
    x = 0;
    printf("1) any_ones(%d) is  %d\n", x, any_ones(x)); 


    x = -1;
    printf("2) any_zeros(%d) is  %d\n", x, any_zeros(x)); 
    x = 1;
    printf("2) any_zeros(%d) is  %d\n", x, any_zeros(x)); 
    x = 0;
    printf("2) any_zeros(%d) is  %d\n", x, any_zeros(x)); 

    x = 1;
    printf("3) any_ones_b(%d) is  %d\n", x, any_ones_b((char)x)); 
    x = -2;
    printf("3) any_ones_b(%d) is  %d\n", x, any_ones_b((char)x)); 
    x = -256;
    printf("3) any_ones_b(%d) is  %d\n", x, any_ones_b((char)x)); 
    x = 256;
    printf("3) any_ones_b(%d) is  %d\n", x, any_ones_b((char)x)); 

    x = 1;
    printf("3) any_zeros_b(%d) is  %d\n", x, any_zeros_b((char)x)); 
    x = -2;
    printf("3) any_zeros_b(%d) is  %d\n", x, any_zeros_b((char)x)); 
    x = -1;
    printf("3) any_zeros_b(%d) is  %d\n", x, any_zeros_b((char)x)); 


    return 0;
}
