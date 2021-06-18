package model;

import java.io.*;
import java.util.ArrayList;


public class InfrastructureDepartment {
    public static  final  String FILE_NAME = "data/billboard.bbd";
    private ArrayList<Billboard> billboards;

    public InfrastructureDepartment() {
        billboards = new ArrayList<Billboard>();

    }

    public  void addBillboard(double width, double height, boolean inUse, String brand){
      Billboard newBillboard = new Billboard( width, height, inUse,brand);
      billboards.add(newBillboard);
    }
    public  void saveBillboard() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        oos.writeObject(billboards);
        oos.close();

    }

    public void loadBillboard() throws IOException, ClassNotFoundException {
        File f = new File(FILE_NAME);
        boolean loaded = false;
        if(f.exists()){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            billboards = (ArrayList<Billboard>) ois.readObject();
            ois.close();

        }

    }

    public void  exportDangerousBillboard(String filename) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(filename);

        for(int i=0;i<billboards.size();i++){
            if ((billboards.get(i).calculateArea())>=160){
                Billboard myBillboards = billboards.get(i);
                if(pw.toString().contains(String.valueOf(myBillboards.getWidth())) || pw.toString().contains(String.valueOf(myBillboards.getHeight()))){

                }else{
                    pw.println(myBillboards.getWidth()+"|"+myBillboards.getHeight()+"|"+myBillboards.isInUse()+"|"+myBillboards.getBrand());

                }
            }

        }

        pw.close();

    }

    public void importData(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        double width,height;
        boolean inUse;
        while(line!=null){
            String[] parts = line.split("|");
            width=Double.valueOf(parts[0]);
            height = Double.valueOf(parts[1]);
            inUse = Boolean.valueOf(parts[2]);
            addBillboard(width,height,inUse,parts[3]);
            line = br.readLine();
        }
        br.close();

    }

    public ArrayList<Billboard> getBillboards() {
        return billboards;

    }

}
