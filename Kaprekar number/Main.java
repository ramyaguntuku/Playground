#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,k,c=0,x,i,j,r,p,a;
  cin>>n;
  k=pow(n,2);
  a=k;
  while(k>0)
  {
    x=k%10;
    k=k/10;
    c++;
  }
  if(c%2==0)
  {
    c=c/2;
    p=pow(10,c);
    i=a/p;
    j=a%p;
  }
  else
  {
    c=c/2;
    p=pow(10,c+1);
    i=a/p;
    j=a%p;
  }
  r=i+j;
  if(r==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  
}