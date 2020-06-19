#include<iostream>
using namespace std;
int main()
{
  int s,e,sum,i,j;
  cin>>s>>e;
  for(i=s;i<=e;i++)
  {
    sum=0;
    for(j=1;j<i;j++)
    {
      if(i%j==0)
      {
        sum=sum+j;
      }
    }
    if(sum==i)
      cout<<i<<" ";
  }
}
      