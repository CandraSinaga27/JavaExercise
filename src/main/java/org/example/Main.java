package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Nama saya Candra");
        System.out.println("ini tanpa spasi");

        boolean flag;
        for (int i=1; i<=5; i++){
            System.out.println("i = " + i);
        }
        //Data type and variable
        int a = 10;
        int b = 2;
        float c=3;
        String nama= "Farah";
        char q = 'Y';
        boolean flag2 = false;

        //arithmathic operation
        int result = a / b;
        int result2 = (int) (a/c); //1 int dibagi 1 float -> hirarki float lebih tinggi (hasilnya float)
        float result3=a/c; //10 dibagi 3
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        //if, else, else-if
        int timeStart=8;
        int timeFinish=17;
        int waktuMasuk=7;
        int waktuPulang = 15;

        //karyawan yang masuk tepat waktu dan pulang tepat waktu atau lebih lama, diselamatin
        if(waktuMasuk <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Selamat anda masuk tepat waktu");
            System.out.println("Anda Sampai " + (timeStart - waktuMasuk) + " jam lebih cepat");
            //karyawan yang masuk tepat waktu, pulang duluan, dicengin
        }else if (waktuMasuk <= timeStart && waktuPulang <= timeFinish){
            System.out.println("Yeu pulang duluan");
            // karyawan yang telat masuk, tapi pulang lebih lama atau tepat waktu, dimaafkan
        } else if (waktuMasuk >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("dimaafin telat");
            // karyawan yang telat masuk, pulang duluan disoraki
        }else { 
            System.out.println("Yeu telat");
            System.out.println("Anda Sampai " + (waktuMasuk - timeStart) + " jam lebih lama");
        }

        int day = 3;
        switch (day){
            case 1:
                System.out.println("saya WFO");
                break;
            case 2:
                System.out.println("saya cuti");
                break;
            case 3:
                System.out.println("saya WFH");
                break;
            default:
                System.out.println("saya ga kerja alias nganggur");
                break;
        }
    }
}