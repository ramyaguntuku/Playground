#include<iostream>
using namespace std;
int fact(int);
  int main()
  {
    int x;
    cin>>x;
   
    cout<<"The factorial of "<<x<<" is "<<fact(x);
  }
int  fact(int n)
  {
  if (n>=1)
  {
    n=n*fact(n-1);
    return n;
  }
  else
    return 1;
  }