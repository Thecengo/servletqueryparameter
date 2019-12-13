public class Person {

    private String ad;
    private String soyad;

    public Person(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public Person( ) {

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
