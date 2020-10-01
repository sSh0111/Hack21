#include<iostream>
using namespace std;

int main()
{
    int n, i, j, x, sumL = 0, sumR = 0, k, test, h;    
    cin>>test;

    for(h = 0 ; h < test ; h++)
    {
        cin>>n;
        int arr[n];
        
        for(i = 0 ; i < n ; i++)
        {
            cin>>x;
            arr[i] = x;
        }
        
        for(k = 1 ; k < (n - 1) ; k++)
        {
            sumL = 0, sumR = 0;
            for(i = 0 ; i < k ; i++)
            {
                sumL += arr[i];
            }
            
            for(j = (k + 1) ; j < n ; j++)
            {
                sumR += arr[j];
            }
            
            if(sumL == sumR)
            {
                cout<<"YES"<<endl;
                break;
            }
            else
            cout<<"NO"<<endl;
        }
    }
    return 0;
}
