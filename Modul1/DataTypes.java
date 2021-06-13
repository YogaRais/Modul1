import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[] args){

  Scanner scanner = new Scanner(System.in);

  String namaDepan = "Yoga";
  String namaBelakang = "Rais";
  int usia = 19;
  int targetTahunKuliah = 4;
  double ipk = 3.89;
  char nilaiAbjad = 'A';
  boolean tampan = true;

  System.out.println("Input Nama Depan : ");
  namaDepan = scanner.nextLine();
  System.out.println("Input Usia : ");
  usia = scanner.nextInt();
  System.out.println("Input IPK : ");
  ipk = scanner.nextDouble();
  System.out.println("");
  System.out.println("Input Nilai Abjad : ");
  nilaiAbjad = scanner.next().charAt(0);
  System.out.println("Tampan? : ");
  tampan = scanner.nextBoolean();
  namaBelakang = JOptionPane.showInputDialog("Nama Belakang : ");

  System.out.println("============ OUTPUT ============");
  System.out.println("Nama depan : " + namaDepan);
  System.out.println("Nama belakang : " + namaBelakang);
  System.out.println("Usia : " + usia);
  System.out.println("Target Kuliah : " + targetTahunKuliah + "tahun");
  System.out.println("IPK : " + ipk);
  System.out.println("Nilai PBO : " + nilaiAbjad);
  System.err.println("Tampan : " + tampan);

   JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaBelakang);

 }
}