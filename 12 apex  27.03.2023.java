//Enum : Degisme ihtimali olmayan data lari depolamak icin kullanilir
//haftanin gun isimleri, ay isimleri, sehir isimleri, araba markalari...

//--------------enum in icini buraya eklendi---------------------------
public enum Mevsimler {
    //Enumlar icerisindeki datalar buyuk harfle yazilir, 
    //cunku conding te degisme ithtimali olamayan datalar buyuk harfle yazilir
    ILKBAHAR, SONBAHAR, YAZ, KIS

}
//------------------------------------------------------------------------

/*Ornek 5: Ilkbahar icin "Piknik"
			Sonbahar icin "Doga yuruyusu"
			Yaz icin "yuzme"
			Kis icin "Kayak" yazdiriniz
		*/


switch on Mevsimler.YAZ{
    when ILKBAHAR{
        System.debug('Piknik');
    }
    when SONBAHAR{
         System.debug('Doga yuruyusu');
    }
    when YAZ{
         System.debug('Yuzme');
    }
    when KIS{
         System.debug('Kayak');
    }       
}

//Ornek 6: rastgeleBirHarfVer() methodunu kullanarak, aldiginiz harfler icin asagidaki mesajlari 
//kullaniciya veren kodu yaziniz
/*
	a) 'A' ve 'a' ==> ilk harf
	b) 'B' ve 'b' ==> ikinci harf
	c) 'Z' ve 'z' ==> son harf
	d) 'X','x','W','w','Q','q' ==> Turkce karakter degil
	e) Digerleri icin ==> Sen ozel bir karakter degilsin
*/
//---------------MyClass ici buraya eklendi--------------------------

public class MyClass {
    //Rastgele bir harf ureten bir method olusturunuz
    //public==> herkese acik  static ==> class ismiyle methodu cagirabiliriz  String => return type

    public static String rastgeleBirHarfVer(){
        
        String alfabe = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'; 
        
        Integer maxIndex =alfabe.length()-1;//51
        // Math.random() size rastgele 0 ile 1 arasi sayilar verir.
        // Bunu max degerinizle carparsaniz size o aralikta rastgele sayilar uretir
        
        Integer rastgeleIndex =   Integer.valueOf(Math.random()*maxIndex);
        
        //bunu maxIndex ile carptiginizda 0 ile 51 arasi sayilar uretir.
        //
   		return alfabe.substring(rastgeleIndex, rastgeleIndex+1);
                         
    }

}

//---------------------------------------------------------------------------------


String randomLetter = MyClass.rastgeleBirHarfVer();
System.debug(randomLetter);

switch on randomLetter{
   		when 'A','a'{
        System.debug('ilk harf');
    }
        when 'B','b'{
        System.debug('ikinci harf');
    }
        when 'Z','z'{
        System.debug('son harf');
    }
        when 'X','x','W','w','Q','q'{
        System.debug('Turkce karakter degil');
    }
        when else {
        System.debug('Sen ozel bir karakter degilsin');
    }   
}
