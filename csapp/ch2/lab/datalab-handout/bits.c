/* 
 * CS:APP Data Lab 
 * 
 * <Please put your name and userid here>
 * 
 * bits.c - Source file with your solutions to the Lab.
 *          This is the file you will hand in to your instructor.
 *
 * WARNING: Do not include the <stdio.h> header; it confuses the dlc
 * compiler. You can still use printf for debugging without including
 * <stdio.h>, although you might get a compiler warning. In general,
 * it's not good practice to ignore compiler warnings, but in this
 * case it's OK.  
 */

#if 0
/*
 * Instructions to Students:
 *
 * STEP 1: Read the following instructions carefully.
 */

You will provide your solution to the Data Lab by
editing the collection of functions in this source file.

INTEGER CODING RULES:
 
  Replace the "return" statement in each function with one
  or more lines of C code that implements the function. Your code 
  must conform to the following style:
 
  int Funct(arg1, arg2, ...) {
      /* brief description of how your implementation works */
      int var1 = Expr1;
      ...
      int varM = ExprM;

      varJ = ExprJ;
      ...
      varN = ExprN;
      return ExprR;
  }

  Each "Expr" is an expression using ONLY the following:
  1. Integer constants 0 through 255 (0xFF), inclusive. You are
      not allowed to use big constants such as 0xffffffff.
  2. Function arguments and local variables (no global variables).
  3. Unary integer operations ! ~
  4. Binary integer operations & ^ | + << >>
    
  Some of the problems restrict the set of allowed operators even further.
  Each "Expr" may consist of multiple operators. You are not restricted to
  one operator per line.

  You are expressly forbidden to:
  1. Use any control constructs such as if, do, while, for, switch, etc.
  2. Define or use any macros.
  3. Define any additional functions in this file.
  4. Call any functions.
  5. Use any other operations, such as &&, ||, -, or ?:
  6. Use any form of casting.
  7. Use any data type other than int.  This implies that you
     cannot use arrays, structs, or unions.

 
  You may assume that your machine:
  1. Uses 2s complement, 32-bit representations of integers.
  2. Performs right shifts arithmetically.
  3. Has unpredictable behavior when shifting if the shift amount
     is less than 0 or greater than 31.


EXAMPLES OF ACCEPTABLE CODING STYLE:
  /*
   * pow2plus1 - returns 2^x + 1, where 0 <= x <= 31
   */
  int pow2plus1(int x) {
     /* exploit ability of shifts to compute powers of 2 */
     return (1 << x) + 1;
  }

  /*
   * pow2plus4 - returns 2^x + 4, where 0 <= x <= 31
   */
  int pow2plus4(int x) {
     /* exploit ability of shifts to compute powers of 2 */
     int result = (1 << x);
     result += 4;
     return result;
  }

FLOATING POINT CODING RULES

For the problems that require you to implement floating-point operations,
the coding rules are less strict.  You are allowed to use looping and
conditional control.  You are allowed to use both ints and unsigneds.
You can use arbitrary integer and unsigned constants. You can use any arithmetic,
logical, or comparison operations on int or unsigned data.

You are expressly forbidden to:
  1. Define or use any macros.
  2. Define any additional functions in this file.
  3. Call any functions.
  4. Use any form of casting.
  5. Use any data type other than int or unsigned.  This means that you
     cannot use arrays, structs, or unions.
  6. Use any floating point data types, operations, or constants.


NOTES:
  1. Use the dlc (data lab checker) compiler (described in the handout) to 
     check the legality of your solutions.
  2. Each function has a maximum number of operations (integer, logical,
     or comparison) that you are allowed to use for your implementation
     of the function.  The max operator count is checked by dlc.
     Note that assignment ('=') is not counted; you may use as many of
     these as you want without penalty.
  3. Use the btest test harness to check your functions for correctness.
  4. Use the BDD checker to formally verify your functions
  5. The maximum number of ops for each function is given in the
     header comment for each function. If there are any inconsistencies 
     between the maximum ops in the writeup and in this file, consider
     this file the authoritative source.

