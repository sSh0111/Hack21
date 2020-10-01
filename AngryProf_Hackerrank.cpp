#include<iostream>
using namespace std;

int main()
{
    int test, n, k, i, j, x, c = 0;
    cin>>test;
    
    for(i = 0 ; i < test ; i++)
    {
        cin>>n>>k;
        int arr[n];
        c = 0;
        
        for(j = 0 ; j < n ; j++)
        {
            cin>>x;
            arr[i] = x;
        }

        for(j = 0 ; j < n ; j++)
        {
            if(arr[j] <= 0)
            c++;
        }
        
        cout<<endl<<endl<<c<<endl<<endl;

        if(c <= k)
        cout<<"NO"<<endl;
        else
        cout<<"YES"<<endl;
        
        c = 0;
    }

    return 0;
}
