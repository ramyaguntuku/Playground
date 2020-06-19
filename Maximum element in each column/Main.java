#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,a[10][10],i,j,t;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<c;i++)
  { t=0;
    for(j=0;j<r;j++)
  {
    if(a[j][i]>t)
      t=a[j][i];
      else
        t=t;
    }
   cout<<t<<"\n";
  }
}