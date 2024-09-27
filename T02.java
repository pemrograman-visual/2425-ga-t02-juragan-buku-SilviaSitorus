// 12S24004 - Silvia Eklesiana Br. Sitorus
// 12s24032 - Angga B. P. Sianipar

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, keterangan;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        int tahun;

        tahun = Integer.parseInt(input.nextLine());
        String penerbit;

        penerbit = input.nextLine();
        String format;

        format = input.nextLine();
        double harga, margin;

        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        int stock;

        stock = Integer.parseInt(input.nextLine());
        double rating;

        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            keterangan = "Best Pick";
        } else {
            if (rating >= 4.5) {
                keterangan = "Must Read";
            } else {
                if (rating >= 4.0) {
                    keterangan = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        keterangan = "Average";
                    } else {
                        if (rating < 3.0) {
                            keterangan = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stock + "|" + toFixed(rating,1) + "|" + keterangan);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

