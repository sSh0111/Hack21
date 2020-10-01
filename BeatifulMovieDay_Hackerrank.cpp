#include<iostream>
#include<cstdlib>
using namespace std;

int reverse(int n)
{
	int d, rev = 0;
	while(n>0)
	{
		d = n % 10;
		rev = rev * 10 + d;
		n /= 10;
	}
	
	return rev;
}

int main()
{
	int i, j, k, num, l, c = 0;
	cin>>i>>j>>k;
	
	for(l = i ; l <= j ; l++)
	{
		num = reverse(l);
		if(abs(num - l) % k == 0)
		{
			c++;
		}
	}
	
	cout<<c;
	
	return 0;
}
