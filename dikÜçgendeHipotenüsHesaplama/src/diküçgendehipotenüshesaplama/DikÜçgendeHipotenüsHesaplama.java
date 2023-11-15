
package diküçgendehipotenüshesaplama;

import java.util.Scanner;
public class DikÜçgendeHipotenüsHesaplama {

    
    public static void main(String[] args) {
        
        int kenar1,kenar2,alan;
        double hipotenüs,çevre;
           Scanner scn=new Scanner(System.in);
        
        System.out.print("Lutfen Dik Ucgenin Ilk Kenarini Giriniz : " );
        kenar1=scn.nextInt();
        System.out.print("Lutfen Dik Ucgenin Ikinci Kenarini Giriniz : " );
        kenar2=scn.nextInt();
        
        hipotenüs=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Ucgenin Hipotenusu : "+hipotenüs);
        
        çevre=kenar1+kenar2+hipotenüs;
        System.out.println("Ucgenin Cevresi : "+çevre );
        
        alan=(kenar1*kenar2)/2;
        System.out.println("Ucgenin Alani : "+alan );
        
        
        
        
    }
    
}
