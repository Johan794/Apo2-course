import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import  java.util.Arrays;

public class Main {

   public static void main(String[] args) throws IOException {
      int size1;
      int size2;
      Long [] lines;
      Long [] linesToSearch;

      String [] input;

      String [] sizes;
      String line;
      BufferedReader br = new BufferedReader(new FileReader("src/binarySearchQueriesEntrada.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("src/outPut.txt"));
       //binarySearchQueriesEntrada
      line = br.readLine();

      sizes = line.split(" ");

      size1 = Integer.parseInt(sizes[0]);

      size2 = Integer.parseInt(sizes[1]);


      lines = new Long[size1];
      linesToSearch = new Long[size2];

      line = br.readLine();
      input = line.split(" ");


      for (int i = 0; i <size1 ; i++) {
         lines[i] = Long.parseLong(input[i]);

      }
      line = br.readLine();
      input = line.split(" ");
      for (int i = 0; i <size2 ; i++) {
         linesToSearch[i] = Long.parseLong(input[i]);
      }
      br.close();
      bw.write(mainOperation(lines,linesToSearch));


      bw.close();

      }

      public  static String mainOperation(Long [] lines , Long[] linesToSearch){
         Arrays.sort(lines);
         //Arrays.sort(linesToSearch);
         int k =0;
         int j=lines.length-1;
         String is;
         StringBuilder out = new StringBuilder();
         boolean found ;
         //System.out.println(Arrays.toString(lines));
         //System.out.println(Arrays.toString(linesToSearch));
         for (int i = 0; i < linesToSearch.length; i++) {
            is="NO\n";
            found = false;
            while (k<=j && !found){
               int m = (k+j)/2;
               if (lines[m]==linesToSearch[i]){
                  found=true;
                  is = "SI\n";
                  //System.out.println(is);
               }else if(lines[m]>linesToSearch[i]){
                  j= m-1;

               }else {
                  k = m+1;

               }

            }
            k =0;
            j=lines.length-1;
            out.append(is);
            //is="NO\n";
         }


         return out.toString();

      }

   }



