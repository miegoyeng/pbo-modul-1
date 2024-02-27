import java.util.Scanner;

class BookSystem{
     
    private String naa, NoTelp, alamat, email;
    // private hanya bisa digunakan dikelas tertentu sam
    int pilihRoom, room[][] = {
    {0, 101, 1000000},
    {1, 102, 2500000},
    {0, 103, 1500000}
    };
    Scanner input = new Scanner(System.in);

public void setNama(String nama){
    this.nama = nama;
    // this digunakan untuk mengakses objeknya ygy
}

public String getNama(){
    return this.nama;
    // return digunakan untuk mengembalikan value coi
}

public void setNoTelp(String NoTelp) {
    this.NoTelp = NoTelp;
}

public String getNoTelp(){
    return this.NoTelp;
}

public void setEmail(String email){
    this.email = email;
}

public String getEmail(){
    return this.email;
}

public void setAlamat(String alamat){
    this.alamat = alamat;
}

public String getAlamat(){
    return this.alamat;
}

public void getRoom() {
    this.room[this.pilihRoom][0] = 1;
}

// Menginisialisasi dan menginputkan nilai masbro
public void init(){
    do {
        System.out.print("Masukkan Nama : ");
        setNama(input.nextLine());
        if (!this.nama.matches("[a-zA-Z]+")){
            System.out.println("Nama harus berupa karakter / huruf, silahkan coba lagi.");
        }
    } while (!this.nama.matches("[a-zA-Z]+"));
    do {
        System.out.print("Masukkan No Telp : ");
        setNoTelp(input.nextLine());
        if (!this.NoTelp.matches("[+62]+[0-9]+")) {
            System.out.println("Kode No. Telp harus sesuai kode negara di awal input (+62xxx), silahkan coba lagi.");
        }
    } while (!this.NoTelp.matches("[+62]+[0-9]+"));
    do {
        System.out.print("Masukkan Email : ");
        setEmail(input.nextLine());
        if (!this.email.toLowerCase().matches("(.*)@webmail.umm.ac.id")) {
            System.out.println("Email Harus Webmail Dari UMM (....@webmail.umm.ac.id), silahkan coba lagi.");
        }
    } while (!this.email.toLowerCase().matches("(.*)@webmail.umm.ac.id"));
    
    System.out.print("Masukkan Alamat : ");
    setAlamat(input.nextLine());    
}

// Mengorder hotel karena terlalu dingin
public void bookRoom(){
    
    
    int choose = 0;
    do {
        // membuat variable yang diperlukan dlm operasi
        int number = 0;

        // Widihh booking hotel 
        System.out.println("Rayz Hotel");
        for (int i = 0; i < room.length; i++) {
            String checkAvailable;

            if (room[i][0] == 0) {
                checkAvailable = "(Tidak Tersedia)";
            }else{
                checkAvailable = "(Tersedia)";
            }
            System.out.println((number + 1) + ". No. " + room[i][1] + " " + room[i][2] + "\t" + checkAvailable);
            number++;
        }
        System.out.print("Pilih Kamar Tersedia : ");
        this.pilihRoom = input.nextInt()-1;
        if (room[pilihRoom][0] == 0) {
            System.out.println("Mohon Maaf Kamar Tidak Tersedia");
        } else { 
            this.dispPerson();
            this.doPayment(pilihRoom);
        }
        System.out.println("Ingin Memesan Kamar Lagi 0(ya) / 1(tidak) ? ");
        choose = input.nextInt();
        
    } while (choose == 0);
}

public void dispPerson(){
    System.out.println("===============================================");
    System.out.println("Nama : " + this.getNama());
    System.out.println("Email : " + this.getEmail());
    System.out.println("No Telp : " + this.getNama());
    System.out.println("Alamat : " + this.getAlamat());
    System.out.println("No Kamar : " + this.room[this.pilihRoom][1]);
    System.out.println("Harga Kamar : " + this.room[this.pilihRoom][2]);
}



public void doPayment(int pilihRoom){
    System.out.println("===============================================");
    System.out.print("Masukkan Tunai : ");
    input.nextInt();
    System.out.println("Kamar berhasil dipesan.");
    this.getRoom();
}
}

// Kunci kemenangan ialah ada di java
public class Modul1 {
    public static void main(String[] args){
        // Mengeksekusi / Menjalankan aneka method yg ada dalam Class BookSystem
        BookSystem summon = new BookSystem();
        summon.init();
        summon.bookRoom();
    }    
}