/*
 * STEP 2: Modify the following functions according the coding rules.
 * 
 *   IMPORTANT. TO AVOID GRADING SURPRISES:
 *   1. Use the dlc compiler to check that your solutions conform
 *      to the coding rules.
 *   2. Use the BDD checker to formally verify that your solutions produce 
 *      the correct answers.
 */


#endif
//1
/* 
 * bitXor - x^y using only ~ and & 
 *   Example: bitXor(4, 5) = 1
 *   Legal ops: ~ &
 *   Max ops: 14
 *   Rating: 1
 */
int bitXor(int x, int y) {

    /* v1 8-ops
     * return ~(~(~x & y) & ~(x & ~y));
    */ 

    /* v2 7-ops */
    return ~(x & y) & (~(~x & ~y));
}
/* 
 * tmin - return minimum two's complement integer 
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 4
 *   Rating: 1
 */
int tmin(void) {
        
    return 1 << 31;
}
//2
/*
 * isTmax - returns 1 if x is the maximum, two's complement number,
 *     and 0 otherwise 
 *   Legal ops: ! ~ & ^ | +
 *   Max ops: 10
 *   Rating: 1
 */
int isTmax(int x) {
    
    int xp1 = x + 1; 
    int is_xp1_zero = !xp1;

    return !(xp1 + xp1 + is_xp1_zero); 
}
/* 
 * allOddBits - return 1 if all odd-numbered bits in word set to 1
 *   where bits are numbered from 0 (least significant) to 31 (most significant)
 *   Examples allOddBits(0xFFFFFFFD) = 0, allOddBits(0xAAAAAAAA) = 1
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 12
 *   Rating: 2
 */
int allOddBits(int x) {
    /* Ver 1 - 12 op
    int nx = ~x;

    return !(((nx >> 24) & 0xAA)
            | ((nx >> 16) & 0xAA)
            | ((nx >> 8) & 0xAA)
            | (nx & 0xAA));
    */


    /* Ver 2.0 - 9 op 
    int mask = 0xAA;

    return !((((x >> 24) & (x >> 16) & (x >> 8) & x) & mask) ^ mask);
    */

    /* Ver 2.1 - 7 op */
    int mask = 0xAA;
    x &= x >> 16;
    x &= x >> 8;

    return !((x & mask) ^ mask);
}
/* 
 * negate - return -x 
 *   Example: negate(1) = -1.
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 5
 *   Rating: 2
 */
int negate(int x) {

    return ~x + 1;
}
//3
/* 
 * isAsciiDigit - return 1 if 0x30 <= x <= 0x39 (ASCII codes for characters '0' to '9')
 *   Example: isAsciiDigit(0x35) = 1.
 *            isAsciiDigit(0x3a) = 0.
 *            isAsciiDigit(0x05) = 0.
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 15
 *   Rating: 3
 */
int isAsciiDigit(int x) {

    /* Ver 1 - 14 op 
    int col = x & ~(0xf);
    int row = x & 0xf;

    return ( ! (0x30 ^ col)) 
           & (!(row & 8) 
              | !(row ^ 8) 
              | !(row ^ 9)); */


    /* Ver 2.0 - 11 op 
    int sx1, sx2;
    int upper = ~0xA + 1;
    int lower = ~0x30 + 1;

    x = (x + lower); 
    sx1 = x >> 31;
    sx2 = (x + upper) >> 31;

    return (~sx1 & sx2) & 0x1;
    */ 

    /* Ver 2.1 - 10 op */
    int sx1, sx2;
    int upper = ~0x3A + 1;
    int lower = upper + 0xA;

    sx1 = (x + lower) >> 31;
    sx2 = (x + upper) >> 31;

    return (~sx1 & sx2) & 0x1;
    

    /* Ver 3 - 7 op, idea not mine 
    return ((0x1F << 24) >> (0x1F & (x >> 1))) & !(x >> 6);
    */
}
/* 
 * conditional - same as x ? y : z 
 *   Example: conditional(2,4,5) = 4
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 16
 *   Rating: 3
 */
