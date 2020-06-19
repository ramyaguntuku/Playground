#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,k,n,sum=0;
  cin>>x;
  n=x;
  while(x>0)
  {
    k=x%10;
    sum=sum+k;
    x=x/10;
  }
  if(n%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
    cout<<"Not Harshad Number";
}