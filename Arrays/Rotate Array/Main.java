import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = new int[99899];
		try {
		int counter = 0;
		Scanner sc = new Scanner(new File("trash1.txt"));
		while (sc.hasNextInt())
        {
            arr[counter] = sc.nextInt();
            counter++;
        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		int k = 54944;
		long time = System.currentTimeMillis();
		s.rotate(arr, k);
		System.out.println(System.currentTimeMillis() - time);
		//for (int a : arr)
		//	System.out.println(a);
		/*
		try{
		Scanner sc = new Scanner(new File("trash.txt"));
		String name = sc.nextLine();
		name = name.replaceAll(",", "\n");
		FileWriter fileWriter = new FileWriter("trash1.txt");
        fileWriter.write(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}