#include<iostream>
using namespace std;
union emp
{
  int sal;
  char name[20];
}s;

int main()
{
  //Type your code here.
  cout<<"Enter the Employee details";
  cout<<"\nEnter the Employee name :";
  cin>>s.name;
  cout<<"\nEnter the Employee salary :";
  cin>>s.sal;
  cout<<"\nEmployee Details\n";
  cout<<s.name<<" "<<s.sal;
}