#include <iostream>
#include<string>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  student s1;
  string x=s1.name;
  int y=s1.roll;
  float z=s1.marks;
  getline(cin,x);
  cin>>y;
  cin>>z;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<x;
  cout<<"\nRoll: "<<y;
  cout<<"\nMarks: "<<z;
  
}