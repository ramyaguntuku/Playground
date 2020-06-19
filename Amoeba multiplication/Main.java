#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,b,c,d,i;
  cin>>n;
  a=0;
  b=1;
  d=2;
  for(i=2;i<n;i++)
  {
    c=a+b;
    a=b;b=c;
  }
  cout<<c;
}