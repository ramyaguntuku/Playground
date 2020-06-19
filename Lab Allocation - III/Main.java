
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int l1,l2,l3,n,c=0;
  cin>>l1>>l2>>l3>>n;
  if(n<=l1)
    c++;
  if(n<=l2)
    c++;
  if(n<=l3)
    c++;
  cout<<c;
    
}