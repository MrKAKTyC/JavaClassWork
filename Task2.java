import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		int n,m;
		n = Integer.parseInt((scr.nextLine()));
		m = Integer.parseInt((scr.nextLine()));
		int[][] ArrayOfInteger = new int[n][m];
		int[] tmp = new int[ArrayOfInteger.length]; 
		
		FillRandom(ArrayOfInteger);
			System.out.println("2dim array");
		PrintArray(ArrayOfInteger);
			System.out.println("1dim array");
		tmp = FindAver(ArrayOfInteger);
		PrintArray(tmp);
		sort(ArrayOfInteger, tmp);
			System.out.println("After sort");
		PrintArray(ArrayOfInteger);
		System.out.println("1dim array");
		PrintArray(tmp);
	}
	public static void FillRandom(int[][] ArrayOfInt)
	{
		for(int i = 0; i<ArrayOfInt.length;i++){
			for(int j = 0; j<ArrayOfInt[i].length;j++){
				ArrayOfInt[i][j]=(int)(Math.random()*20);
			}
		}
	}
	public static void PrintArray(int[][] ArrayOfInt)
	{
		for(int i = 0; i<ArrayOfInt.length;i++){
			for(int j = 0; j<ArrayOfInt[i].length;j++){
				System.out.print(ArrayOfInt[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void PrintArray(int[] ArrayOfInt)
	{
		for(int i = 0; i<ArrayOfInt.length;i++){
				System.out.print(ArrayOfInt[i]+"\t");
			}
		System.out.println();
	}
	public static int[] FindAver(int[][] ArrayOfInt)
	{
		int[] tmp = new int[ArrayOfInt.length];
		for(int i = 0; i<ArrayOfInt.length;i++){
			for(int j = 0; j<ArrayOfInt[i].length;j++){
				tmp[i]+=ArrayOfInt[i][j];
			}
		}
		return tmp;
	}
	public static void sort(int[][] ArrayOfInteger, int[] ArrayOfSumm) {
			for (int max = 0; max < ArrayOfSumm.length - 1; max++) {
				int least = max;
				for (int j = max + 1; j < ArrayOfSumm.length; j++) {
					if (ArrayOfSumm[j] > ArrayOfSumm[least]) {
						least = j;
					}
					
				}
				int Dtmp = ArrayOfSumm[max];
				ArrayOfSumm[max] = ArrayOfSumm[least];
				ArrayOfSumm[least] = Dtmp;
				SwapArray(ArrayOfInteger[max],ArrayOfInteger[least]);
			}
		}
	public static void SwapArray(int[] A, int[] B){
		int[] tmp = new int[A.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=A[i];
			A[i]=B[i];
			B[i]=tmp[i];
		}
	}
	}
	
