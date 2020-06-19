#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i,j,x=0;
  cin>>n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<4;j++)
    {
      if(j>i)
        cout<<" ";
      else
        cout<<n+i;
    }
    cout<<"\n";
  }
  for(i=3;i>=0;i--)
  {
    for(j=0;j<4;j++)
    {
      if(j>i)
        cout<<" ";
      else
        cout<<n+i;
    }
    cout<<"\n";
  }
}