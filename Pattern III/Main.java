#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i,j,x=0,c=1;
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<2*n-1;j++)
    {
      if(j>=i*2+1)
        cout<<" ";
      else if((j+1)%2==0)
        cout<<"*";
      else
        cout<<i+1;
    }
    cout<<"\n";
  }
  for(i=n;i>0;i--)
  {
    for(j=0;j<2*n-1;j++)
    {
      if(j>=2*i-1)
        cout<<" ";
      else if(j%2!=0)
        cout<<"*";
      else
        cout<<i;
    }
    cout<<"\n";
  }
}