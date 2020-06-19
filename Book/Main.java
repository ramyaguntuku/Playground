#include<iostream>
using namespace std;
union book
{
  char name[10];
  int price;
}s;
int main()
{
  //Type your code here.
  cout<<"Enter the Book details";
  cout<<"\nEnter the Book name";
  cin>>s.name;
  cout<<"\nEnter the Book price";
  cin>>s.price;
  cout<<"\nBook Details\n";
  cout<<s.name<<" "<<s.price;
  cout<<"\nEnter the Book name";
  cin>>s.name;
  cout<<"\nBook Name : "<<s.name;
}