#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string name;
  getline(std::cin,name);
  for(auto i=name.crbegin();i<name.crend();i++)
  {
    std::cout<<*i;
  }
}