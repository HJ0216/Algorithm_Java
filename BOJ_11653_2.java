import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
 
        for(int i=2; i<=Math.sqrt(num); i++) {
            while(num%i==0) {
                bw.write(i + "\n");
                num /= i;
            }
        }
        
        if(num!=1) {
            bw.write(num + "");
        }
        
        
        bw.flush();
        bw.close();
        
    }
    
}
