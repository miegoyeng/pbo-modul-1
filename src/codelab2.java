import java.util.Scanner;

public class codelab2{
    private int yourBirthYear;
    public int getYourBirthYear() {
        return yourBirthYear;
    }
    public void setYourBirthYear(int usia) {

        yourBirthYear = usia;
    }
    public void demoUsia(){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir : ");
        yourBirthYear = userinput.nextInt();
        setYourBirthYear(yourBirthYear);
        userinput.close();
    }
    public void display() {

        System.out.println("Umur anda : " + (2023 - getYourBirthYear()));
    }
    public static void main(String[] args) {
        codelab2 obj = new codelab2();
        obj.demoUsia();
        obj.display();
    }
}
