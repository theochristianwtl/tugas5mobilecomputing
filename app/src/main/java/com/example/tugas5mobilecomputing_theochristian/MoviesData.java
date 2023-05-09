package com.example.tugas5mobilecomputing_theochristian;

import java.util.ArrayList;

public class MoviesData {
    private static String[] movieNames = {
            "Spiderman : No Way Home",
            "Thor : Love and Thunder",
            "Shazam",
            "Guardians of The Galaxy 3",
            "Avengers : End Game",
    };

    private static String[] movieDetails = {
            "Pertama kalinya dalam sejarah layar lebar Spider-Man, identitas asli dari pahlawan nan ramah ini terbongkar, sehingga membuat tanggung jawabnya sebagai seorang berkekuatan super berbenturan dengan kehidupan normalnya, dan menempatkan semua orang terdekatnya dalam posisi paling terancam.",
            "Menceritakan Thor dalam sebuah perjalanan yang belum pernah ia jalani – pencarian kedamaian batin. Namun, masa pensiunnya terganggu oleh seorang pembunuh galaksi yang dikenal sebagai Gorr sang Dewa Jagal , yang ingin memusnahkan para dewa.",
            "Ketika Putri-Putri Dewa Atlas, trio penuh dendam dari dunia para dewa kuno, tiba di Bumi untuk mencari kekuatan magis yang dicuri dari mereka di masa silam, Billyalias Shazambeserta keluarganya terseret dalam pertarungan yang mempertaruhkan kekuatan super dan nyawa mereka, serta kelangsungan dunia tempat mereka hidup.",
            "Melanjutkan kisah petualangan Peter Quill/Star Lord (Chris Pratt) dan teman-temannya sebagai penjaga galaksi.Masih berduka karena kehilangan Gamora (Zoe Saldana), Peter mengumpulkan timnya untuk kembali melindungi alam semesta. Misi kali ini tidaklah mudah, jika tidak berhasil, maka akan menjadi akhir bagi para Guardians.",
            "Melanjutkan Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?"
    };

    private static int[] movieImages = {
            R.drawable.spiderman,
            R.drawable.thor,
            R.drawable.shazam,
            R.drawable.gotg3,
            R.drawable.endgame,
    };

    static ArrayList<MovieModel> getListData(){
        ArrayList<MovieModel> list = new ArrayList<>();
        for (int position = 0; position < movieNames.length; position++){
            MovieModel moviemodel = new MovieModel();
            moviemodel.setName(movieNames[position]);
            moviemodel.setDetail(movieDetails[position]);
            moviemodel.setPhoto(movieImages[position]);
            list.add(moviemodel);
        }
        return list;
    }
}
