import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = scanner.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = scanner.nextInt();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Notlarınızın Ortalaması: " + ortalama);

        String str = ortalama > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);


    }
}
