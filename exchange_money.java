import java.util.Scanner;
import java.text.DecimalFormat;
public class exchange_money {
    public static void main(String[]args){
    
         Scanner input = new Scanner(System.in);
         String yesno;
         String simpanhasil = "";
        System.out.println("_________________________________________________________________\n" ); 
        System.out.println("\t              ---------------------------------" ); 
        System.out.println("*************** WELCOME TO IDR   EXCHANGE MACHINE ***************");
        System.out.println("\t              ---------------------------------" ); 
        System.out.println("_________________________________________________________________\n" ); 
        System.out.println("****************** INFO EXCHANGE   RATE UPDATE ******************" );
        System.out.println("Info Kurs Harga");
        System.out.println(" 7.03   Dollar Amerika Serikat    = Rp100.000");
        System.out.println(" 9.62   Dollar Australia          = Rp100.000");
        System.out.println(" 54.53  Dollar Hongkong           = Rp100.000");
        System.out.println(" 54.52  Dollar Singapura          = Rp100.000");
        System.out.println(" 735.47 Yen Jepang                = Rp100.000");
        System.out.println(" 9.18   Dollar Kanada             = Rp100.000");
        System.out.println(" 28.78  Ringgit Malaysia          = Rp100.000");
        System.out.println(" 10.10  Dollar Selandia Baru      = Rp100.000");
        System.out.println(" 735.47 Dollar Baru Taiwan        = Rp100.000");
        System.out.println(" 213.82 Baht Thailand             = Rp100.000");    
        System.out.println("_________________________________________________________________\n" );  
        String choose;
        long rupiah;
        long country;
        String country1;
        String rupiah1;
        long pay;
        long charge = 15000;
        long ttl ;
        String exchangeto = " ";
        long exchangeagain;
        String dcikon = " ";
        do{
            System.out.println("1. Money Exchange");
            System.out.println("2. EXIT");
            System.out.println("Choose :" ); 
            choose = input.next();
           
                if (choose.equals("1")){
                    do{
                    
                        do {
                            System.out.println("_________________________________________________________________\n" ); 
                            System.out.println("*************************** INPUT IDR ***************************");
                            System.out.println("Input IDR Range 100000-10000000!");
                            System.out.print("Input : ");
                            rupiah = input.nextLong();
                            ttl = charge+rupiah;
                            rupiah1 = Long.toString(rupiah);

                        
                        }while(rupiah < 100000 || rupiah > 10000000);
                        do{
                            System.out.println("_________________________________________________________________\n" ); 
                            System.out.println("************************ SELECT  COUNTRY ************************");
                        System.out.println("1.  AMERIKA SERIKAT ");
                        System.out.println("2.  AUSTRALIA ");
                        System.out.println("3.  HONGKONG ");
                        System.out.println("4.  JEPANG");
                        System.out.println("5.  KANADA ");
                        System.out.println("6.  MALAYSIA ");
                        System.out.println("7.  SELANDIA BARU ");
                        System.out.println("8.  SINGAPURA ");   
                        System.out.println("9.  TAIWAN ");
                        System.out.println("10. THAILAND ");
                   
                        
                            System.out.print("Choose : ");
                            country = input.nextInt();
                            if(country == 1){
                                exchangeto = " Dollar Amerika Serikat" ;
                                double rptousd = 0.000070341;
                                double konversi_rptousd = Math.round(rupiah*rptousd);
            
                                DecimalFormat digit = new DecimalFormat(" 0.00"); 
                                System.out.println("Result Exchange To Dollar AS");
                                dcikon = digit.format(konversi_rptousd);
                                System.out.println("Rp."+rupiah+" :"+dcikon+" Dollar AS");

                            }
                            else if (country == 2){
                                exchangeto = " Dollar Australia" ;
                                double rptoau = 0.000096200;
                                double konversi_rptoau = Math.floor(rupiah*rptoau);

                                    DecimalFormat digit = new DecimalFormat("0.00"); 
                                    System.out.println("Result Exchange To Dollar Australia ");
                                    dcikon = digit.format(konversi_rptoau);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Dollar Australia");
                            }
                            else if (country == 3){
                                exchangeto = " Dollar Hongkong" ;
                                double rptohk = 0.000545284;
                                double konversi_rptohk = Math.floor(rupiah*rptohk);

                                    DecimalFormat digit = new DecimalFormat("0.00"); 
                                    System.out.println("Result Exchange To Dollar Hongkong ");
                                    dcikon = digit.format(konversi_rptohk);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Dollar Hongkong");
        
                            }
                            else if (country == 4){
                                exchangeto = " Yen Jepang" ;
                                double rptojp = 0.007353391;
                                double konversi_rptojp = Math.floor(rupiah*rptojp);

                                    DecimalFormat digit = new DecimalFormat("0.00"); 
                                    System.out.println("Result Exchange To Yen Jepang");
                                    dcikon = digit.format(konversi_rptojp);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Yen Jepang");

                            }          
                            else if (country == 5){
                                exchangeto = " Dollar Canada" ;
                                double rptocn = 0.000091770;
                                double konversi_rptocn = Math.floor(rupiah*rptocn);

                                    DecimalFormat digit = new DecimalFormat("0.00"); 
                                    System.out.println("Result Exchange To Dollar Canada ");
                                    dcikon = digit.format(konversi_rptocn);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Dollar Canada");

                            }      
                            else if (country == 6){
                                exchangeto = " Ringgit Malaysia" ;
                                double rptoml = 0.000287893;
                                double konversi_rptoml = Math.floor(rupiah*rptoml);

                                    DecimalFormat digit = new DecimalFormat("0.00"); 
                                    System.out.println("Result Exchange To Ringgit Malaysia ");
                                    dcikon = digit.format(konversi_rptoml);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Ringgit Malaysia");

                            }           
                            else if (country == 7){
                                exchangeto = " Dollar Selandia Baru" ;
                                double rptosb = 0.000100932;
                                double konversi_rptosb = Math.floor(rupiah*rptosb);

                                    DecimalFormat digit = new DecimalFormat(" 0.00"); 
                                    System.out.println("Result Exchange To Dollar Selandia Baru ");
                                    dcikon = digit.format(konversi_rptosb);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Dollar Selandia Baru");
                            }   
                            else if (country == 8){
                                exchangeto = " Dollar Singapura" ;
                                double rptosg = 0.000094511;
                                double konversi_rptosg = Math.floor(rupiah*rptosg);

                                    DecimalFormat digit = new DecimalFormat(" 0.00"); 
                                    System.out.println("Result Exchange To Dollar Singapura ");
                                    dcikon = digit.format(konversi_rptosg);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Dollar Singapura");
                            }        
                            else if (country == 9){
                                exchangeto = " Dollar Baru Taiwan" ;
                                double rptotw = 0.002005759;
                                double konversi_rptotw = Math.floor(rupiah*rptotw);

                                    DecimalFormat digit = new DecimalFormat(" 0.00"); 
                                    System.out.println("Result Exchange To Dollar Baru Taiwan ");
                                    dcikon = digit.format(konversi_rptotw);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Dollar Baru Taiwan");
                            }  
                            else if (country == 10){
                                exchangeto = " Baht Tahiland" ;
                                double rptoth = 0.002137363;
                                double konversi_rptoth = Math.floor(rupiah*rptoth);

                                    DecimalFormat digit = new DecimalFormat(" 0.00"); 
                                    System.out.println("Result Exchange To Baht Tahiland");
                                    dcikon = digit.format(konversi_rptoth);
                                    System.out.println("Rp."+rupiah+" :"+dcikon+" Baht Tahiland");
                            }      
                        if(country < 1 || country > 10){
                            System.out.println("\nChoose the available options!");
                        }
                        }while(country < 1 || country > 10);
                        do {
                            System.out.println("_________________________________________________________________\n" ); 
                            System.out.println("************************ PAYMENT  METHOD ************************");
                            System.out.println("1. Pay With Card (E-Money ");
                            System.out.print("Choose :  ");
                            pay = input.nextInt();
                            if(pay != 1){
                                System.out.println("\nChoose the available options!");
                            }
                        }while(pay != 1);
                        do{
                        System.out.println("_________________________________________________________________\n" ); 
                        System.out.println("***************************** STRUCK ****************************");
                        System.out.println("Nominal         : " + rupiah);
                        System.out.println("Result Excahnge :" + dcikon + exchangeto);
                        System.out.println("Charge          : +Rp.15.000");
                        System.out.println("Total           : " + ttl);
                        System.out.println("1. Done");
                        System.out.println("2. Exchange Again");
                        System.out.print("Choose :  ");
                        exchangeagain = input.nextInt();
                
                        }while(exchangeagain !=1 && exchangeagain !=2);

                    }while(exchangeagain == 2);  
                    System.out.println("*************************** THANK YOU ***************************");
                }
                else if(choose.equals("2")){
                    System.out.println("*************************** THANK YOU ***************************");
                    break;
                }
                else if(!choose.equals("2") || !choose.equals("1")){
                    System.out.println("\nChoose the available options!");
                }
            
        }while(!choose.equals("1"));
        
        
    }
    
}