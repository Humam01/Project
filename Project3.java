/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project3;

/**
 *
 * @author user
 */
public class Project3 {

     public Double RpToUSD(Double inp) {
        Double kurs = 0.000071;
        return inp * kurs;
    }
    public Double RpToUSG(Double inp) {
        Double kurs = 0.000095;
        return inp * kurs;
    }
    public Double RpToYen(Double inp){
    Double kurs = 0.0081;
    return inp * kurs;
}
    public  Double RpToRiyal(Double inp){
        Double kurs = 0.00027;
        return  inp * kurs;
    }
    
    public  Double RpToEuro(Double inp){
        Double kurs = 0.000061;
        return inp * kurs;
    }
   
    public  Double RpToRinggit(Double inp){
        Double kurs = 0.00029;
        return  inp * kurs;
    }
    
    public Double RpToYuan(Double inp) {
        Double kurs = 0.00045;
        return inp * kurs;
    }
    
    public  Double RpToWon(Double inp) {
        Double kurs = 0.083;
        return inp * kurs;
    }
    
    public  Double RpToKyat(Double inp){
    
        Double kurs = 0.13;
        return inp * kurs;
    }
    
    public Double RpToRupee(Double inp){
    
        Double kurs = 0.0053;
        return inp * kurs;
    }
    
    
     public Double USDToRP(Double inp) {
        Double kurs = 14105.25;
        return inp * kurs;
    }
    
    public  Double USGToRp(Double inp){
        Double kurs = 10500.00;
        return inp * kurs;
    }

    public Double YenToRp( Double inp){
        Double kurs = 123.94;
        return inp * kurs;
    }
    
    public  Double RiyalToRp(Double inp){
        Double kurs = 3769.76;
        return  inp * kurs;
    }
    
    public  Double EuroToRp(Double inp){
        Double kurs = 16463.24;
        return inp*kurs;
    }
    
    public  Double RinggitToRp(Double inp){
        Double kurs = 3405.19;
        return inp * kurs;
    }
    
    public Double YuanToRp(Double inp){
        Double kurs = 2210.12;
        return inp * kurs;
    }
    
    public Double  WonToRp(Double inp){
        Double kurs = 12.01;
        return inp * kurs;
    }
    
    public  Double KyatToRp (Double inp){
        Double kurs = 7.54;
        return inp * kurs;
    }
    
    public  Double RupeeToRp(Double inp){
        Double kurs = 188.77;
        return inp * kurs;
    }
    
    
    
    public static void main(String[] args)
    {
        Project3 ku = new Project3();
        Double rupiahnya = 300000.0;
        System.out.println(ku.RpToUSD(rupiahnya));
        
        rupiahnya = 20000.0;
        System.out.println(ku.RpToUSG(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToYen(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToRiyal(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToEuro(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToRinggit(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToYuan(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToWon(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToKyat(rupiahnya));
        
        rupiahnya = 300000.0;
        System.out.println(ku.RpToRupee(rupiahnya));
        
        Double usdnya = 1.0;
        System.out.println(" USD =" + ku.USDToRP(usdnya));
        
        Double usgnya = 1.0;
        System.out.println(" USG =" + ku.USGToRp(usgnya));
        
        Double yennya = 1.0;
        System.out.println(" Yen =" + ku.YenToRp(yennya));
        
        Double riyalnya = 1.0;
        System.out.println(" Riyal =" + ku.RiyalToRp(riyalnya));
        
        Double euronya = 1.0;
        System.out.println(" Euro =" + ku.EuroToRp(euronya));
        
        Double ringgitnya = 1.0;
        System.out.println(" Ringgit =" + ku.RinggitToRp(ringgitnya));
        
        Double yuannya = 1.0;
        System.out.println(" Yuan =" + ku.YuanToRp(yuannya));
        
        Double wonnya = 1.0;
        System.out.println(" Won =" + ku.WonToRp(wonnya));
        
        Double kyatnya = 1.0;
        System.out.println(" Kyat =" +ku.KyatToRp(kyatnya));
        
        Double rupeenya = 1.0;
        System.out.println(" Rupee =" + ku.RupeeToRp(rupeenya));
        
        System.err.println("Ini Baru");

        System.out.println("ini dari airgg");
        System.out.println("ini dari airgg2");
        System.out.println("ini dari zzzzzzzzz");
    }
    
}
