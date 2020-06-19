#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,a[10][10],m=0,i,j;
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
      if(a[i][j]>m)
        m=a[i][j];
      else
        m=m;
    }
  } 
  cout<<"The maximum element is "<<m;
}