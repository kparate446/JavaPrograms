package com.bridgelabz.utility;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Utility {
	static Scanner sc=new Scanner(System.in);

	/** Used to input the String:*/
	public static String inputString() {
		String str = sc.next();
		// sc.close();
		return str;
	}
	/** Used to input the Integer:*/
	public static int inputNumber() {
		int number = sc.nextInt();
		return number;
	}
	/** Used to input the Double:*/
	public static double inputDouble() {
		double number = sc.nextDouble();
		return number;
	}
	
	/**Used to Flip coin Program*/
	/**
	 * Purpose: this method is used find Tail Calculator
	 * @param tails
	 * @param n
	 * @return
	 */
	public static double TailCalculator(float tails,float n) {
//		double k=0;
//		try {
		return (100*tails)/n;
		
//		catch(ArithmeticException e) {
//			System.out.println("Exception: "+e.getMessage());
//		}
//		return k;
	}
	/*Used to Head Calculator*/
	/**
	 * Purpose: this method is used Head calculator
	 * @param heads
	 * @param n
	 * @return
	 */
	public static double HeadCalculator(float heads,float n) {
		return(100*heads)/n;
	}
	/*Used to Leap year or Not*/
	/**
	 * Purpose: this method is used find Leap year or Not
	 * @param year
	 * @return
	 */
	public static boolean leapOrNotLeap(int year) {
		if(year>=1000 && year<9999) { 
			if(year%400==0 ||year%4==0 &&year%100!=0) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	/*Used to Power Calculator*/
	public static int CalculatePower(int e,int b) {
		int p=1;
		for(int i=0;i<e;i++) {
			p=p*b;
		}
		return p;
	}
	/*Used to Prime Factors*/
	/**
	 * Purpose: this method is used find prime factor of number
	 * 
	 * @param x 
	 * @return
	 */
	public static int PrimeFactors(int x) {
		for(int i=2;x>1;i++) {
			while(x%i==0) {
				System.out.println(i+" ");
				x=x/i;
			}
		}
		return x;
	}
	/**Used to Harmonic Calculator*/
	public static double harmonic(int N) {
		float h=1;
		for(int i=2;i<=N;i++) {
			h+=(float)1/i;
		}
		return (h);
	}
	/** Used to 2d Integer Matrix*/
	public static int IntArray(int arr[][],int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {

				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return column;

	}

	/**Used to triple sum is zero*/
	public static void Triplet(int A[],int n) {
		int count=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(A[i]+A[j]+A[k]==0) {
						System.out.println();
						System.out.print(A[i]+" "+A[j]+" "+A[k]);
						count++;

					}
				}
			}
		}
		if(count==0) {
			System.out.println("Not Found");
		}
		System.out.println();
		System.out.println("Count"+count);
	}
	/**Used to distance Calculate*/
	public static double getDistance(int x,int y) {
		return Math.sqrt(x*x+y*y);
	}
	/**Used to Quadratic Equation*/
	public static void getRoots(double a,double b,double c) {
		double d=b*b-4*a*c;
		if(d>0.0) {
			double x1=(-b+Math.pow(d,0.5))/(2*a);
			double x2=(-b-Math.pow(d, 0.5))/(2*a);	
			System.out.println(x1+" "+x2);
		}
		else if(d==0.0) {
			double r1=-b/(2.0*a);
			System.out.println(r1);
		}
		else {
			System.out.println("No real root");
		}
		//	return (int) c;
	}
	/** Used to WhillChil*/
	public static double getWill(double t,double v) {
		return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
	}
	
	/**Used to Gambler games*/
	public static int gambler(int stack,int goal,int num) {
		int wins=0;//bets=0,
		for(int i=0;i<num;i++) {
			int cash=stack;
			while(cash>0&&cash<goal) {
//				bets++;
				if(Math.random()<0.5) {
					cash++;
				}
				else {
					cash--;
				}
			}
			if(cash==goal) {
				wins++;

			}

		}
		return wins;
	}
	//To Calculate Win Percentage*/
	public static int winPerc(int wins, int trail) {
		return (100 * wins) / trail;
	}

	// To Calculate Loss Percentage
	public static int lossPerc(int loss, int trail) {
		return (100 * loss) / trail;
	}

	/**To Calculate Coupon Number*/
	public static int Coupon(int N) {
		boolean arr[]=new boolean[N];
		int count=0;
		int distict=0;
		while(distict<N) {
			int val=(int)(Math.random()*(N));
			count++;
			if(!arr[val]) {
				distict++;
				arr[val]=true;
			}
		}
		return count;
	}
	/* Used to Vending machine*/
	public static int Vending(int amount) {
		int []Notes=new int[] {1000,500,100,50,10,5,2,1};
		int []NotesCounter=new int [8];
		for(int i=0;i<8;i++) {
			if(amount>=Notes[i]) {
				NotesCounter[i]=amount/Notes[i];
				amount=amount-Notes[i]*NotesCounter[i];
			}
		}
		for(int i=0;i<8;i++) {
			if(NotesCounter[i]!=0) {
				System.out.println(Notes[i]+" : "+NotesCounter[i]);
			}
		}
		return amount;
	}
	/* Used To Calculate Day of the Week*/
	public static int dayCalculator(int d, int m, int y) {
		int day, month, year, x;
		year = y - (14 - m) / 12;
		x = year + year / 4 - year / 100 + year / 400;
		month = m + 12 * ((14 - m) / 12) - 2;
		day = (d + x + 31 * month / 12) % 7;
		return day;
	}
	/* calculate Temperature*/
	//Used to Convert Fahrenheit To Celsius
	public static double FahrenheitToCelsius(double f) {
		return  ((f-32)*5/9);
	}
	//Used to Convert Celsius To Fahrenheit
	public static double CelsiusToFahrenheit(double c) {
		return (((c*9)/5)+32);
	}
	/** Used to Bubble Sort*/
	public static int Bubble(int A[],int N) {
		for(int r=1;r<=N-1;r++) {
			for(int i=0;i<N-1-r;i++) {
				if(A[i]>A[i+1]) {
					int temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
			}
		}
		return N;
	}
	/**Used to Binary Search*/
	public static void Binary(int A[],int N,int item) {
		int l=0,u=A.length-1,m;
		while(l<=u) {
			m=(u+l)/2;
			if(A[m]==item) {
				System.out.println("Found");
				return;
			}
			else if(item>A[m]) {
				l=m+1;
			}
			else {
				u=m-1;
			}
		}
		System.out.println("Not Found");
		//		return item;
	}
	
	/**Used to Calculate String Anagram or Not*/ 
	public static boolean Anagram(String s1,String s2) {
		if(s1.length()!=s2.length())return false;
		char[]arr1=s1.toCharArray();
		Arrays.sort(arr1);
		char[]arr2=s2.toCharArray();
		Arrays.sort(arr2);
		String first=new String(arr1);
		String second=new String(arr2);
		return first.equalsIgnoreCase(second);
	}
	/** Used to String Palindrome or Not*/
	public static boolean palindrome(String s1) {
		String s2=new String(new StringBuffer(s1).reverse());
		return s1.equals(s2);
	}


	
	/**To Used Insertion Sort Integer */
	public static int Insertion(int A[],int N) {
		int i,j,temp = 0;
		for( i=1;i<N;i++) {
			temp=A[i];
			for(j=i-1;j>=0 && temp<A[j];j--)
				A[j+1]=A[j];
			A[j+1]=temp;
		}
		return temp;
	}
	/** To used Insertion Sort String */
	public static String[] insertionSort (String[]a) {
		int len=a.length;
		int i,j;
		String key;
		for(i=0;i<len;i++) {
			key=a[i];
			j=i-1;
			while(j>=0 && a[j].compareTo(key)>0) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		return a;
	}
	
	/** To Calculate monthly payment*/
	/* To used to calculate rate of interest*/
	public static int rateInterest(int rate) {
		//		return (rate/100)/12;
		return rate/(12*100);
	}
	/* To used to calculate Year */
	public static int Year(int year) {
		return 12*year;
	}
	/*To used to calculate Payment */
	public static int Payment(int p,int r,int n) {
		return (int) ((p*r)/(1-Math.pow((1+r),(-n))));
	}
	/*To used to Calculate interest*/
	public static int interest(int payment,int n,int p) {
		return payment*n-p;
	}
	/* To calculate Square*/
	public static double Sqrt(int num) {
		double t=num;
		double Epsilon=1e-15;
		while(Math.abs(t-num/t)>Epsilon*t) {
			t=(num/t +t)/2.0;
		}
		return t;
	}
	/** To used Decimal to Binary Converter*/
	public static int BinaryNum(int arr[],int n) {
		int i=0,j;
		while(n>0) {
			arr[i]=n%2;
			n=n/2;
			i++;
		}
		for(j=i;j>=0;j--) {//reverse Logic
			System.out.print(arr[j]);
		}
		return j;
	}
	/** To used the Nibbles*/
	public static int Nibbles(int x) {
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	}
	
	/** Used to Permutation of given String*/
	/*To calculate permutation*/
	public static void permute(String str,int l,int r) {
		if(l==r) 
			System.out.println(str);
		
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str,l+1,i);//recurssion
				str=swap(str,l,i);
			}
		}
		//return r;
	}
	/*To calculate Swap the String*/
	public static String swap(String a,int i,int j) {
		char temp;
		char []charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i] = charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
	/** Used merge Sort*/
	public static void Merge(int arr[],int l,int m,int r) {
		int n1=m-l+1;//Find Size of To Subarray merge
		int n2=r-m;
		int L[]=new int[n1];//create temperary Array
		int R[]=new int[n2];
		for(int i=0;i<n1;++i)//copy data to temp array
			L[i]=arr[l+i];
		for(int j=0;j<n2;++j)
			R[j]=arr[m+1+j];
		int i=0,j=0,k=l;//Merge the temp array
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
	
	while(j<n2) {
		arr[k]=R[j];
		j++;
		k++;
	}
	}
	public static void Sort(int arr[],int l,int r) {
		if(l<r) {
			int m=(l+r)/2;//find middle
			Sort(arr,l,m);
			Sort(arr,m+1,r);
			Merge(arr,l,m,r);
		}
	}
	public static void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;++i)
			System.out.println(arr[i]+" ");
		System.out.println();
	}
	
	/** Used to TicTacToe Program Function*/

	static char arr[][]=new char[3][3];
	static int i=0;
	static int j=0;
	static int row,col=0;
	static Random rd=new Random();
	//User function to get value
	public static void user() {
		/*code to check array still have null place for insert new element*/
		int flag=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]=='\0') {
					flag=1;
					break;
				}
			}
		}

		/*check if array[Board] is full*/
		if(flag==0) {
			System.out.println("Draw");
			return;
		}
		else {
			if(compwin()>0) {
				System.out.println("comp wins");
				print();
				System.exit(0);
			}
			else {
				//Get value from User
				System.out.println("Enter Row and Col Position");
				row=Utility.inputNumber();
				col=Utility.inputNumber();

				//validating input
				int t=0;
				while(t==0) {
					if(row>=0 && row<=2 && col>=0 && col<=2)
						t++;
					else {
						System.out.println("Enter Valid row and pos between 0 to 2");
						row=sc.nextInt();
						col=sc.nextInt();
					}
				}
				//If position is null insert value
				if(arr[row][col]=='\0') {
					arr[row][col]='x';
					compAI();
				}
				//If position is Occupied
				else {
					System.out.println("Enter new Position this Position is occupied");
					user();
				}
			}
		}
	}

	/*Computer function to get value*/
	static void compAI() {
		int flag=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]=='\0') {
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Draw");
			return;
		}
		else {
			if(userwin()>0) {
				System.out.println("user wins");
				System.exit(0);
			}
			else {
				offence();
				defence();
			}
		}
	}
	static void defence() {
		/*Checking for Row that Two Adjacent Cells are Marked By User*/
		for(int i=0;i<3;i++) {
			if((arr[0][i]==arr[1][i] && arr[1][i]=='x')||(arr[1][i]==arr[2][i] && arr[2][i]=='x')||(arr[2][i]==arr[0][i] && arr[0][i]=='x'))
			{
				//If 3rd cell is Empty add Mark From Computer
				if(arr[0][i]=='\0') {
					arr[0][i]='o';
					print();
					user();
				}
				else if(arr[1][i]=='\0') {
					arr[1][i]='o';
					print();
					user();
				}
				else if(arr[2][i]=='\0') {
					arr[2][i]='o';
					print();
					user();
				}
			}
		}
		/*Checking for Column that Two Adjacent Cells are Marked By User*/
		for(int i=0;i<3;i++) {
			if((arr[i][0]==arr[i][1] && arr[i][1]=='x')||(arr[i][1]==arr[i][2] && arr[i][2]=='x')||(arr[i][2]==arr[i][0] && arr[i][0]=='x')) {
				//If 3rd cell is Empty add Mark from Computer
				if(arr[i][0]=='\0') {
					arr[i][0]='o';
					print();
					user();
				}
				else if(arr[i][1]=='\0') {
					arr[i][1]='o';
					print();
					user();
				}
				else if(arr[i][2]=='\0') {
					arr[i][2]='o';
					print();
					user();
				}
			}
		}
		//Diagonal 1
		if((arr[0][0]==arr[1][1] && arr[1][1]=='x')||(arr[1][1]==arr[2][2]&&arr[2][2]=='x')||(arr[2][2]==arr[0][0] && arr[0][0]=='x')) {
			if(arr[0][0]=='\0') {
				arr[0][0]='o';
				print();
				user();
			}
			else if(arr[1][1]=='\0') {
				arr[1][1]='o';
				print();
				user();
			}
			else if(arr[2][2]=='\0') {
				arr[2][2]='o';
				print();
				user();
			}
		}
		//Diagonal 2
		if((arr[2][0]==arr[1][1]&&arr[1][1]=='x')||(arr[1][1]==arr[0][2]&&arr[0][2]=='x')||(arr[2][0]==arr[0][2]&&arr[0][2]=='x')) {
			if(arr[2][0]=='\0') {
				arr[2][0]='o';
				print();
				user();
			}
			else if(arr[1][1]=='\0') {
				arr[1][1]='o';
				print();
				user();
			}
			else if(arr[0][2]=='\0') {
				arr[0][2]='o';
				print();
				user();
			}
		}
		/*If No Two Adjacent cell are Marked By user then Add Random Marked By Computer*/
		else {
			row=rd.nextInt(3);
			col=rd.nextInt(3);

			if(userwin()>0) {
				System.out.println("user wins");
			}
			else if(arr[row][col]=='\0') {
				arr[row][col]='o';
				print();
				user();
			}
			else {
				compAI();
			}
		}
	}
	/*Checking for Self Winning Chances*/
	static void offence() {
		/*checking for Row that Two Adjacent Cells are Marked By Computer*/
		for(int i=0;i<3;i++) {
			if((arr[0][i]==arr[1][i]&& arr[1][i]=='o')||(arr[1][i]==arr[2][i]&&arr[2][i]=='o')||(arr[2][i]==arr[0][i]&&arr[0][i]=='o')) {
				//If 3rd cell is Empty add Mark From Computer
				if(arr[0][i]=='\0') {
					arr[0][i]='o';
					print();
					user();
				}
				else if(arr[1][i]=='\0') {
					arr[1][i]='o';
					print();
					user();
				}
				else if(arr[2][i]=='\0') {
					arr[2][i]='o';
					print();
					user();
				}
			}
		}
		/*Checking for Column that Two Addjacent Cells are Marked By Computer*/
		for(int i=0;i<3;i++) {
			if((arr[i][0]==arr[i][1]&&arr[i][1]=='o')||(arr[i][1]==arr[i][2] && arr[i][2]=='o')||(arr[i][2]==arr[i][0]&&arr[i][0]=='o')) {
				//If 3rd cell is Empty add Mark from Computer
				if(arr[i][0]=='\0') {
					arr[i][0]='o';
					print();
					user();
				}
				else if(arr[i][1]=='\0') {
					arr[i][1]='o';
					print();
					user();
				}
				else if(arr[i][2]=='\0') {
					arr[i][2]='o';
					print();
					user();
				}
			}
		}

		/*Diagonal 1*/
		if((arr[0][0]==arr[1][1]&&arr[1][1]=='o')||(arr[1][1]==arr[2][2] && arr[2][2]=='o')||(arr[2][2]==arr[0][0]&&arr[0][0]=='o')) {
			if(arr[0][0]=='\0') {
				arr[0][0]='o';
				print();
				user();
			}
			else if(arr[1][1]=='\0') {
				arr[1][1]='o';
				print();
				user();
			}
			else if(arr[2][2]=='\0') {
				arr[2][2]='o';
				print();
				user();
			}
		}
		/*Diagonal 2*/
		if((arr[2][0]==arr[1][1]&&arr[1][1]=='o')||(arr[1][1]==arr[0][2] && arr[0][2]=='o')||(arr[2][0]==arr[0][2]&&arr[0][2]=='o')) {
			if(arr[2][0]=='\0') {
				arr[2][0]='o';
				print();
				user();
			}
			else if(arr[1][1]=='\0') {
				arr[1][1]='o';
				print();
				user();
			}
			else if(arr[0][2]=='\0') {
				arr[0][2]='o';
				print();
				user();
			}
		}
	}
	//Check Computer Win
	static int compwin() {
		int pc=0;
		if(arr[0][0]=='o' && arr[0][1]=='o' && arr[0][2]=='o') { //1st horizontal row
			pc++;
		}
		else if(arr[1][0]=='o' && arr[1][1]=='o' && arr[1][2]=='o') { //2st horizontal row
			pc++;
		}
		else if(arr[2][0]=='o' && arr[2][1]=='o' && arr[2][2]=='o') { //3st horizontal row
			pc++;
		}
		else if(arr[0][0]=='o' && arr[1][0]=='o' && arr[2][0]=='o') { //4st horizontal row
			pc++;
		}
		else if(arr[0][1]=='o' && arr[1][1]=='o' && arr[2][1]=='o') { //5st horizontal row
			pc++;
		}
		else if(arr[0][2]=='o' && arr[1][2]=='o' && arr[2][2]=='o') { //6st horizontal row
			pc++;
		}
		else if(arr[0][0]=='o' && arr[1][1]=='o' && arr[2][2]=='o') { //left to right Diagonal row
			pc++;
		}
		else if(arr[0][2]=='o' && arr[1][1]=='o' && arr[2][0]=='o') { //right to left Diagonal row
			pc++;
		}
		return pc;
	}
	//Check user Win
	static int userwin() {
		int uc=0;
		if(arr[0][0]=='x' && arr[0][1]=='x' && arr[0][2]=='x') { //1st horizontal row
			uc++;
		}
		else if(arr[1][0]=='x' && arr[1][1]=='x' && arr[1][2]=='x') { //2st horizontal row
			uc++;
		}
		else if(arr[2][0]=='x' && arr[2][1]=='x' && arr[2][2]=='x') { //3st horizontal row
			uc++;
		}
		else if(arr[0][0]=='x' && arr[1][0]=='x' && arr[2][0]=='x') { //4st horizontal row
			uc++;
		}
		else if(arr[0][1]=='x' && arr[1][1]=='x' && arr[2][1]=='x') { //5st horizontal row
			uc++;
		}
		else if(arr[0][2]=='x' && arr[1][2]=='x' && arr[2][2]=='x') { //6st horizontal row
			uc++;
		}
		else if(arr[0][0]=='x' && arr[1][1]=='x' && arr[2][2]=='x') { //left to right Diagonal row
			uc++;
		}
		else if(arr[0][2]=='x' && arr[1][1]=='x' && arr[2][0]=='x') { //right to left Diagonal row
			uc++;
		}
		return uc;
	}
	//Printing Board
	public static void print() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]=='\0')
					System.out.print("- ");
				else
					System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	/** End TicTacToe Program*/

}
