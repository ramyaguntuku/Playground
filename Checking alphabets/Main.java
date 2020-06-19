#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   char ch;
  cin>>ch;
  if((ch>='A'  && ch<='Z')||(ch>='a' && ch<='z'))
    
  {
  if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
  {
    cout<<"Vowel";
  }
  else 
  {
    cout<<"Consonant";
  }
  }
  else
  {
    cout<<"Not an alphabet";
  }
}
