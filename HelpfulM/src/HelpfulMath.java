import java.io.*;

/*
* @author RichJohan
* */
public class HelpfulMath {

	public static void main(String[] args) throws IOException {
		int size=0;
		String[] input;
		int[] outPut;
		boolean out=false;

		String outString="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();

		input = line.split("\\+");
		size = input.length;


		outPut = outputSort(input,size);
		for (int i = 0; i <outPut.length; i++) {
			if (out){
              outString+="+";
			}
			outString+=outPut[i];
			out = true;

		}
		bw.write(outString);

		br.close();
		bw.close();
	}

	public static int[] outputSort(String[] input, int size){
		int array[] = new int[size];
		for (int i = 0; i <size ; i++) {
			array[i]= Integer.parseInt(input[i]);
		}
		boolean changed = true;
		for(int i =0; i<input.length ; i++) {
			changed=false;
			for(int j=0; j<input.length-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					changed = true;
				}
			}
		}
		return array;

	}

}
