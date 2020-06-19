#include<iostream>
#include<string>
using namespace std;
class Person
{
	string Fname,Lname;
    int age;
    public:
  void setFirstname(string Fname)
  {
    this->Fname=Fname;
  }
  void setLastname(string Lname)
  {
    this->Lname=Lname;
  }
  void setAge(int age)
  {
    if(age<=0||age>100)
    {
    this->age=0;
    }
    else
    {
      this->age=age;
    }
  }
  string getFirstname()
  {
    return Fname;
  }
  string getLastname()
  {
    return Lname;
  }
  int getAge()
  {
    return age;
  }
  int isTeen()
  {
    if(age>12 && age<20)
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
 string getFullname()
 {
   char c=' ';
   return (Fname+c+Lname); 
 }
};
int main()
{
  Person p;
  string Fname,Lname;
  int age;
  cin>>Fname>>Lname>>age;
  p.setFirstname(Fname);
  p.setLastname(Lname);
  p.setAge(age);
  cout<<"First Name: "<<p.getLastname()<<"\n";
  cout<<"Last Name: "<<p.getFirstname()<<"\n";
  cout<<"Age: "<<p.getAge()<<"\n";
  cout<<"Full Name: "<<p.getFullname();
  p.isTeen()?cout<<"\nisTeen: True":cout<<"\nis Teen: False";
}