int conditional(int x, int y, int z) {

    /* Ver 1.0 - 7 op */
    int mask = (!x + ~0);
    return (mask & y) | (~mask & z);

    /* Ver 2 - 7 op 
    int mask = (!x + ~0);
    return (mask & ~y) ^ (mask | z);
    */ 

    /* Ver 3 - 6 op (not mine)  
    int mask = (!x + ~0);
    return (mask & (y ^ z)) ^ z;
    */
}
/* 
 * isLessOrEqual - if x <= y  then return 1, else return 0 
 *   Example: isLessOrEqual(4,5) = 1.
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 24
 *   Rating: 3
 */
int isLessOrEqual(int x, int y) {

    /* Ver 1 - 23 op 
    
    int min = 1 << 31;
    int signX = (x & min) >> 31;
    int signY = (y & min) >> 31;
    int isSameSign = ~(signX ^ signY);
    int diff = (x + ~y + 1) >> 31;

    return (!(x ^ y)) 
           | (0x1 & ((signX & ~signY)
                     | (isSameSign & ((~signX & diff)
                                     | (signX & diff)))));
    */
    

    /* Ver 2.0 - 13 op 
    int diff = (x + ~y); 
    int sign = diff >> 31;

    int signX = x >> 31;
    int signY = y >> 31;
    
    return (0x1 & (signX & ~signY)) | ((~(~signX & signY)) & (sign & 0x1));
    */
    
    /* Ver 3 - 7 op (Not mine)*/
    int diff = x + ~(y | ((x ^ y) >> 31)); 
    
    return 0x1 & (diff >> 31); 
}
//4
/* 
 * logicalNeg - implement the ! operator, using all of 
 *              the legal operators except !
 *   Examples: logicalNeg(3) = 0, logicalNeg(0) = 1
 *   Legal ops: ~ & ^ | + << >>
 *   Max ops: 12
 *   Rating: 4 
 */
int logicalNeg(int x) {
/*  Ver 1 - 12 op
    x = x | (x >> 16); 
    x = x | (x >> 8); 
    x = x | (x >> 4); 
    x = x | (x >> 2); 
    x = x | (x >> 1); 

    return ~x & 0x1; */

/*  Ver 2 - 10 op
    int sx = x >> 31;
    x = (~sx & (~x + 1)) | (sx & x);
    return (~(x >> 31) & 0x1);
*/

/*  Ver 3 - 8 op  */
    int nx = ~x + 1;
    int sx = nx >> 31;
    return ~(((x ^ nx) >> 31) | sx) & 0x1;

/*  Ver 4 - 8 op (Not mine, but much more cleaver one)
    x = x & (~x + 1);
    x = ~x + 1;
    x = ~x >> 31;
    return x & 0x01;
*/
}
/* howManyBits - return the minimum number of bits required to represent x 
 *            in two's complement
 *  Examples: howManyBits(12) = 5
 *            howManyBits(298) = 10
 *            howManyBits(-5) = 4
 *            howManyBits(0)  = 1
 *            howManyBits(-1) = 1
 *            howManyBits(0x80000000) = 32
 *  Legal ops: ! ~ & ^ | + << >>
 *  Max ops: 90
 *  Rating: 4
 */
int howManyBits(int x) {

    int sum, b;
    int sx = x >> 31;
    x = (~sx & x) | (sx & ~x);

    b = (!!(x >> 16)) << 4;
    x = x >> b;
    sum = b;

    b = (!!(x >> 8)) << 3;
    x = x >> b;
    sum += b;

    b = (!!(x >> 4)) << 2;
    x = x >> b;
    sum += b;

    b = (!!(x >> 2)) << 1;
    x = x >> b;
    sum += b;

    b = !!(x >> 1);
    sum += b + (x >> b) + 1;

    return sum;
}
//float
/* 
 * floatScale2 - Return bit-level equivalent of expression 2*f for
 *   floating point argument f.
 *   Both the argument and result are passed as unsigned int's, but
 *   they are to be interpreted as the bit-level representation of
 *   single-precision floating point values.
 *   When argument is NaN, return argument
 *   Legal ops: Any integer/unsigned operations incl. ||, &&. also if, while
 *   Max ops: 30
 *   Rating: 4
 */
