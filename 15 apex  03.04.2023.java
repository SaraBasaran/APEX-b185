//Ornek 7: 10 dan 7 ye kadar tum Integerlarin carpimini console a yazdiriniz
//10x9x8x7 ==>5040


Integer carpim=1;

for(Integer i = 10 ;		i>6   ;				 i--  ){  
    carpim =  	carpim 	* 	i;    
}
System.debug(carpim);
//-----------ustteki loop un acilimi----------
Integer sum = 1;
sum = sum * 10;
sum = sum * 9;
sum = sum * 8;
sum = sum * 7;
System.debug(sum);
//---------------------------------------------

//Ornek 8: Size verilen bir String in, index i tek sayi olan karakterlerini console yazdiriniz.

//-------------------------------------------------------------------
for(Integer i =0; i<=s.length()-1  ; i++  ){//i=0,1,2,3,4,5 
}

for(Integer i =0; i<s.length()  ; i++  ){ //i=0,1,2,3,4,5   
}
//---------------------------------------------------------------------

//index=>	 012345	
//String s= 'Amasya'; ==>msa
//length=>	 123456	
String s= 'Amasya';
String sonuc='';
for(Integer i =0; 	i<s.length() ;	 i++  ){ 
  
    		if(Math.mod(i,2)!=0){
   			  sonuc =  sonuc + s.substring(i,i+1);        
    }
}
System.debug(sonuc);

//Ornek 9 :Verilen bir string'i tersten yazdiran kodu yaziniz.
//String s = Ali Can; ==> naC ilA

String s ='Ali'; 
String ters='';
for(Integer i =s.length()-1; i>=0; 		i--){    
   ters = ters + s.substring(i,i+1);   
}
System.debug(ters);

//Ornek 10 : Asagidaki sekli for loop kullanarak ciziniz
/*
	AAAAA
	AAAAA
	AAAAA
*/
Integer satir = 3;
Integer sutun = 5;

for(Integer i=1;i<=satir;i++){
    
    String s='';
    
    for(Integer k=1; k<=sutun;k++){
        s=s+'A';
    }
    System.debug(s); 
    
}
//----------icerdeki loop yanyana AAAAA yazdirir----
	Integer sutun = 5;
    String s='';
    
    for(Integer k=1; k<=sutun;			k++){
       s=  s	+ 	'A'              
    }
    System.debug(s); 
//---------------------------------------------
