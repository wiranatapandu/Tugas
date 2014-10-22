
package id.blits.tugas;

import java.util.Scanner;
import javax.print.DocFlavor.INPUT_STREAM;


public class HasilTugas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai Kuis1 : ");
        float kuis1 =input.nextFloat();
        
        System.out.println("Nilai Kuis2 : ");
        float kuis2 =input.nextFloat();
        
        System.out.println("Nilai Tugasbesar : ");
        float tugasbesar =input.nextFloat();
        
        
        System.out.println("Nilai Tugaskecil : ");
        float tugaskecil =input.nextFloat();
        
        System.out.println("Nilai UTS : ");
        float UTS =input.nextFloat();
        
        System.out.println("Nilai UASpraktek : ");
        float UASpraktek =input.nextFloat();
        
        System.out.println("Nilai UASteori : ");
        float UASteori =input.nextFloat();
        
        float hasil_kuis = ((kuis1+kuis2)/2)*15/100;
        float hasil_tugas = ((tugasbesar*70/100+tugaskecil*30/100))*30/100;
        float hasil_UTS = (UTS*25/100);
        float hasil_UAS = ((UASpraktek*60/100+UASteori*40/100))*30/100;
        
        System.out.println("HASIL KUIS = "+ (float) (kuis1+kuis2)/2*15/100);
        System.out.println("HASIL TUGAS = "+ (float) ((tugasbesar*70/100+tugaskecil*30/100))*30/100);
        System.out.println("HASIL UTS = "+(float) (UTS*25/100));
        System.out.println("HASIL UAS = "+(float) ((UASpraktek*60/100+UASteori*40/100))*30/100);
        System.out.println("NILAI AKHIR = "+ (float) (hasil_kuis+hasil_tugas+hasil_UTS+hasil_UAS));
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
