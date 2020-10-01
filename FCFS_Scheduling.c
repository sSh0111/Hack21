#include <stdio.h>
//calculation of average waiting time
int waitingtime(int process[], int n, int burst_time[], int wait_time[]) {
   wait_time[0] = 0;		//initial waiting time is always zero (at the start)
   int i;
   
   for (i = 1; i < n ; i++ )
   wait_time[i] = burst_time[i-1] + wait_time[i-1] ;		//actual calculation of waiting time
   return 0;
}

//calculation of turn around time
int turnaroundtime( int process[], int n, int burst_time[], int wait_time[], int turn_around_time[]) {
   int i;
   for ( i = 0; i < n ; i++)
   turn_around_time[i] = burst_time[i] + wait_time[i];		//calculation of turn around time by 'burst_time + wait_time'
   return 0;
}

//calculation of average time
int avg_time( int process[], int n, int burst_time[]) {
   int wait_time[n], turn_around_time[n], total_wt = 0, total_tat = 0;
   int i;
   
   waitingtime(process, n, burst_time, wait_time);				//invoking function to calculate wait time for the processes
  
   turnaroundtime(process, n, burst_time, wait_time, turn_around_time);		 //invoking function to calculate turn around time for all processes
   
   printf("Processes\tBurst\t\tWaiting\t\tTurn around \n");		//displaying with all details
   
   //Calculation of total wait time and turn around time
   for ( i = 0; i < n; i++) {
      total_wt = total_wt + wait_time[i];
      total_tat = total_tat + turn_around_time[i];
      
	  printf(" %d\t\t%d\t\t%d\t\t%d\n", i+1, burst_time[i], wait_time[i], turn_around_time[i]);
   }
   printf("Average waiting time = %f\n", (float)total_wt / (float)n);
   printf("Average turn around time = %f\n", (float)total_tat / (float)n);
   
   return 0;
}

//Driver Function to control the flow of the program
int main() {
   
   int k, l = 1, cn = 0, i;
   printf("Enter the number of processes needed : ");
   scanf("%d", &k);
   
   int process[k];						//array to store process number (process id)
   int burst_time[k];					//array to store burst time of the processes
   
   for(i = 1 ; i <= k ; i++) {
   	process[i-1] = i;
   }	
   int n = sizeof process / sizeof process[0];
   
   //Entering burst time of the processes
   printf("Enter %d burst times for %d processes : \n",k, k);
	for( i = 0 ; i < n ; i++) {
		printf("Process %d : \n", i+1);
		scanf("%d", &burst_time[i]);
	}
	
   avg_time(process, n, burst_time);
   printf("\n\nSubmitted by \'Yash Ray\', 19BCE0235");
   return 0;
}
