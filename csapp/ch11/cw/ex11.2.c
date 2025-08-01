#include <stdio.h>
#include <stdlib.h>
#include <arpa/inet.h>

int main(int argc, char* argv[]) 
{
    struct in_addr in_addr;

    if (argc >= 2) {

            if (inet_pton(AF_INET, argv[1], &in_addr) == -1)
            {
                    perror("inet_pton");
                    exit(EXIT_FAILURE);
            }

            printf("0x%08x\n", ntohl(in_addr.s_addr));
    }

    exit(EXIT_SUCCESS);
}
