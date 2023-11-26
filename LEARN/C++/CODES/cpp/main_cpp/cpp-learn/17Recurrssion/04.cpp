// you have been given a number of stairs,initally u r at 0th stair u need to reach nth stair,each time u an either climb one step
//or 2 steps,u r supposed to return the numbeer of distinct ways in which u can climb from 0th step to nth step

//  here in this types u no need to understand how recurrsion is working ,just form the base condition ,and recurrsive condition,and leave everything to computer

// C++ program to count number of
// ways to reach Nth stair
#include <bits/stdc++.h>
using namespace std;

// A simple recursive program to
// find N'th fibonacci number
int fib(int n)
{
	if (n <= 1)
		return n;
	return fib(n - 1) + fib(n - 2);
}

// Returns number of ways to
// reach s'th stair
int countWays(int s)
{
	return fib(s + 1); //accoding to pattern for no of ways to climb nth stait ,it is equal to fib(n+1)
}

// Driver C
int main()
{
	int s = 4;

	cout << "Number of ways = " << countWays(s);

	return 0;
}

/*Input: N = 4 Recurrsion tree for fibo series

                  fib(5)
           '3'  /        \   '2'
               /          \
           fib(4)         fib(3)
     '2'  /      \ '1'   /      \  
         /        \     /        \ 
     fib(3)     fib(2)fib(2)      fib(1) 
     /    \ '1' /   \ '0'
'1' /   '1'\   /     \ 
   /        \ fib(1) fib(0) 
fib(2)     fib(1)
*/
