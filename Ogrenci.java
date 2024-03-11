public class Ogrenci {
    private String ogrenciNo;
    private int girisYili;
    private String ad;
    private String bolum;
    private double gano;
    private int bolumKodu=10400;
    public Ogrenci(String ad , String bolum){
        this.ad=ad;
        this.bolum=bolum;
    }
    public Ogrenci(int girisYili , double gano){
        this.girisYili=girisYili;
        if (gano<0 || gano>4){
            throw new IllegalArgumentException("Girilen not geçersiz!");
        } else {
            this.gano = gano;
        }
    }
    public Ogrenci(String ad , String bolum , int girisYili , double gano){
        this.ad = ad;
        this.bolum = bolum;
        if (gano<0 || gano>4){
            throw new IllegalArgumentException("Girilen not geçersiz!");
        }
            this.gano = gano;
            this.girisYili = girisYili;

    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }
    public double harcHesapla(int derssayisi){
        return derssayisi*80;
    }
    public double harcHesapla(int derssayisi , double dersucreti){
        return derssayisi*dersucreti;
    }
    public String ogrenciNo(){
        return this.ogrenciNo = (girisYili + "" + bolumKodu + 001);
    }
    public double GanoHesaplama(double gano){
        if (gano<0 || gano >4){
            throw new IllegalArgumentException("Bu nota ait öğrenci bulunamamıştır.");
        }
        return gano;
    }
}
