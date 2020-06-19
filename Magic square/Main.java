#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,a[5][5],i,j,s=0,s1=0;
  cin>>r;
  for(i=0;i<r;i++)
  {
    for(j=0;j<r;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    s=s+a[i][i];
  }
  for(i=0;i<r;i++)
  {
    s1=s1+a[i][r-i-1];
  }
  if(s==s1)
    cout<<"Yes";
  else
    cout<<"No";
}