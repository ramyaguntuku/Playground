#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(a>=b)
  {
    std::cout<<"Yes, you can enter.";
  if(a==b)
    std::cout<<" Kindly use a rope.";
  }
  else
    std::cout<<"Sorry, you can't enter";
}
  