#include<iostream>
using namespace std;
struct emp
{
  int eid,age,sal;
  char name[20],des[20];
};
int main()
{
  //Type your code here.
  int i;
  struct emp e;
  cout<<"Enter name:";
  cin>>e.name;
  cout<<"\nEnter ID:";
  cin>>e.eid;
  cout<<"\nEnter age:";
  cin>>e.age;
  cout<<"\nEnter designation:";
  cin>>e.des;
  cout<<"\nEnter Salary:";
  cin>>e.sal;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.eid;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.des;
  cout<<"\nSalary of the Employee : "<<e.sal;
}