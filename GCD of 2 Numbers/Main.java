#include<iostream>
using namespace std;
int gcd(int,int);
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}
int gcd(int a,int b)
{
  while (a != b)
    {
        if (a > b)
        {
            return gcd(a - b, b);
        }
        else
        {
            return gcd(a, b - a);
        }
    }
    return a;
}