#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,r,c,n,x,a[100][100],x1,x2;
  x=1;x1=0;x2=0;
  cin>>r>>c>>n;
  for (i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      a[i][j]=x;
      x++;
    }
  }
  for(i=0;i<r;i++)
  {
     for(j=0;j<c;j++)
    { 
       x1++;
      if(a[0][j]==n||a[i][0]==n||a[i][c-1]==n)
      { 
        cout<<"Yes";
        x2++;
      }
       else if(x1==r*c)
       {
         cout<<"No";
     break;
       }
       if(x2==1)
         break;
     }    
  }
}