unsigned floatScale2(unsigned uf) {

    /*  Ver 1.0 - 21 op
    unsigned smask = (1U << 31);
    unsigned fmask = (~0U) >> 9;
    unsigned emask = (~fmask) ^ smask; 
    unsigned f = uf & fmask; 
    unsigned e = uf & emask; 
    unsigned result = 0U;
    unsigned is_denorm = !e;
    
    f = (f << is_denorm) & (fmask << is_denorm); 
    e = e + ((!is_denorm) << 23);
    smask = uf & smask;

    result = e >= emask ?
            (smask | emask):
            (smask | (e + f));
    
    return (uf & emask) == emask ? 
            uf:
            result;
    */

    /*  Ver 1.1 - 14 op 
    unsigned result = 0U;
    unsigned mask = 0x7F800000U; 
    unsigned f = uf & 0x007FFFFF; 
    unsigned e = uf & mask; 
    unsigned sign = uf & 0x80000000;
    unsigned is_denorm = !e;
    
    f = f << is_denorm; 
    e = e + ((!is_denorm) << 23);

    result = e <  mask ?
            (sign | (e + f )):
            (sign | mask);
    
    return (uf & mask) != mask ? 
            result:
            uf;
*/
    /*  Ver 1.2 - 14 op */
    unsigned result = 0U;
    unsigned mask = 0x7F800000U; 
    unsigned e = uf & mask; 
    unsigned is_denorm = !e;
    unsigned f = (uf & 0x007FFFFF) << is_denorm; 
    unsigned sign = uf & 0x80000000;
    
    e = e + ((!is_denorm) << 23);

    result = e < mask ?
            (sign | (e + f)):
            (sign | mask);
    
    return (uf & mask) != mask ? 
            result:
            uf;
}
/* 
 * floatFloat2Int - Return bit-level equivalent of expression (int) f
 *   for floating point argument f.
 *   Argument is passed as unsigned int, but
 *   it is to be interpreted as the bit-level representation of a
 *   single-precision floating point value.
 *   Anything out of range (including NaN and infinity) should return
 *   0x80000000u.
 *   Legal ops: Any integer/unsigned operations incl. ||, &&. also if, while
 *   Max ops: 30
 *   Rating: 4
 */
int floatFloat2Int(unsigned uf) {

    /* Ver 1.0 - 16 
    int smask = 0x80000000; 
    int emask = 0x7F800000U; 
    unsigned  m = smask | ((uf & 0x007FFFFF) << 8); 
    int e = (uf & emask) >> 23; 
    int sign = (uf & smask) >> 31;
    unsigned result = 0;
    int is_in_range = 0;
    int is_zero = 0;

    e = (e - 159);  
    is_in_range = e >> 31; 
    e += 32;
    is_zero = e >> 31; 
    result = ~is_zero & (m >> (31 - e));
    
    result = sign? -result : result; 
    
    return is_in_range? result: smask;
*/
    /* Ver 1.1 - 18 */
    unsigned smask = 0x80000000; 
    unsigned m = smask | ((uf & 0x007FFFFF) << 8); 
    int e = (uf & 0x7F800000U) >> 23; 
    int result = 0;
    int is_in_range = 0;
    int sign = uf & smask; 

    e = (e - 159);  
    is_in_range = e >> 31; 
    e += 32;
    result = ~(e >> 31) & (m >> (31 - e));
    sign = sign >> 31;
    result = (result ^ sign) + (sign & 0x1);
    
    return is_in_range? result: smask;
}
/* 
 * floatPower2 - Return bit-level equivalent of the expression 2.0^x
 *   (2.0 raised to the power x) for any 32-bit integer x.
 *
 *   The unsigned value that is returned should have the identical bit
 *   representation as the single-precision floating-point number 2.0^x.
 *   If the result is too small to be represented as a denorm, return
 *   0. If too large, return +INF.
 * 
 *   Legal ops: Any integer/unsigned operations incl. ||, &&. Also if, while 
 *   Max ops: 30 
 *   Rating: 4
 */

unsigned floatPower2(int x) {

    /* Ver 1.0 , really bad one

    unsigned two = 0x40000000;
   
    if (x > 127)
         return 0x7f800000;

    else if (x <= -150)

         return 0x00000000;

    else if (x < -126)

         return two >> (29 - (150 + x));

    else {

         return two + ((x - 1) << 23);
    }
    */


    
}
