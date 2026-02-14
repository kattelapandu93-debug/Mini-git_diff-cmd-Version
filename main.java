import java.util.*;
import java.io.*;

class Main{
public static void main(String[] args) throws IOException {
    ReadFile fd =new  ReadFile ();
    lcs lc = new lcs();
  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first file path: ");
        String path1 = sc.nextLine();

        System.out.print("Enter second file path: ");
        String path2 = sc.nextLine();

        List<String> fileA = fd.readFile(path1);
        List<String> fileB = fd.readFile(path2);

        //System.out.println(fileA);

        int len1 = fileA.size();
        int len2 = fileB.size();
        
        System.out.print("Lines unchanged : "+lc.process(fileA,fileB,len1-1,len2-1));
        


    }
}