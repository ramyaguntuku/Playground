#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,p;
  cin>>n;
  p=n;
  while(p>4)
  {
  a=sqrt(p);
  n=n+a;
  p=a;
  }
  cout<<n+1;
  return 0;
}