public class Tes {
    public static void main(String[] args) {
        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);

        Truk truk2 = new Truk();
        truk2.setJmlRoda(6);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);

        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        Taksi taksi2 = new Taksi();
        taksi2.setJmlRoda(4);
        taksi2.setWarna("biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);

        Sepeda sepeda1 = new Sepeda();
        sepeda1.setJmlRoda(3);
        sepeda1.setWarna("hitam");
        sepeda1.setJmlSadel(1);
        sepeda1.setJmlGir(2);

        Sepeda sepeda2 = new Sepeda();
        sepeda2.setJmlRoda(2);
        sepeda2.setWarna("putih");
        sepeda2.setJmlSadel(2);
        sepeda2.setJmlGir(5);

        System.out.println("Data Truk 1:");
        System.out.println("Jumlah Roda: " + truk1.getJmlRoda());
        System.out.println("Warna: " + truk1.getWarna());
        System.out.println("Bahan Bakar: " + truk1.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk1.getKapasitasMesin());
        System.out.println("Muatan Maks: " + truk1.getMuatanMaks());
        System.out.println();

        System.out.println("Data Truk 2:");
        System.out.println("Jumlah Roda: " + truk2.getJmlRoda());
        System.out.println("Warna: " + truk2.getWarna());
        System.out.println("Bahan Bakar: " + truk2.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk2.getKapasitasMesin());
        System.out.println("Muatan Maks: " + truk2.getMuatanMaks());
        System.out.println();

        System.out.println("Data Taksi 1:");
        System.out.println("Jumlah Roda: " + taksi1.getJmlRoda());
        System.out.println("Warna: " + taksi1.getWarna());
        System.out.println("Bahan Bakar: " + taksi1.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + taksi1.getKapasitasMesin());
        System.out.println("Tarif Awal: " + taksi1.getTarifAwal());
        System.out.println("Tarif per Km: " + taksi1.getTarifPerKm());
        System.out.println();

        System.out.println("Data Taksi 2:");
        System.out.println("Jumlah Roda: " + taksi2.getJmlRoda());
        System.out.println("Warna: " + taksi2.getWarna());
        System.out.println("Bahan Bakar: " + taksi2.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + taksi2.getKapasitasMesin());
        System.out.println("Tarif Awal: " + taksi2.getTarifAwal());
        System.out.println("Tarif per Km: " + taksi2.getTarifPerKm());
        System.out.println();

        System.out.println("Data Sepeda 1:");
        System.out.println("Jumlah Roda: " + sepeda1.getJmlRoda());
        System.out.println("Warna: " + sepeda1.getWarna());
        System.out.println("Jumlah Sadel: " + sepeda1.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepeda1.getJmlGir());
        System.out.println();

        System.out.println("Data Sepeda 2:");
        System.out.println("Jumlah Roda: " + sepeda2.getJmlRoda());
        System.out.println("Warna: " + sepeda2.getWarna());
        System.out.println("Jumlah Sadel: " + sepeda2.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepeda2.getJmlGir());
    }
}
