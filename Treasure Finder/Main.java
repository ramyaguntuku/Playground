#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,x,y,i,m;
  cin>>a>>b>>c;
  m=a*b*c;
  if(a>b && a>c)
  {
    if(b>c)
    {
      x=b;
    }
    else
      x=c;
  }
  else if(b>c)
  {
    if(a>c)
      x=a;
    else
      x=c;
  }
  else
  {
    if(b>a)
      x=b;
    else
      x=a;
  }
  cout<<"The treasure is in box which has number "<<x<<"\n";
  for(i=2;i<=m;i++)
 {
  if(a%i==0 && b%i==0 && c%i==0)
  {
   y=i;
   break;
  }
    else
      y=1;
 }
  cout<<"The code to open the box is "<<y;
}