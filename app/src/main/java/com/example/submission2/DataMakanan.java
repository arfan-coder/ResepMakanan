package com.example.submission2;

import android.content.Intent;

import java.util.ArrayList;

public class DataMakanan {

    private static String[] FoodNames = {
            "nasi goreng",
            "Mie Goreng",
            "Mie Rebus",
            "Ketoprak",
            "Telor Dadar",
            "Telor Ceplok",
            "Kerak Telor",
            "Ayam Goreng",
            "Rujak",
            "Burger",
            "Sayur Bayam"
    };

    private static String[] FoodInstruction = {
            "Pertama tama, Kita masukkan minyak ke penggorengan, dan panaskan minyaknya. setelah itu potong dan masukkan Bawang putih atau Bawang Merah ke dalam penggorengan dengan minyaknya. Lalu aduk sampai baunya sudah mulai sedap. setelah itu, masukkan Nasi putih dan tambahkan kecap dan garam ke dalam nasinya. Tambahkan telor lalu aduk sampai rata. Nasi Goreng sudah siap untuk disajikan dan dimakan ",
            "Pertama tama, kita ambil air bersih lalu panaskan di dalam panci.Lalu kita masukkan Mie ke dalam air yang sudah mendidih. Tunggu sampai mie-nya sudah berpisah dan sudah mulai tidak keras. Selama menuggu mie-nya selesai, siapkan mangkuk dan masukkan bumbu yang ada di dalam kemasan mie tersebut.Setelah itu angkat dan pisahkan air dengan mie-nya (disaring). aduk sampai rata. dan mie sudah siap untuk di makan",
            "Pertama tama, kita ambil air bersih lalu panaskan di dalam panci.Lalu kita masukkan Mie ke dalam air yang sudah mendidih. Tunggu sampai mie-nya sudah berpisah dan sudah mulai tidak keras. Selama menuggu mie-nya selesai, siapkan mangkuk dan masukkan bumbu yang ada di dalam kemasan mie tersebut.Setelah itu angkat dan pisahkan air dengan mie-nya (disaring) dan masukkan air bersih yang lain kedalam mangkuknya aduk sampai rata. dan mie sudah siap untuk di makan",
            "masukkan air yang sedikit,kacang,dan beberapa bumbu penyedap lalu aduk sampai rata. lalu masukkan lontong,mie,dan bahan lainnya kedalam-nya. aduk sampai rata dan ketoprak sudah siap di sajikan",
            "panaskan penggorengan lalu pecahkan telur dan masukkan ke dalam penggorengan yang sudah panas. tunggu beberapa saat. Lalu balik telurnya. angkat, dan telur sudah siap dimakan",
            "panaskan penggorengan lalu pecahkan telur dan msukkan ke dalam mangkuk dan aduk sampai kunignnya telur rata, tambahkan garam, lalu masukkan telur-nya ke dalam penggorengan yang sudah panas. tunggu untuk beberapa saat dan balik. Angkat,dan telur pun sudah siap untuk di makan",
            "Panaskan minyak. Tumis bumbu halus sampai harum. Rendam beras ketan putih dan air semalam. Tiriskan. Panaskan wajan cekung. Beri 1 1/2 sendok makan beras ketan putih. Siram dengan 3 sendok makan air rendaman beras. Biarkan sampai setengah kering. Kocok 1 butir telur bebek, 1/2 sendok teh bumbu halus, 1/2 sendok teh ebi, 1/2 sendok makan bawang merah goreng, 1/8 sendok teh garam, dan 1 /8 sendok teh gula pasir. Siram ke atas ketan. Aduk-aduk sambil diratakan di penggorengan. Biarkan sampai matang sambil ditutup. Batik penggorengan di atas bara api. Biarkan sampai matang. Angkat. Tabur kelapa sangrai dan bawang merah goreng.",
            "Sediakan Ayam yang sudah diberi bumbu (Biasanya sudah ada di pasar). Lalu panaskan wajan dengan minyak 1/2 dari wajannya. lalu setelah panas, masukkan ayam yang sudah ada bumbu. Tunggu sebentar. Angkat, dan saring ayam sampai minyaknya sudah tidak ada. Ayam pun siap untuk dimakan",
            "Siapkan beberapa Buah (apa saja). Lalu hancurkan dan aduk buah - buah tersebut sampai rata. Setelah itu rujak sudah diap untuk di makan",
            "Siapkan daging dan masak daging tersebut. lalu cuci sayurannya dan 2 buah roti. gabungkan semua bahan tersebut dan tambahkan saus sambbal/ saus tomat. Burger pun sudah jadi dan sudah siap dimakan",
            "Siapkan Panci dan masukkan air bersih dan panaskan air tersebut sampai rata. selama menuggu air-nya mendidih potong, dan cuci sayuran yang sudah di beli atau disiapkan. lalu masukkan semua sayuran ke dalam panci yang sudah di panaskan airnya aduk sampai rata dan masukkan semua beserta airnya ke dalam tempat untuk menyimpan sayuran. sayuran pun sudah siap untuk dimakan",
    };

    private static int [] photo = {
            R.drawable.nasi_goreng,
            R.drawable.mie,
            R.drawable.mie_rebus,
            R.drawable.ketoprak,
            R.drawable.telur_dadar,
            R.drawable.telur_ceplok,
            R.drawable.kerak_telor,
            R.drawable.ayam_goreng,
            R.drawable.rujak,
            R.drawable.burger,
            R.drawable.sayur_bayam
    };

    static ArrayList<Food> GetFoodData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position <FoodNames.length; position++) {
            Food food = new Food();
            food.setName(FoodNames[position]);
            food.setDetails(FoodInstruction[position]);
            food.setPhoto(photo[position]);
            list.add(food);
        }
        return list;
    }
}
