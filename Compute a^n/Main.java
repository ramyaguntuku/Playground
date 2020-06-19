#include<iostream>
using namespace std;
int power(int,int);
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}
int power(int a,int n)
{
  if(n!=0)
  {
    return (a*power(a,n-1));
  }
  else
  return 1;
}