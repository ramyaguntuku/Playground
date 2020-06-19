#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int r,c,a[10][10],i,j,t=0;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  { t=0;
    for(j=0;j<c;j++)
  {
      t=t+a[i][j];
    }
   cout<<t<<"\n";
  }
}