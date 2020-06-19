#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,x;
   std::cin>>a;
  x=a%10;
  int d=(int)log10(a);
  a = (int)(a/ pow(10,3)); 
  std::cout<<x+a;
  //Type your code here.
}