//  Street Lights
package Zensar;


import java.util.*;
import java.lang.Math.*;


class Range{
	int start;
	int end;
	Range(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
}

public class StreetLights{
	public static void main(String[] args)
	{
		// =========== Part for taking user input ====================
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] location = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			location[i] = sc.nextInt();
		}
		// ===========================================================
	
		// ======= Stores the range for particular Location ==========
		Range range[] = new Range[n];
		int strt=9999,ed=0;

		for(int  i=0 ; i<n ; i++)
		{
			int a = i+1;
			int max = Math.max((a-location[i]), 1);
			int min = Math.min((a+location[i]), n);

			range[i] = new Range(max, min);
			if(strt>max)
			{
				strt = max;
			}
			if(ed<min)
			{
				ed = min;
			}
		}
		// ==========================================================
	
		System.out.println(sort(range, strt, ed, n));
	
	}

	public static int sort(Range[] range, int strt, int ed, int n)
	{

		// ========= Check for the solution =========================
		int count=0;
	
		for(int i=0 ; i<n ; i++)
		{
			// For starting from first
			if(range[i].start == strt)
			{
				// if the end is available directly
				if(range[i].end == ed)
				{
					count++;
					return count;
				}
				// if the end is not available directly
				else if(range[i].end!=ed)
				{
				int temp = 0;
					// check for the available start and note doen end
					if(range[i].start==strt)
					{
						if(temp<range[i].end)
						{
							temp=range[i].end;
						}

					}
					// check for the end which we noted down and check for the desired end
					findEnd(range, temp, strt, ed, count, i);


				}
			}
		}
		return 0;
		// ========================================================
	}
	// =================== find end ==========================
	public static int findEnd(Range range[], int temp, int strt, int ed, int count, int i)
	{
		if(range[i].start <= temp)
		{
			if(range[i].end==ed)
			{
				count++;
				return count;
			}
			else if(range[i].end!=ed)
			{
				temp=range[i].end;
			}
			else if(range[i].start<=temp)
			{
				findEnd(range, temp, strt, ed, count, i);
			}
		}
		return 0;
	}
