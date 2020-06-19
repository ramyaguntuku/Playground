#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,k,s1=0,s2=0,c=0;
  cin>>n;
  while(n>0)
  {
    k=n%10;
    c++;
    if(c%2==0)
    {
      s1=s1+k;
    }
    else
    {
      s2=s2+k;
    }
    n=n/10;
  }
  if(s1==s2)
    cout<<"Yes";
  else
    cout<<"No";
}