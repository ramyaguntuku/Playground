#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i,j,sum=0;
  cin>>a>>b;
  c=a+b;
  for(i=1;i<c;i++)
  {
    if(c%i==0)
    {
      sum=sum+i;
    }
  }
  if(sum==c)
  {
    cout<<"They can read the message";
  }
  else
    cout<<"They can't read the message";
}