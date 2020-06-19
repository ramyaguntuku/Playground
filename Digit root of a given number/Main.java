#include<iostream>
using namespace std;
int fun(int);
int main()
{
  int n;
  cin>>n;
  cout<<fun(n);
}
int fun(int n)
{
  int k,s=0;
  k=n;
  while(n>0)
  {
    k=n%10;
    s=s+k;
    n=n/10;
  }
  if(s<=9)
    return s;
  else
    return fun(s);
}
    