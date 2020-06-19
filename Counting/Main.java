#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string line;
  int i,v=0,c=0,w=0,d=0,s1=0,l;
 getline(cin,line);
  l=line.length();
  for(i=0;i<l;i++)
  {
  if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U') 
  ++v;
    else if((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) 
      ++c;
    else if(line[i]>='0' && line[i]<='9')
      ++d;
    else if(line[i]==' ')
      ++w;
    else
      ++s1;
  }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<w<<"\nDigits:"<<d<<"\nSymbols:"<<s1;
}