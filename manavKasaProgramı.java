import java.util.Scanner;

public class manavKasaProgramı {
    public static void main(String[] args) {

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutTl = 2.14, elmaTl = 3.67, domatesTl = 1.11, muzTl = 0.95, patlicanTl = 5.00;


        Scanner imp = new Scanner(System.in);

        System.out.println("Armut kaç kilo?");
        armutKg = imp.nextDouble();
        System.out.println("Elma kaç kilo?");
        elmaKg = imp.nextDouble();
        System.out.println("Domates kaç kilo?");
        domatesKg = imp.nextDouble();
        System.out.println("Muz kaç kilo?");
        muzKg = imp.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        patlicanKg = imp.nextDouble();

        double armutTutar =(armutKg*armutTl);
        double elmaTutar =(elmaKg*elmaTl);
        double domatesTutar =(domatesTl*domatesKg);
        double muzTutar =(muzTl*muzKg);
        double patlicanTutar =(patlicanTl*patlicanKg);
        double toplamTutar = (armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar);

        System.out.println("Toplam alışveriş tutarınız : " + toplamTutar);



    }
}
