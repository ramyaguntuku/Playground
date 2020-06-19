#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,a[10][10],r1=0,r2=0,d1=0;
  cin>>r>>c;
 for(i=0;i<r;i++)
              {
                  for(j=0;j<c;j++)
                    cin>>a[i][j];
                }
                for(i=0;i<=0;i++)
                {
                  for(j=0;j<c;j++)
                    r1=r1+a[i][j];
                }
                for(i=r-1;i<r;i++)
                {
                  for(j=0;j<c;j++)
                    r2=r2+a[i][j];
                }
  for(i=0;i<r;i++)
  {
    d1=d1+a[i][r-i-1];
  }
  d1=d1-a[0][c-1]-a[r-1][0];
                cout<<"Sum of Zig-Zag pattern is "<<r1+r2+d1;
                
                
}