#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,i,j,k,r;
  cin>>n;
  while(n>0)
  {
    k=n%10;
    r=r*10+k;
    n=n/10;
  }
  cout<<r;
	return 0;
}