# Sequence
Program  analyzes numbers from a given interval. The analyzed numbers will not always be binary. Instead, the program shall analyze the sequences of numbers written in different bases.

An instance of the problem is defined by the radix , a lower boundary , and an upper boundary . Assume all integers from the interval low - high  written as radix numbers. The numbers form a sequence of digits. The program shall:

    compute the overall length of the sequence (i.e., the total number of digits),
    compute the number of zeros in the sequence, or
    compute the longest contiguous run of zeros in the sequence.

Sample program runs:

4 10 20 1
Digits : 27

4 10 20 2
Zeros : 7

4 10 20 3
Zeros in a row : 2
