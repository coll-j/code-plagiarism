package class1;

	//mengimpor Scanner ke program
	import java.util.Scanner;
	
	public class scan { 

 public static void main(String[] args) {
     // deklarasi variabel
     String nama, alamat;
     int usia, semester;

     try (// membuat scanner baru
	Scanner keyboard = new Scanner(System.in)) {
		// Tampilkan output ke user
		 System.out.println("### Biodata Mahasiswa ###");
		 System.out.print("Nama mahasiswa: ");
		 // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
		 nama = keyboard.nextLine();
		 // Tampilkan outpu lagi
		 System.out.print("Alamat: ");
		 // menggunakan scanner lagi
		 alamat = keyboard.nextLine();

		 System.out.print("Usia: ");
		 usia = keyboard.nextInt();

		 System.out.print("Semester: ");
		 semester = keyboard.nextInt();
	}

     // Menampilkan apa yang sudah simpan di variabel
     System.out.println("--------------------");
     System.out.println("Nama mahasiswa: " + nama);
     System.out.println("Alamat: " + alamat);
     System.out.println("Usia: " + usia + " tahun");
     System.out.println("Semester: " +semester);
     
     
     // if else

//     	        int nilai;
//     	        String nama;
//     	        Scanner scan = new Scanner(System.in);
//
//     	        // mengambil input
//     	        System.out.print("Nama: ");
//     	        nama = scan.nextLine();
//     	        System.out.print("Nilai: ");
//     	        nilai = scan.nextInt();
//
//     	        // cek apakah dia lulus atau tidak
//     	        if( nilai >= 65 ) {
//     	            System.out.println("Selamat " + nama + ", anda lulus!");
//     	        } else {
//     	            System.out.println("Maaf " + nama + ", anda gagal");
//     	        }
//
//     	    }
//
//     	}

 }
	}
