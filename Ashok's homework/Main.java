#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,i,j,a[10][10],b[10][10],s[10][10];
  cin>>r>>c;
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      s[i][j]=a[i][j]+b[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cout<<s[i][j]<<" ";
    }
     cout<<"\n";
  }
  
}